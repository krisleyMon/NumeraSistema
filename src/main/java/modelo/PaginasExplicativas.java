/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cisaa
 */
public class PaginasExplicativas {

    private String[] titulos;
    private String[] contenidos;

    public PaginasExplicativas() {

        titulos = new String[]{
            "¡Aprendamos a sumar!",
            "¡Aprendamos a restar!"
        };

        contenidos = new String[]{
             // PÁGINA 1: SUMA
    "<html><div align='center'>"
    + "<b>¡Bienvenido a NUMERA!</b><br>"
    + "Aquí aprenderás matemáticas de forma fácil y divertida.<br>"
    + "¡Comencemos con nuestra primera operación!<br>"
    + "Sumar significa juntar o agregar cantidades para obtener un resultado.<br>"
    + "Por ejemplo, si tienes 2 manzanas y recibes 3 más,<br>"
    + "tendrás 5 manzanas en total.<br>"
    + "<b>2 + 3 = 5</b><br>"
    + "El signo (+) representa la suma.<br>"
    + "<b>¡Al sumar, juntamos cantidades!</b>"
    + "</div></html>",

    // PÁGINA 2: RESTA
    "<html><div align='center'>"
    + "<b>¡Muy bien! Ya aprendimos a sumar.</b><br>"
    + "Ahora conoceremos otra operación: ¡LA RESTA!<br>"
    + "Restar significa quitar una cantidad de otra<br>"
    + "para saber cuánto queda.<br>"
    + "Si tienes 5 manzanas y regalas 2,<br>"
    + "te quedarán solamente 3.<br>"
    + "<b>5 - 2 = 3</b><br>"
    + "El signo (-) representa la resta.<br>"
    + "<b>¡Al restar, quitamos cantidades!</b><br>"
    + "¡Ahora estás listo para jugar!"
    + "</div></html>"
        };
    }

    public String obtenerTitulo(int numeroPagina) {
        return titulos[numeroPagina];
    }

     public String obtenerContenido(int numeroPagina) {
        return contenidos[numeroPagina];
    }
    
     public int cantidadPaginas() {
        return titulos.length;
    }
    
    
    
    
    
}
