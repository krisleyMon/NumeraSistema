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
public class InfoPartida {

 private ArrayList<String> informacion = new ArrayList<>();

    public InfoPartida(Jugador jugador) {

        cargarInformacion(jugador);

    }

    // Carga la información de los tres niveles

    private void cargarInformacion(Jugador jugador) {

        informacion.add("¡PARTIDA FINALIZADA NIVEL1!"

                + "\nRacha de respuestas correctas:"+jugador.getRacha()
                +"\nTotal Puntos:"+jugador.getPuntos()
                +"\n Total de vidas de partida:"+jugador.getVidas()
        );
                
        
    }

    // Devuelve la información según el nivel

    public String obtenerInformacion(int posicion) {

        return informacion.get(posicion);   
    
    
    }  
    
}