package retos.misiontic2022.ciclo2;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Franquicia obj = new Franquicia(12, 1000, 0.10);

        System.out.println(obj.compararFranquicia(12, 1000, 0.10));
    }
}
