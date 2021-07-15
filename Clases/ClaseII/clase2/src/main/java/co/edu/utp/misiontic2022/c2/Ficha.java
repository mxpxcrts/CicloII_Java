package co.edu.utp.misiontic2022.c2;

public class Ficha {
    
    //Atributos de la Clase
    private String nombre;
    private String color;
    private int posicion;

    //Constructor o método constructor
    public Ficha(String nombre, String color, int posicion) {
        this.nombre = nombre;
        this.color = color;
        this.posicion = posicion;
    }

    //Métodos de la Clase 
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve del punto inicial " + pInicial + " al punto final " + pFinal;
    }

    public String desplazamiento(){
        return "La ficha se está moviendo";
    }

    public String toString(){
        return "Nombre:" + nombre + " Color:" + color + " Posición:" + posicion;
    }

}
