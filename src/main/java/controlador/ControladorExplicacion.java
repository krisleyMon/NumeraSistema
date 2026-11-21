/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PaginasExplicativas;
import vista.GUI_Explicacion;
import vista.GUI_Juego;
import vista.GUI_Portada;

/**
 *
 * @author cisaa
 */
public class ControladorExplicacion implements ActionListener{
    
     private GUI_Explicacion vistaExpli;
    private GUI_Portada vista;
    private PaginasExplicativas modelo;
    
    private int paginaActual = 0;
    
    
     public ControladorExplicacion(GUI_Explicacion vistaExpli, GUI_Portada vista) {
        this.vistaExpli = vistaExpli;
        this.vista = vista;

        modelo = new PaginasExplicativas();
        vistaExpli.addButtonListener(this);
        
        mostrarPagina();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String op = e.getActionCommand();
        switch (op) {
            case "VOLVER":
                volverMenu();
                break;
            case "JUGAR":
                abrirJuego();
               break; 
            case "ANTERIOR":
                anterior();
               break; 
            case "SIGUIENTE":
                siguiente();
               break;    
        }
    }
    
    private void mostrarPagina() {

        vistaExpli.setTitulo(
                modelo.obtenerTitulo(paginaActual)
        );

        vistaExpli.setContenido(
                modelo.obtenerContenido(paginaActual)
        );

        vistaExpli.habilitarBotones(
                paginaActual > 0,
                paginaActual < modelo.cantidadPaginas() - 1,
                paginaActual == modelo.cantidadPaginas() - 1
        );
    }

    public void anterior() {

        if (paginaActual > 0) {

            paginaActual--;

            mostrarPagina();
        }
    }
    
      public void siguiente() {

        if (paginaActual < modelo.cantidadPaginas() - 1) {

            paginaActual++;

            mostrarPagina();
        }
    }

       public void volverMenu() {
        
        vistaExpli.dispose();
        vista.setVisible(true);

    }
    
 public void abrirJuego(){
    GUI_Juego vistaJuego =new  GUI_Juego(); 
    ControladorJuego controlador = new ControladorJuego(vistaJuego, vista); 
     
   vistaExpli.setVisible(false);
   vistaJuego.setLocationRelativeTo(null);
   vistaJuego.setVisible(true);
 }    
   
}
