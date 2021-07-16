/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Helpers.Deportista;
import Helpers.Doctor;

/**
 *
 * @author MaycoL_Moises_Erazo
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Deportista depor= new Deportista();
       
        System.out.println(depor.obtenerInformacionPersona());
        System.out.println("\n");
        depor.imprimirInformacionP();
        depor.EstablecerDeporte_ejercido("Tennis");
        depor.EstablecerAñosCarrera(4);
 
        depor.ImprimirInformacionDeportista();
        
        System.out.println("\n");
        Doctor doc= new Doctor();
               
        System.out.println(doc.obtenerInformacionPersona());
        System.out.println("\n");
        doc.imprimirInformacionP();
        doc.EstablecerInstitucion("Universidad de Ciencias Médicas de la Habana");
        doc.EstablecerEspecialidad("Odontología");
        doc.EstablecerAñosExperiencia(8);
        doc.ImprimirInformacionDoctor();
        
    }
    
}
