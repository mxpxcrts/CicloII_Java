package retos.misiontic2022.ciclo2;

public class Franquicia {


    // Atributos de la Clase


    private String proyecto;
    private int tiempo;
    private double capital; 
    private double interes; 


    //Método constructor 

    public Franquicia(){
        proyecto = ""; 
        tiempo = 0; 
        capital = 0; 
        interes = 0;       
    }

    public String getNombreProyecto(){
        return proyecto;
    }
    // Métodos de la Clase 

    public double calcularInteresSimple(){

        double interesSimple = capital * interes * tiempo;
        return interesSimple;

    } 

    public double calcularInteresCompuesto(){

        double interesCompuesto = capital * ( Math.pow( 1 + interes, tiempo ) - 1);
        return interesCompuesto;

    } 

    public String compararFranquicia(int pTiempo, double pCapital, double pInteres){

        tiempo = pTiempo;
        capital = pCapital;
        interes = pInteres;

        double resultado = calcularInteresCompuesto() - calcularInteresSimple();

        if ( resultado > 0 ) {    		
        	return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + resultado;  
        }
	    {    		        	
        	return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
	    }



    }


}
