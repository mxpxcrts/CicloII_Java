import java.util.Scanner;

public class Clases {
    public static void main(String[] args) {
        
        //Importar clase Scanner
        Scanner sc = new Scanner(System.in);

        // Invocar metodo dtNumero
        System.out.print("Digite un número: ");
        int num = sc.nextInt();
        System.out.println(dtNumero(num));

        //Invocar metodo grados
        System.out.print("Digite los grados centígrados: ");
        double gradosC = sc.nextDouble();
        System.out.println(grados(gradosC));

        //Invocar metodo operadorCondicional
        System.out.print("Digite el número: ");
        int num2 = sc.nextInt();
        System.out.println(operadorCondicional(num2));

    }

    public static String dtNumero(int n){
        return "Doble: " + (n*2) + " Triple: " + (n*3);
    }

    public static double grados(double c){
        return 32 + (9*(c/5));
    }

    public static String operadorCondicional(int n){
        return n%2 == 0?n + " es par":n + " es impar";
    }
    

}
