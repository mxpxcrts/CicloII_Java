package co.edu.utp.misiontic2022.c2;

public class App 
{
    public static void main( String[] args )
    {
        Ficha objFicha1 = new Ficha("Caballo", "Blanco", 4);
        System.out.println(objFicha1);
        System.out.println(objFicha1.desplazamiento());
        System.out.println(objFicha1.movimiento(12, 34));
    }
}
