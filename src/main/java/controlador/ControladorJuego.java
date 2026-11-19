/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUI_Juego;
import vista.GUI_Portada;

/**
 *
 * @author cisaa
 */
public class ControladorJuego implements ActionListener{
    
     private GUI_Juego vistaJuego;
    private GUI_Portada vista;

    public ControladorJuego(GUI_Juego vistaJuego, GUI_Portada vista) {
        this.vistaJuego = vistaJuego;
        this.vista = vista;
        
        vistaJuego.addButtonListener(this);
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