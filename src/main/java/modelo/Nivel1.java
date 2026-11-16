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

    //Arreglos   
    private int[] respuestasCorrectas = {8, 4, 10, 1, 3, 0};
    private int numeroPreguntas = 0;
    private int aciertos = 0;
    
    private ArrayList<String> preguntas = new ArrayList<>() {
        {
            add("Cuanto es 4+4?");
            add("Cuanto es 9-5?");
            add("Cuanto es 7+3?");
            add("Cuanto es 6-5?");
            add("Cuanto es 8-5?");
            add("Cuanto es 8-8?");
        }
    };

    private String[][] opciones = {
        {"9", "8", "5", "2"},
        {"9", "2", "3", "4"},
        {"10", "5", "3", "6"},
        {"8", "4", "3", "9"},
        {"2", "3", "7", "0",}
    };
    
    //Esto es de kris y dice que son los intentos que tiene el jugador
    private int[][] Intentos = new int[3][5];

    
    //Objeto jugador esto se usa en constructor y hace el llamado en la clase jugador
    private Jugador jugador;
    
//Constructor
    public Nivel1(Jugador jugador) {
        this.jugador = jugador;
        
        //Inicialisamos datos 
        setTipoNivel("Nivel 1");
        setTipoDificultad("Fácil");
    }//Fin del constructor
    
    
    
    
    
    
    
    
   
    
    //Obtener pregunta y diferentes opciones
    
    @Override 
    public void realizarEjercicios() {
        
        //Comprobación de la respuesta
        
        //if (respuesta == respuestasCorrectas[numeroPreguntas]){
            aciertos++;  
            
            //Esto es para que al jugador se le sumen 5pts por respuestas correctas, (aciertos)
            jugador.agregarPuntos(5);
            
        //}//Fin del if 
        
        }//Fin @Override 
    

}//Fin de la clase   