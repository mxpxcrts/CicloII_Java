import java.util.Scanner;

public class Ejercicios1 {
    
    public static void main(String[] args) {

        /* 
        Programa que pida por teclado la fecha de nacimiento de una persona (día, mes, año) 
        y calcule su número de la suerte.El número de la suerte se calcula sumando 
        el día, mes y año de la fecha de nacimiento y a continuación sumando 
        las cifras obtenidas en la suma.
        */


        int dia, mes, anho, suma, num1, num2, num3, num4, sNum;

        //Importar clase Scanner 
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su fecha de nacimiento");
        System.out.print("Día: ");
        dia = sc.nextInt();

        System.out.print("Mes: ");
        mes = sc.nextInt();

        System.out.print("Año: ");
        anho = sc.nextInt();

        suma = dia + mes + anho;
        num1 = suma/1000;
        num2 = suma/100%10;
        num3 = suma/10%10;
        num4 = suma%10;
        sNum = num1 + num2 + num3 + num4;

        System.out.println("Su número de la suerte es: " + sNum);

        /*
        Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA)
        del producto,el número de productos vendidos y el porcentaje de IVA aplicado.
        Los datos anteriores se leerán por teclado.
        */

        double precio, cantidad, iva, precioSinIva, totalIva;

        System.out.println("Introduzca el precio de la unidad del producto: ");
        precio = sc.nextDouble();

        System.out.println("Número de productos vendidos: ");
        cantidad = sc.nextDouble();

        System.out.println("Introduzca el valor del IVA: ");
        iva = sc.nextDouble();

        precioSinIva = precio * cantidad; 
        totalIva = precioSinIva * iva/100;

        System.out.println("Precio de la venta: " + (precioSinIva + totalIva));

        /*
        Programa que lea dos variables enteras n y m y le quite a n sus m últimas cifras
        */

        int n, m;

        System.out.println("Valor de n: ");
        n = sc.nextInt();

        System.out.println("Valor de m: ");
        m = sc.nextInt();

        n = n / (int)Math.pow(10, m);

        System.out.println("Número modificado: " +n);
    }
}
