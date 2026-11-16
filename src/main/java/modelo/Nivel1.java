/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author krisl
 */
public class  Nivel1 {
 //Arreglos   
private int[] respuestasCorrectas ={1,2,3,4,5};  
private int[] respuestasJugador = new int[5];
private ArrayList<String> preguntas = new ArrayList<>(){{
    add("Cuanto es 4+4?");
    add("Cunato es 9-5?");
    add("Cuanto es 7+3?");
    add("Cunato es 6-5?");
    add("Cunato es 8-5?");
    add("Cunato es 8-8?");
}};

private String[][] opciones = {
    {"9","8","5","2"},
    {"9","2","3","4"},
    {"10","5","3","6"},
    {"8","4","3","9"},
    {"2","3","7","0",}
};
private int[][] Intentos = new int[3][5];

//Atributos
private int numeroPreguntas;
private int aciertos;
private int puntosNivel;
    
//controlador
public Nivel1() {
     //Inicialisamos datos 
      numeroPreguntas =0;
      aciertos =0;
      puntosNivel=0;
  
}









}//Fin de la clase   


