package co.edu.utp.misiontic2022.c3;

//Diagrama de clases obtenido en la diapositiva 17 de la clase 3 de la unidad 1  

public class App 
{
    public static void main( String[] args )
    {
        //! LOS OBEJTOS SIEMPRE SE LLAMAN DESDE LA CLASE MAIN

        // Creación de objetos
        // ? Concepto de herencia aplicada en objetos 
        // La clase Padre será quien vaya primero (Persona), se le da nombre al objeto (objPersona1 / objPersona2) y se instancia la Clase a la que se le vayan a pasar los datos (Empleado / Cliente), por último se le pasan los argumentos que piden las Clases (nombre, edad, sueldo) y (nombre, edad, telefono), en este caso los atributos nombre y edad son heredados de la Clase Padre *ver las otras clases para comprender*

        Persona objPersona1 = new Empleado("Marcela", 32, 2345.25);
        Persona objPersona2 = new Cliente("Paulo", 30, "301 246 5512");

        // Para el ejemplo de la composición

        Empleado objPersona3 = new Empleado("Luis", 15, 1254.26);

        // Mostrar datos llamando al método
        // * Polimorfismo APLICADO
        // Polimorfismo ---- es la capacidad que tiene un método de comportarse de diferentes maneras según el objeto que lo llame

        objPersona1.mostrar();
        objPersona2.mostrar();

        // Composición

        Empresa objEmpresa = Empresa("MinTic2022", objPersona3);
    }
}
