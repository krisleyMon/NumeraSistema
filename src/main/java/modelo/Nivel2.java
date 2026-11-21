/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author krisl
 */
public class Nivel2 extends Niveles {

    public Nivel2() {
        super(2,5);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}//Fin de la clase       

