/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.servicios;

import co.edu.uptc.entyties.Persona;
import co.edu.uptc.servicios.dto.PersonaDTO;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author TORRES
 */
@Path("servicios")
public class Servicios {
    
    private PersonaDTO persona;
    
    @POST
    public PersonaDTO guardarPersona(PersonaDTO persona){
        String observaciones = persona.getNombres() +" "+ persona.getApellidos() +" tiene "+ persona.getEdad()+" años";
        persona.setObservaciones(observaciones);
        this.persona = persona;
        return this.persona;
    } 
    
    @GET
    public PersonaDTO cargarPersona(){
        return this.persona;
    } 
}
