/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.entyties;

import co.edu.uptc.servicios.dto.PersonaDTO;

/**
 *
 * @author TORRES
 */
public class Persona {
    
    private String nombres;
    private Integer apellidos;
    private Integer edad;
    private String observaciones;

    public Persona(PersonaDTO personaDTO) {
        this.nombres = personaDTO.getNombres();
        this.apellidos = personaDTO.getApellidos();
        this.edad = personaDTO.getEdad();
        this.observaciones = personaDTO.getObservaciones();
    }

    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getApellidos() {
        return apellidos;
    }

    public void setApellidos(Integer apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
