/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplolista.modelo.controller;

import com.mycompany.ejemplolista.pojo.Candidato;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *@author Hernan Hernandez
 * @author Camilo Alvarez
 */
public class Controlador {

    /**
     * se crea constructor vacio 
     */
    public Controlador() {
    }

    /**
     * Metodo que sirve para sumarle un voto al postulado
     * @param candidato
     * @param candidatos
     * @return
     * @throws Exception 
     */
    public String votar(Candidato candidato, List<Candidato> candidatos) throws Exception {
        for (Candidato c : (ArrayList<Candidato>) candidatos) {
            if (c.equals(candidato)) {
                c.setVotos(c.getVotos() + 1);
                String msg = "Has votado por: " + c.getNombre()
                        + " " + c.getApellido() + ". Total votos: " + c.getVotos();
                return msg;
            }
        }
        return "";
    }
    /**
     * Metodo que sirve para identificar que el postulado no este repetido 
     * @param candidato
     * @param candidatos
     * @return
     * @throws Exception 
     */

    public boolean agregarCandidato(Candidato candidato, List<Candidato> candidatos) throws Exception {
        for (Candidato c : (ArrayList<Candidato>) candidatos) {
            if (Objects.equals(c.getCedula(), candidato.getCedula())) {
                throw new Exception("El candidato que desea regiatrar ya existe");
            }
        }
        return true;
    }
}
