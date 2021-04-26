package Ejemplos_semana1;

public class CalculoInteresSimple {
    public static void main(String[] args) {
        //Declaracion de variables
double interes, capitalprestado, tiempo, tasaDeInteres, tiempoEnMeses;

//inicializacion de variables
interes = 144;
capitalprestado = 1200.00; 
tasaDeInteres = 0.08;

//formula
tiempo = interes / (capitalprestado * tasaDeInteres);
tiempoEnMeses = tiempo * 12;
System.out.println("El tiempo en años es de: " + tiempo); 
System.out.println("El tiempo en meses es de: " + tiempoEnMeses);
    }
}
