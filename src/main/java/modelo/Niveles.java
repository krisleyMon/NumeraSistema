/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * <<<<<<< HEAD @a
 *
 *
 * uthor Heyerick-PC
 */
public abstract class Niveles {

    //Atributos
    private int numeroNivel; //Número de nivel
    private int cantidadEjercicios; //Está parte existe porque serán 5 preguntas
    private boolean desbloqueado;
    private boolean completado;

    //Constructor sin parametros 
    public Niveles() {
    }

    //Constructor con parametros
    public Niveles(int numeroNivel, int cantidadEjercicios) {
        this.numeroNivel = numeroNivel;
        this.cantidadEjercicios = cantidadEjercicios;
        this.completado = false;
    }//Fin constructor
    
    public int getNumeroNivel() {    
        return numeroNivel;
    }

    //Get y set
    //Prefiero hacerlos todos por si más adelante los ocupamos, pero de momento usaré unos
    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
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
    
}//Fin de la clase
