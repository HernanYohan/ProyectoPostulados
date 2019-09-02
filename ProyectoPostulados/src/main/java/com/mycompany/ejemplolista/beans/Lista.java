/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplolista.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *@author Hernan Hernandez
 * @author Camilo Alvarez
 */
@ManagedBean
@SessionScoped
public class Lista implements Serializable {

    /**
     * Se crea la lista donde se guardan los postulados
     */
    private List candidatos;

    /**
     * Creates a new instance of Lista
     */
    public Lista() {
        candidatos = new ArrayList<>();
    }
    /**
     * metodo que sirve para hacer la variable pubica
     */
    public List getCandidatos() {
        return candidatos;
    }
    /**
     * metodo que sirve para hacer la variable pubica
     */
    public void setCandidatos(List candidatos) {
        this.candidatos = candidatos;
    }
    
}
