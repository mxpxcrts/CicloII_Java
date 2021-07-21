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

    //Getter & Setter 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor(){
        return color;
    }

    public void serColor(String color){
        this.color = color;
    }

    public int getPosicion(){
        return posicion;
    }

    public void setPosicion(int posicion){
        this.posicion = posicion;
    }


    //Métodos de la Clase 
    public String movimiento(int pInicial, int pFinal){
        return "La ficha se mueve del punto inicial " + pInicial + " al punto final " + pFinal;
    }

    public String desplazamiento(String nombre){
        return "La ficha " + nombre + " se está moviendo";
    }

    public String toString(){
        return "Nombre:" + nombre + " Color:" + color + " Posición:" + posicion;
    }

}
