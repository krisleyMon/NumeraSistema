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
public class Nivel2 extends Niveles{

    public Nivel2() {
        setNumero(2); //Nivel 2
        setCantidadEjercicios(5);
    }

    
    
    @Override
    public String getDificultad() {
    return "MEDIO";
    }

    @Override
    public String getOperaciones() {
    return "MULTIPLICACIONES";
    }



    @Override
    public boolean ValidarRespuesta(String respuesta) {
        
        return false;
        
    }
 


}//Fin de la clase       










