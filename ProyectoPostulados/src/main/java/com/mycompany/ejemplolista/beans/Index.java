/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplolista.beans;

import com.mycompany.ejemplolista.modelo.controller.Controlador;
import com.mycompany.ejemplolista.pojo.Candidato;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *@author Camilo Alvarez
 * @author Hernan Hernandez
 * Clase Bean del Index
 */
@ManagedBean
@RequestScoped
public class Index implements Serializable {

    /**
     *Objeto que trae los atributos de la clase pojo 
     */
    private Candidato candidato;

    /**
     *Etiqueta que sirve para  traer los datos de la Lista
     */
    @ManagedProperty("#{lista}")
    private Lista lista;

    

    /**
     * Constructor que trae el candidato
     */
    public Index() {
       
        candidato = new Candidato();
    }
    
    /**
     * Metodo que sirve para guardar los datos de los postulados 
     */
    public void agregarCandidato() {
        Controlador controlador = new Controlador();
        try {
            if (controlador.agregarCandidato(candidato, lista.getCandidatos())) {
                lista.getCandidatos().add(candidato);
                System.out.println(lista.getCandidatos());
                FacesMessage msg = new FacesMessage("Aviso", "Candidato Guardado !!");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            }
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Aviso", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
    
    
    /**
     * Metodo que hace la variable publica
     */
    public Lista getLista() {
        return lista;
    }
    
    /**
     * Metodo que hace la variable publica
     */
    public void setLista(Lista lista) {
        this.lista = lista;
    }

    /**
     * Metodo que hace la variable publica
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * Metodo que hace la variable publica
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }



}
