/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Heyerick-PC
 */
public class Piramide {
    
    //Quise trabajar con ArrayList, por si más adelante le queremos meter más de 3 niveles
    private ArrayList<Niveles> niveles = new ArrayList<>();

    public Piramide() {
        cargarNiveles();
    }
    
    //Esto ya carga los niveles, es mejor hacerlo en piramide
    private void cargarNiveles(){
        niveles.add(new Nivel1());
        niveles.add(new Nivel2());
        niveles.add(new Nivel3());
    }//Fin metodo
    
    //No entendí muy biene sto espero haberlo echo bien, me guíe con manglar
    public Niveles obtenerNivel(int numero){
        return niveles.get(numero -1);
    }//Fin metodo
    
    //Esto devuelve la cantidad de niveles de momento tenemos 3
    public int cantidadNiveles(){
        return niveles.size();
    }//Fin metodo
    
    //Esto llama al completado(), cuando el jugador termina un nivel
    public void completarNivel(int numero){
        niveles.get(numero -1).completado();
        /*Creo este if para que desbloee los niveles proximos, 
        es decir desbloquee el nivel 2, si se completo el 1, y el nivel 3 si se completo el 2*/
        if(numero < niveles.size()){
            niveles.get(numero).desbloquear();
        }//Fin if
    }//Fin metodo
    
    
    //Falta la parte de desbloquear o va en otro lado?
}//Fin de la clase
