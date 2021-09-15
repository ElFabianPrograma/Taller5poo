/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6poo;

/**
 *
 * @author Luis Fabian
 */
public class Instanciarpersona {
    
    public static void main(String[] args) {
        
        //persona1
        Persona p1 = new Persona ();
        
        Fecha fecha1=new Fecha();
        Dirección dirdomia=new Dirección();
        Dirección dirtra1=new Dirección();
        p1.setFechanaci(fecha1);
        p1.setDirecdomicilio(dirdomia);
        p1.setDirectrabajo(dirtra1);
        p1.imprimirdatos();
        
        //persona2
        Persona p2 = new Persona ("Daniel", "Cotes");
        
        Fecha fecha2=new Fecha(1993);
        Dirección dirdomi2=new Dirección("Oeste");
        Dirección dirtra2=new Dirección("Este");
        p2.setFechanaci(fecha2);
        p2.setDirecdomicilio(dirdomi2);
        p2.setDirectrabajo(dirtra2);
        p2.imprimirdatos();
        
        //persona3
        Persona p3 = new Persona ("F");
        Fecha fecha3=new Fecha(8,20);
        Dirección dirdomi3=new Dirección("Don Real", "La pulla");
        Dirección dirtra3=new Dirección("Don Comelo", "La Guita");
        p3.setFechanaci(fecha3);
        p3.setDirecdomicilio(dirdomi3);
        p3.setDirectrabajo(dirtra3);
        p3.imprimirdatos();
        
    } 
}