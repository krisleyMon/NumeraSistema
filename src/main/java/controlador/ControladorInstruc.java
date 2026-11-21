/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GUI_Instrucciones;
import vista.GUI_Portada;

/**
 *
 * @author cisaa
 */
public class ControladorInstruc implements ActionListener {

    private GUI_Instrucciones vistaInstruc;
    private GUI_Portada vista;

    public ControladorInstruc(GUI_Instrucciones vistaInstruc, GUI_Portada vista) {
        this.vistaInstruc = vistaInstruc;
        this.vista = vista;

        vistaInstruc.addButtonListener(this);
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
        
        vistaInstruc.dispose();
        vista.setVisible(true);

    }
}
