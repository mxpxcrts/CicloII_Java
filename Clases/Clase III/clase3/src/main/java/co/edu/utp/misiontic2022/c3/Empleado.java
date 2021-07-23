package co.edu.utp.misiontic2022.c3;

// Concepto de HERENCIA.
// Se crea la clase empleado. La palabra reservada extends hace referencia a que esta clase 
// hereda de la clase Persona (hereda sus atributos (nombre y edad))

public class Empleado extends Persona {     
    
    // Atributos de la Clase

    private double sueldoBruto;

    // Método constructor 

    public Empleado (String nombre, int edad, double sueldoBruto){
        
        //? Palabra reservada 'Super' para indicar que esta clase hereda estos atributos. Hace referencia a la clase 'Super'
        super(nombre, edad);

        this.sueldoBruto = sueldoBruto;
    }

    // Métodos de la clase 
    // Al ser un atributo heredado debe guardar la misma estructura de la clase Padre.
    // Si en la clase Padre el atributo mostrar tuviera otro tipo de retorno éste también debería tener el mismo tipo.

    public void mostrar(){
        System.out.println("Empleado");
    }

    public String toString() {
        return "Empleado ---> Nombre: " + super.getNombre() + " Edad: " +super.getEdad() + " Sueldo: " +sueldoBruto;
    }

}
