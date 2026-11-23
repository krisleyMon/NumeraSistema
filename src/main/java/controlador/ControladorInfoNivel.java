/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.InfoPartida;
import modelo.Jugador;
import modelo.NivelInformacion;
import vista.GUI_Portada;
import vista.GUI_Resultados;

/**
 *
 * @author krisl
 */
public class  ControladorInfoNivel implements ActionListener {

    
    private GUI_Resultados vistaResultados;
    private InfoPartida info;
    private GUI_Portada portada;

    public ControladorInfoNivel(GUI_Resultados vistaResultados, InfoPartida info, GUI_Portada portada) {
        this.vistaResultados = vistaResultados;
        this.info = info;
        this.portada = portada;
       
        vistaResultados.addButtonListener(this);
       
       mostrarResultados();
   
    }
   
   
   
  public void mostrarResultados() {

       String texto = info.obtenerInformacion(0);

        vistaResultados.mostrarInformacion(texto);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
          String op = e.getActionCommand();
        switch (op) {
            case "VOLVER":
                volverMenu();
                break;

        }    
        }

   
    public void volverMenu() {
        
       vistaResultados.dispose();
       portada.setVisible(true);
        

    }

}
