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
public class Nivel3  extends Niveles{

    public Nivel3() {
        setNumero(3); //Nivel 3
        setCantidadEjercicios(6);
    }

    
    @Override
    public String getDificultad() {
       return "DIFÍCIL";
    }

    @Override
    public String getOperaciones() {
       return "MULTIPLICACIONES Y DIVISIONES";}

    @Override
    public boolean ValidarRespuesta(String respuesta) {
      
        return false;
      
    }
  
   
    
}//Fin de la clase       

  

