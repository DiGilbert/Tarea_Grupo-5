/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
* @author MaycoL_Moises_Erazo
 */
public class Deportista extends Persona {

    private String deporte_ejercido;
    private int años_de_carrera;
    
    
    
    public Deportista(){
    establecerNombre("Mike Moises Jordan");
    establecerEdad(32);
    EstablecerPaisOrigen("Brasil");
    establecerFecha_nacimiento("17 de Marzo de 1989");
   
    }
    public void EstablecerDeporte_ejercido(String deporte){
    this.deporte_ejercido=deporte; 
    
    
    }
    public String obtenerDeporte_ejercido(){
    return this.deporte_ejercido;
    
    }
    public void EstablecerAñosCarrera(int años_c){
    this.años_de_carrera=años_c; 
    
    
    }
    public int obtenerAñosCarrera(){
    return this.años_de_carrera;
    
    }
    
    
    @Override
   public String obtenerInformacionPersona() {
     return "Datos de Deportista destacado";
   
     
    }
    public void ImprimirInformacionDeportista(){
    
      System.out.println("Deporte que realizado: "+ deporte_ejercido);
      System.out.println("Años de carrera deportiva: "+ años_de_carrera);
   
   
    }
}
