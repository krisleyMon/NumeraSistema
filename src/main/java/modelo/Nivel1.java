/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author krisl
 */


public class Nivel1 extends Niveles{
 //Arreglos     

private String[] opciones;
//Atributos
private String respuestasCorrectas;

    
//Constructor con parametros

    public Nivel1(String[] opciones, String respuestasCorrectas, String pregunta) {
       super();
        this.opciones = opciones;
        this.respuestasCorrectas = respuestasCorrectas;
        setPregunta(pregunta);
    }



public Nivel1(){
        setNumero(1); //Nivel 1
        setCantidadEjercicios(5);
        desbloquear(); //Esto nos funciona para que el nivel1, salga desbloqueado desde el inicio
    }//Fin metodo

    public String[] getOpciones() {
        return opciones;
    }
    

//Abstract
    @Override
    public String getDificultad() {
        return "FÁCIL";
    }

    @Override
    public String getOperaciones() {
        return "SUMAS Y RESTAS";
    }

    @Override
    public boolean ValidarRespuesta(String respuesta) {
        return respuestasCorrectas.equals(respuesta);
    }

    

    



}//Fin de la clase   
