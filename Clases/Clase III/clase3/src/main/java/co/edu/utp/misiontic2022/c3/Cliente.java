package co.edu.utp.misiontic2022.c3;

public class Cliente extends Persona{
    
    // Atributos de la Clase 

    private String telefonoContacto;

    // Método Constructor

    public Cliente(String nombre, int edad, String telefonoContacto){

        super(nombre,edad);
        this.telefonoContacto = telefonoContacto;

    }

    public void mostrar(){
        System.out.println("Cliente");
    }

    public String getTelefonoContacto(){
        return telefonoContacto;
    }

    public String toString() {
        return "Cliente ---> Nombre: " + super.getNombre() + " Edad: " +super.getEdad() + " Sueldo: " + telefonoContacto;
    }


}
