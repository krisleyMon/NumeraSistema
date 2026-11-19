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
public class Nivel1 extends Niveles {

    public Nivel1(){
        super(1, 5); //Número de nivel 1 y cantidad de ejercicios 5
        desbloquear(); //Esto nos funciona para que el nivel1, salga desbloqueado desde el inicio, nivel 2 y 3, no lo tienen
    }//Fin metodo
    

    //Abstract
    @Override
    public String getDificultad() {
        return "FÁCIL";
    }

    @Override
    public String getOperaciones() {
        return "SUMAS Y RESTAS";
    }


}//Fin de la clase   
