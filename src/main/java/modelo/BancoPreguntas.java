/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author krisl
 */
public class BancoPreguntas {
  

  private Niveles[][] nivel = new Niveles[3][5];

    public BancoPreguntas() {
    cargarPreguntas();
    }
  
  //se encarga de cargar las preguntas de los diferentes niveles 
  private void cargarPreguntas(){
   String[] opciones1 ={"1","9","10","8"};
   String[] opciones2 ={"7","4","9","2"};
   String[] opciones3 ={"8","7","9","12"};
   String[] opciones4 ={"8","7","9","12"};
   String[] opciones5 ={"11","12","5","2"};
  
   nivel[0][0] = new Nivel1(opciones1,"9","Cuanto es 5+4 ?");
   nivel[0][1] = new Nivel1(opciones2,"4","Cuanto es 10-6?");
   nivel[0][2] = new Nivel1(opciones3,"12","Cuanto es 10+2?");
   nivel[0][3] = new Nivel1(opciones4,"12","Cuanto es 7-3?");
   nivel[0][4] = new Nivel1(opciones5,"11","Cuanto es 5+6'");
  }//Fin del metodo
    
private Niveles obtenerPreguntas(int nivelActual,int numero){

 return  nivel[nivelActual][numero];
 
}//Fin del metodo   
       
}//Fin de la clase 
