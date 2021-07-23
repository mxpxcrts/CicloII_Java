package retos.misiontic2022.ciclo2;

public class Franquicia {


    // Atributos de la Clase


    private double resultado;
    private double interesSimple;
    private double interesCompuesto; 
    private double resultadoInteres; 


    //Método constructor 

    public Franquicia(){       
    }

    // Métodos de la Clase 

    public double calcularInteresSimple(int tiempo, double capital, double interes){

        interesSimple = capital * interes * tiempo;
        return interesSimple;

    } 

    public double calcularInteresCompuesto(int tiempo, double capital, double interes){

        interesCompuesto = Math.pow(1 + interes, tiempo) * capital; 
        return interesCompuesto;

    } 

    public String compararFranquicia(int pTiempo, double pCapital, double pInteres){


        resultadoInteres = calcularInteresCompuesto(pTiempo, pCapital, pInteres) - calcularInteresSimple(pTiempo, pCapital, pInteres);

        resultado = resultadoInteres % (int) Math.pow(10, (int) Math.log10(resultadoInteres));
        
        if (pInteres == 0){
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        else {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + resultado;

        }



    }


}
