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
public class NivelInformacion {
    
//Se usara para guardar los conceptoa de ayuda para el usuario
    
private ArrayList<String> conceptos = new ArrayList<>();

    public NivelInformacion() {
   cargarConceptos();
    }

private void cargarConceptos(){
    
  conceptos.add("¡Hola! Bienvenido a Numera."
            +"\n1.Aquí vas a practicar sumas y restas \n multiplicaciones y deviciones."
            + "\n2. Lee la operación que aparece en la pantalla."
            + "\n3. Te diremos si acertaste y por qué."
            + "\n4.VIDAS: empiezas con 3. Si te equivocas, pierdes 1."
            + "\n5.PUNTOS: cada respuesta correcta te da 5 puntos."
            + "\n6.RACHA: cuenta cuántas respuestas \ncorrectas llevas seguidas."
            + "\n7.Si te equivocas, la racha vuelve a 0."
            +"\n8.Si pierdes las 3 vidas, el nivel empieza de nuevo.");
}
//devuelve los conceptos
public String obtenerConceptos(int pocicion){
return conceptos.get(pocicion);
        
   }      
        
        

}
