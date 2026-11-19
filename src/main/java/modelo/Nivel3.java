/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author krisl
 */
public class Nivel3 extends Niveles {

    public Nivel3() {
        super(2, 5); //Número de nivel 2 y cantidad de ejercicios 5
    }

    @Override
    public String getDificultad() {
        return "DIFÍCIL";
    }

    @Override
    public String getOperaciones() {
        return "SUMA, RESTA, MULTIPLICACIONES Y DIVISIONES";
    }

}//Fin de la clase       

