/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author krisl
 */
public class Jugador {
   
 private String nombre;
 private int edad;
 private int vidas;
 private int puntos;
 private int nivelActual;

  //Inicializamos la informacion del jugador con la dstos iniciales  
 public Jugador(String nombre, int edad, int vidas, int puntos, int nivelActual) {
        this.nombre = nombre;
        this.edad = edad;
        this.vidas = 3;
        this.puntos = 0;
        this.nivelActual = 1;
    }

  //odtener informacion del jugador 
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getVidas() {
        return vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getNivelActual() {
        return nivelActual;
    }
 
 
    //modificar informacion del jugador 
    
    //suma una vida al jugador solo si las vidas que tiene son menos de tres 
    public void agregarvida(){
     if(vidas<3){
       vidas++;  
     }
 }//fin del metodo

 //Disminuye  la cantida de vidas solo si las vidas son mas de 0 
 public void quitarvida(){
  if(vidas>0){
      vidas--;
  }
     
     
 }//Fin del metodo
 
 //Agrega y acumula los puntos que odtenga el jugador luego de completar algun nivel.
 public void agregarPuntos (int cantidad){
  if(cantidad>0){
   puntos+=cantidad;
  }
 }//fin del metodo
 //Actualiza el nivel en el que se encuentra el usuario
 public void cambiarNivelJugador(int nivel){
     if(nivel >=1 && nivel<=3){
       nivelActual=nivel;
   }  
     
 }//fin del metodo 
    
}//Fin de la calse jugador
