/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplolista.beans;

import com.mycompany.ejemplolista.modelo.controller.Controlador;
import com.mycompany.ejemplolista.pojo.Candidato;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 * @author Hernan Hernandez
 * @author Camilo Alvarez
 */
@ManagedBean
@ViewScoped
public class Votaciones implements Serializable {

    /**
     *Etiqueta que sirve para traer los datos de otros bean 
     */
    @ManagedProperty(value = "#{lista}")
    private Lista lista;

    /**
     *Trae los datos del pojo 
     */
    private Candidato candidato;

    /**
     * Creates a new instance of Votaciones
     */
    public Votaciones() {
    }
    
    /**
     * evento que sirve para votar por un candidato 
     */
    public void onRowSelect(SelectEvent event) {
        Controlador controlador = new Controlador();
        Candidato c = ((Candidato) event.getObject());
        try {
            String infoVoto = controlador.votar(c, lista.getCandidatos());
            FacesMessage msg = new FacesMessage("Aviso", infoVoto);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Aviso", "Ha ocurrido un error al procesar tu voto");
            System.err.println(e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }

    }
    
     /**
     * metodo que sirve para hacer la variable pubica
     */
    public Lista getLista() {
        return lista;
    }

     /**
     * metodo que sirve para hacer la variable pubica
     */
    public void setLista(Lista lista) {
        this.lista = lista;
    }

     /**
     * metodo que sirve para hacer la variable pubica
     */
    public Candidato getCandidato() {
        return candidato;
    }

     /**
     * metodo que sirve para hacer la variable pubica
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }



}
