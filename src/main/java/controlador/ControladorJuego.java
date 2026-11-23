/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.BancoPreguntas;
import modelo.Jugador;
import modelo.Nivel1;
import modelo.Niveles;
import modelo.Piramide;
import vista.GUI_Juego;
import vista.GUI_Portada;
import controlador.ReproductorDeSonidos;
import vista.GUI_Resultados;
/**
 *
 * @author cisaa
 */
public class ControladorJuego implements ActionListener {

    private GUI_Juego vistaJuego;
    private GUI_Portada vista;
    private BancoPreguntas banco;
    private Niveles preguntaActual;
    private Piramide piramide;
    private Jugador jugador;
    private int nivelActual = 0; //0 es igual al nivel1
    private int numeroPregunta = 0; //0 es igual al apregunta número 1
    private boolean preguntaRespondida = false; //Esto para que cada pregunta inicie en falsa

    public ControladorJuego(GUI_Juego vistaJuego, GUI_Portada vista) {
        this.vistaJuego = vistaJuego;
        this.vista = vista;
        banco = new BancoPreguntas();
        jugador = new Jugador("JUGADOR", 0, 3, 0, 1);
        piramide = new Piramide();
        //Falta para pedir nombre

        vistaJuego.addButtonListener(this);
        cargarPregunta();
    }//Fin constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();
        switch (op) {
            case "MENU": //Menú
                volverMenu();
                break;
             case "SIGUIENTE":
                siguientePregunta();
                break;
            case "ANTERIOR":
               PreguntaAnterior();
                break;
            
            case "OP1": //Opciones
                responder(vistaJuego.obtenerRespuestaMultiple(1));
                break;
            case "OP2":
                responder(vistaJuego.obtenerRespuestaMultiple(2));
                break;
            case "OP3":
                responder(vistaJuego.obtenerRespuestaMultiple(3));
                break;
            case "OP4":
                responder(vistaJuego.obtenerRespuestaMultiple(4));
                break;
          
        
        }//Fin switch
    }//Fin metodo

    public void volverMenu() {
        vistaJuego.dispose();
        vista.setVisible(true);
    }//Fin metodo

    private void responder(String respuesta) {
        //Esto nos ayuda a evitar la misma pregunta
        if (preguntaRespondida || respuesta.isEmpty()) {
            return;
        }//Fin if

        preguntaRespondida = true;
        vistaJuego.habilitarRespuestas(false);

        if (preguntaActual.ValidarRespuesta(respuesta)) {
            jugador.respuestaCorrecta(); //Falta vista o joptionpane

        } else {
            jugador.respuestaIncorrecta(); //Falta vista o joptionpane
            //Falta no comprendo del todo
        }//Fin else

        actualizarInformacion();
        if (!jugador.tieneVidas()) { //Si el jugador no tiene vidas esto reinicia el nivel
            reiniciarNivel();
        } else if (numeroPregunta == preguntaActual.getCantidadEjercicios() - 1) {
           // terminarNivel();
        }//Fin de if else
    }//Fin metodo

    public void cargarPregunta() {
        preguntaActual = banco.obtenerPreguntas(nivelActual, numeroPregunta);

        vistaJuego.mostrarPregunta(preguntaActual.getPregunta());
        vistaJuego.mostrarOpciones(preguntaActual.getOpciones());
        vistaJuego.habilitarRespuestas(true);

        preguntaRespondida = false;
        actualizarInformacion();
    }//FIN cargarPregunta

    private void actualizarInformacion() {
        Niveles nivel = piramide.obtenerNivel(nivelActual + 1);
        vistaJuego.mostrarInformacion("NIVEL " + nivel.getNumeroNivel() + " - " + nivel.getDificultad(),
                jugador.getPuntos(), jugador.getVidas(), jugador.getRacha());
    }//Fin metodo

   public void mostrarResultados(){
      GUI_Resultados vistaResultados = new GUI_Resultados();
      vistaResultados.setVisible(true);
      vistaJuego.dispose();
       
       
       
       
   }
    
    
    
    
    private void siguientePregunta(){
        if(!preguntaRespondida){
            return;
        }//Fin if
        if(numeroPregunta< preguntaActual.getCantidadEjercicios()-1){
         numeroPregunta++;
        cargarPregunta();
        } else{
        mostrarResultados();
        }
       
    }//Fin metodo
    
  public void PreguntaAnterior(){
      if(numeroPregunta>0){
          numeroPregunta--;
          cargarPregunta();
      }
  }
    

//Esto para cuando el jugador se queda sin vidas, se debe de reiniciar el nivel actual
    private void reiniciarNivel() {
        //Debemos elegir si es joptionPane o vista *****
        jugador.reiniciarVidas();
        numeroPregunta = 0;
        cargarPregunta();
    }//Fin metodo

   // private void terminarNivel() {
     //   piramide.completarNivel(nivelActual + 1); //Desbloquea el siguiente nivel
      //  jugador.agregarvida(); //Esto es para su vida extra

        //Debemos elegir si es joptionPane o vista *****
      //  volverMenu();
   
    //}//Fin metodo

}//Fin de la clase
