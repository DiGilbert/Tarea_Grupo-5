/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *Alejandro Avila
 *
 */
public class Doctor extends Persona {

    
    private String institucion_universitaria;
    private String especialidad;
  
    private int años_de_experiencia;
    
    public Doctor(){
    establecerNombre("Mario Franco Solorzano");
    establecerEdad(36);
    EstablecerPaisOrigen("Cuba");
    establecerFecha_nacimiento("16 de Enero de 1985");
    }
    public void EstablecerInstitucion(String institucion){
    this.institucion_universitaria=institucion; 
    }
    public String obtenerInstitucion(){
    return this.institucion_universitaria;
    
    }
    public void EstablecerEspecialidad(String especialidad_){
    this.especialidad=especialidad_; 
    
    
    }
    public String obtenerEspecialidad(){
    return this.especialidad;
    
    }
     public void EstablecerAñosExperiencia(int años_experiencia){
    this.años_de_experiencia=años_experiencia; 
    
    
    }
    public int obtenerAñosExperiencia(){
    return this.años_de_experiencia;
    
    }
   public void ImprimirInformacionDoctor(){
    
      System.out.println("Institución Universitaria: "+ institucion_universitaria);
      System.out.println("Especialidad: "+ especialidad);
      System.out.println("Años de experiencia: "+años_de_experiencia);
     
   
    }
    
    @Override
  public  String obtenerInformacionPersona() {
       return "Datos de Doctor destacado";

     
    }
    
}
