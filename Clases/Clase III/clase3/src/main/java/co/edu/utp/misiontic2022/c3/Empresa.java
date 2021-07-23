package co.edu.utp.misiontic2022.c3;

public class Empresa {
    
    // Atributos de la Clase 

    private String nombre;

    //? Composición ----> Atributo
    //? Agregación ----> Parámetro de un método

    //! RELACION FUERTE / COMPOSICIÓN
    // Esta relación se representa desde los atributos.

    private Empleado empleado; // Relación: La empresa tiene UN empleado

    // Método Constructor

    // todo ACLARACIÓN: this (es una autoreferencia) 
    // se ultiliza para que el nombre de los atributos se distingan los unos de los otros, pero si no se quisiera utilizar lo que se debe hacer es cambiar el nombre de la variable que recibe el método constructor. Ejemplo a continuación: 

        /* public Empresa(String n){
            nombre = n;
        } 
        */

    // Por norma es mejor manejar el mismo nombre de los atributos o variables

    //En este caso el Empleado se convierte en un objeto

    public Empresa(String nombre, Empleado empleado){
        
        this.nombre = nombre;
        this.empleado = empleado; 
    }

    // Método toString
    // Es un método de la clase Object y se utiliza para convertir a String (es decir, a una cadena de texto) cualquier objeto Java.

    public String toString(){
        return "Empresa: " + nombre + " Empleado: " + empleado.toString();
    }

    //! RELACIÓN DÉBIL / AGREGACIÓN
    // Representación de la AGREGACIÓN (relación débil), esta relación se representa por medio de un parámetro de un método, en este caso también se instacia el parámetro como un objeto, que traera de la otra clase.

    public String contactoCliente(Cliente cliente){
        return cliente.getTelefonoContacto();
    }
}
