/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplolista.pojo;

import java.io.Serializable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author Hernan Hernandez
 * @author Camilo Alvarez
 */
public class Candidato  implements Serializable {
    
    /**
     * Variblae que guarda el numero de tarjeton 
     */
    @Min(1)
    private Integer cedula;
    
    /**
     * variable que guarda el nombre
     */
    @Size(min=2,max=30)
    private String nombre;
    
    /**
     * variable que guarda el apellido
     */
    @Size(min=2,max=30)
    private String apellido;
    
    /**
     * Variable que guarda el numero de votos 
     */
    private Integer votos;
    
    /**
     * variable que guarda la foto del aspirante
     */
    private String foto;

    /**
     * Contructor donde se iguala votos a 0
     */
    public Candidato() {
        this.votos = 0;
    }

    /**
     * contructor donde se inicalizan las variables 
     * @param cedula
     * @param nombre
     * @param apellido
     * @param foto 
     */
    public Candidato(Integer cedula, String nombre, String apellido, String foto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
        this.votos = 0;
    }
    
    /**
     * metodo que sirve para volver la variable publica 
     */

    public String getFoto() {
        return foto;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * metodo que sirve para volver la variable publica 
     */
    public String getApellido() {
        return apellido;
    }
   

    /**
     * metodo que sirve para volver la variable publica 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    /**
     * metodo que sirve para volver la variable publica 
     */
    public Integer getVotos() {
        return votos;
    }
    
    /**
     * metodo que sirve para volver la variable publica 
     */
    public void setVotos(Integer votos) {
        this.votos = votos;
    }
    
}
