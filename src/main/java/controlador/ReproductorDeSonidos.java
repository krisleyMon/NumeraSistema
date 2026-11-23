/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



import java.io.InputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author krisl
 */
public class ReproductorDeSonidos {

   
    
    
    public static void reproducirSonidos(String sonidos) {
        Runnable sonido = new Runnable() {
            @Override
            public void run() {

                try (InputStream audio = ReproductorDeSonidos.class.getResourceAsStream("/sonidos/" + sonidos)) {

                    if (audio == null) {
                        System.out.println("sonidos no encontrados" + sonidos);
                        return;
                    }
                    //Reproducir el audio Archivo mp3   
                    Player reproductor = new Player(audio);
                    reproductor.play();

                } catch (Exception e) {
                    System.out.println("error de sonido" + e.getMessage());
                }

            }

        };

        Thread hilo = new Thread(sonido);
        hilo.start();
    }

    public static void reproductorMusica(String sonidos) {

        Runnable musica = new Runnable() {
            @Override
            public void run() {
                //Reproduce la musica mientras este activa
                while (!Thread.currentThread().isInterrupted()) {
                    try (InputStream audio = ReproductorDeSonidos.class.getResourceAsStream("/sonidos/" + sonidos)) {
                        if (audio == null) {
                            System.out.println("sonidos no encontrados" + sonidos);
                            return;
                        }
                        //Se crea otra vez el reproductor de audio
                        Player reproductor = new Player(audio);
                        //Reproducimos la musica ambiente
                        reproductor.play();
                    } catch (Exception e) {
                        System.out.println("error de sonido" + e.getMessage());
                    }

                }

            }
        };
//Creamos el hilo
        Thread hilo = new Thread(musica);
        hilo.setDaemon(true);
        hilo.start();
        

    } 
    
   
}
    
    
    
    

