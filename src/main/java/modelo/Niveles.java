/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * <<<<<<< HEAD
 * @a
 *
 * uthor Heyerick-PC
 */
public abstract class Niveles {

    //Atributos
    private String tipoNivel;
    private String tipoDificultad;
    private int puntos;

    //Constructor sin parametros 
    public Niveles() {    
    }

    //Constructor con parametros
    public Niveles(String tipoNivel, String tipoDificultad, int puntos) {
        this.tipoNivel = tipoNivel;
        this.tipoDificultad = tipoDificultad;
        this.puntos = puntos;
    }

    //Get y set
    public String getTipoNivel() {
        return tipoNivel;
    }

    public void setTipoNivel(String tipoNivel) {
        this.tipoNivel = tipoNivel;
    }

    public String getTipoDificultad() {
        return tipoDificultad;
    }

    public void setTipoDificultad(String tipoDificultad) {
        this.tipoDificultad = tipoDificultad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //Metodo abstracto
    public abstract void realizarEjercicios();

}//Fin de la clase
