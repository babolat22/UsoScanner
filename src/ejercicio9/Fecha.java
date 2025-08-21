/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

public class Fecha {
    private int dia;  // encapsulamiento // oculto
    private int mes;
    private int anio;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.dia;
        hash = 89 * hash + this.mes;
        hash = 89 * hash + this.anio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fecha other = (Fecha) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.anio != other.anio) {
            return false;
        }
        return true;
    }
    
    public Fecha(int d, int m, int anio) {
        dia = d;
        mes= m;
        this.anio=anio;
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
    
    public void setAnio(int valor) {
        this.anio=valor;
    }
    public int getAnio(){
        return this.anio;
    }
    
    public int calcularAnios(Fecha fc){
        return this.anio - fc.getAnio();  //  2024-2022
    }
    
    @Override
    public String toString(){
        return "Fecha>> " + dia +"/"+mes+"/"+anio;
    }
}
