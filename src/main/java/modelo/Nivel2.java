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

    //Arreglos 
    private String[] opciones;
//Atributos
    private String respuestasCorrectas;

//Constructor con parametros
    public Nivel2(String[] opciones, String respuestasCorrectas, String pregunta) {
        super(2, 5, pregunta);
        this.opciones = opciones;
        this.respuestasCorrectas = respuestasCorrectas;
        setPregunta(pregunta);
        desbloquear();
    }

    public Nivel2() {
        super(2, 5, "");
        desbloquear(); //Esto nos funciona para que el nivel1, salga desbloqueado desde el inicio
    }

    public String[] getOpciones(){
        return opciones;
    }
//Abstract
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
        return respuestasCorrectas.equals(respuesta);
    }
}       
