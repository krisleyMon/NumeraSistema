/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUI_Explicacion;
import vista.GUI_Instrucciones;
import vista.GUI_Juego;
import vista.GUI_Portada;

/**
 *
 * @author cisaa
 */
public class ControladorPortada implements ActionListener{
    
    private GUI_Portada vista=new GUI_Portada();
    
    public ControladorPortada(){
        
        vista.addPortadaListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String op =e.getActionCommand();
        switch(op){
            case "JUGAR":
                abrirPiramide();
               break; 
            case "SALIR":
                System.exit(0);
                break;
            case "COMO":
                abrirComo();
               break;     
                
        }
    }
    
   public void inicio(){
       vista.setLocationRelativeTo(null);
       vista.setVisible(true);    
   } 
    
 public void abrirComo(){
    GUI_Instrucciones vistaInstruc =new  GUI_Instrucciones(); 
    ControladorInstruc controlador = new ControladorInstruc(vistaInstruc, vista); 
     
   vista.setVisible(false);
   vistaInstruc.setLocationRelativeTo(null);
   vistaInstruc.setVisible(true);
 }   
 
 public void abrirPiramide(){
    GUI_Explicacion vistaExpli =new  GUI_Explicacion(); 
    ControladorExplicacion controlador = new ControladorExplicacion(vistaExpli, vista); 
     
   vista.setVisible(false);
   vistaExpli.setLocationRelativeTo(null);
   vistaExpli.setVisible(true);
 }   
 
}
