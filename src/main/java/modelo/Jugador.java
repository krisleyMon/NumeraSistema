/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cisaa
 */
public class Jugador {
    
    //Atributos del Jugador
    private String nombre;
    private int edad;
    private boolean[] vidas;
    private int racha;
    private int nivelActual;
    
    //Contructir vacio 

    public Jugador() {
    }
    
    //Contructor con parametros 

    public Jugador(String nombre, int edad, boolean[] vidas, int racha, int nivelActual) {
        this.nombre = nombre;
        this.edad = edad;
        this.vidas = vidas;
        this.racha = racha;
        this.nivelActual = nivelActual;
    }
    
    //Sets y gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean[] getVidas() {
        return vidas;
    }

    public void setVidas(boolean[] vidas) {
        this.vidas = vidas;
    }

    public int getRacha() {
        return racha;
    }

    public void setRacha(int racha) {
        this.racha = racha;
    }

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    
    
}
