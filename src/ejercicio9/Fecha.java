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
