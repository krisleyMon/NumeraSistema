/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.BancoPreguntas;
import modelo.Nivel1;
import modelo.Niveles;
import vista.GUI_Juego;
import vista.GUI_Portada;

/**
 *
 * @author cisaa
 */
public class ControladorJuego implements ActionListener{
    
     private GUI_Juego vistaJuego;
    private GUI_Portada vista;
    private BancoPreguntas  banco;
    private Niveles preguntaActual;
  
    public ControladorJuego(GUI_Juego vistaJuego, GUI_Portada vista) {
        this.vistaJuego = vistaJuego;
        this.vista = vista;
        banco = new BancoPreguntas();
        banco.cargarPreguntas();
        
        vistaJuego.addButtonListener(this);
   
       cargarPregunta();
        
    }

   public void cargarPregunta(){
    preguntaActual = banco.obtenerPreguntas(0, 0);
  
     Nivel1 pregunta = (Nivel1) preguntaActual;

    vistaJuego.mostrarPregunta(preguntaActual.getPregunta());

    vistaJuego.mostrarOpciones(pregunta.getOpciones());     
    
   
   }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         String op =e.getActionCommand();
       switch(op){
           case "MENU":
                 volverMenu();
               break;    
    }
    
    
    
    
}

  public void volverMenu() {
        
        vistaJuego.dispose();
        vista.setVisible(true);

    }    
    
    
}