/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * 

 * uthor Heyerick-PC
 */
public abstract class Niveles implements Validar{

    //Atributos
    private int numero;
    private int cantidadEjercicios; //Está parte existe porque serán 5 preguntas
    private boolean desbloqueado;
    private boolean completado;
   private String pregunta;
    //Constructor sin parametros 
    public Niveles() {
    }

    //Constructor con parametros

        public Niveles(int numero, int cantidadEjercicios, boolean desbloqueado, boolean completado, String pregunta) {
            this.numero = numero;
            this.cantidadEjercicios = cantidadEjercicios;
            this.desbloqueado = desbloqueado;
            this.completado = completado;
            this.pregunta = pregunta;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCantidadEjercicios() {
            return cantidadEjercicios;
        }

        public void setCantidadEjercicios(int cantidadEjercicios) {
            this.cantidadEjercicios = cantidadEjercicios;
        }

        public boolean isDesbloqueado() {
            return desbloqueado;
        }

        public void setDesbloqueado(boolean desbloqueado) {
            this.desbloqueado = desbloqueado;
        }

        public boolean isCompletado() {
            return completado;
        }

        public void setCompletado(boolean completado) {
            this.completado = completado;
        }

        public String getPregunta() {
            return pregunta;
        }

        public void setPregunta(String pregunta) {
            this.pregunta = pregunta;
        }

   

    //Esto permite jugar los niveles, ya que al inicio estos van a estgar bloqueados
    public void desbloquear(){
     desbloqueado = true;
    }//Fin de metodo
    
    //Esto marca el nivel ya como desbloqueado
    public void completado(){
     completado = true;
    }//Fin de metodo
    
    //Esto es para que cada hija tenga su propia difucultad y sus operaciones
    //Metodos abstractos
    public abstract String getDificultad();

    public abstract String getOperaciones();
    
    public abstract boolean ValidarRespuesta(String respuesta);
    
    
}//Fin de la clase
