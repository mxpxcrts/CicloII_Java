package co.edu.utp.misiontic2022.c3;

public class Empresa {
    
    // Atributos de la Clase 

    private String nombre;

    //! RELACION FUERTE

    private Empleado empleado;

    // Método Constructor

    // todo ACLARACIÓN: this (es una autoreferencia) 
    // se ultiliza para que el nombre de los atributos se distingan los unos de los otros, pero si no se quisiera utilizar lo que se debe hacer es cambiar el nombre de la variable que recibe el método constructor. Ejemplo a continuación: 

        /* public Empresa(String n){
            nombre = n;
        } 
        */

    // Por norma es mejor manejar el mismo nombre de los atributos o variables

    public Empresa(String nombre, Empleado empleado){
        
        this.nombre = nombre;
        this.empleado = empleado; 
    }

    // Método toString
    // Es un método de la clase Object y se utiliza para convertir a String (es decir, a una cadena de texto) cualquier objeto Java.

    public String toString(){
        return "Empresa: " + nombre + " Empleado: " + empleado;
    }
}
