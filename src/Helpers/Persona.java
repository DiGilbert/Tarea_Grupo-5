/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 @author Gilberto_Diaz_Chavez
 */
public abstract class Persona {
    
    public String nombre;  
    private String fecha_de_nacimiento;
    private int edad;
    private String pais_de_origen; 
    public Persona(){            
}
    
    
     public void establecerNombre(String nombre){
    this.nombre=nombre; 
    
    
    }
    public String obtenerNombre(){
    return this.nombre;
    
    }
      public void establecerEdad(int edad_){
    this.edad=edad_; 
    
    
    }
    public int obtenerEdad(){
    return this.edad;
    
    }
     public void establecerFecha_nacimiento(String f_nacimiento){
    this.fecha_de_nacimiento=f_nacimiento; 
        
    }
    public String obtenerFecha_nacimiento(){
    return this.fecha_de_nacimiento;
    
    }
    public void EstablecerPaisOrigen(String pais_or){
    this.pais_de_origen=pais_or; 
    
    
    }
    public String obtenerPaisOrigen(){
    return this.pais_de_origen;
    
    }
    public void imprimirInformacionP(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Pais de origen: "+ pais_de_origen);
         System.out.println("Fecha de nacimiento: "+ fecha_de_nacimiento);
    } 
     
    abstract String obtenerInformacionPersona();
    
    }

