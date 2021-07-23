package retos.misiontic2022.ciclo2;

public class Franquicia {
    
    // Atributos de la Clase

    private int pTiempo;
    private double pCapital; 
    private double pInteres;
    private double interesSimple;
    private double interesCompuesto;  
    private double resultado; 

    //Método constructor 

    public Franquicia(int pTiempo, double pCapital, double pInteres){

        this.pTiempo = pTiempo;
        this.pCapital = pCapital;
        this.pInteres = pInteres;

    }

    // Métodos de la Clase 

    public void cacularInteresSimple(double pCapital, double pInteres, int pTiempo){

        interesSimple = pCapital * pInteres * pTiempo;

    }

    public void calcularInteresCompuesto(double pCapital, double pInteres, int pTiempo){

        //POTENCIAR UN NÚMERO
        //ALT interesCompuesto = Math.pow(1 + pInteres, pTiempo) * pCapital;   

        interesCompuesto = pCapital * Math.pow(1+(pInteres), pTiempo) - 1;

    }

    public String compararFranquicia(int pTiempo, double pCapital, double pInteres){

        resultado = interesSimple - interesCompuesto;
        
        if (pInteres == 0){
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
        else {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + resultado;

        }

        //return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + resultado;
        
    }


}
