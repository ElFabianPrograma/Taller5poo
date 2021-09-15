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
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        
        this.dia=19;
        this.mes=03;
        this.año=1998;
    }
    
    public Fecha(int año) {
        
        this.dia=17;
        this.mes=2;
        this.año=año;
    }
    
    
    public Fecha(int mes, int dia) {
        
        this.dia=dia;
        this.mes=mes;
        this.año=1987;
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}