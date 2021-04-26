package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Ejercico_6 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.0");
        //declaracion de variables
        double P1, P2,P3, P4, P5, Pro;
        //Inicializacion
        P1=8.0;
        P2=7.5;
        P3=9.0;
        P4=8.0;
        P5=9.0;
        //uso de variables
        Pro= (P1*0.25)+(P2*0.15)+(P3*0.15)+(P4*0.200)+(P5*0.25) ;
        System.out.println("El promedio del Estudiante es de: " + formato.format(Pro));
    }
}
