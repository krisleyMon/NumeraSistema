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
        setNumero(1); //Nivel 1
        setCantidadEjercicios(5);
        desbloquear(); //Esto nos funciona para que el nivel1, salga desbloqueado desde el inicio
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
