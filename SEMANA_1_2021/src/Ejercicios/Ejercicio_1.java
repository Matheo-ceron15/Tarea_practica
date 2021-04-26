package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Ejercicio_1 {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        //declaracion de variables
        double R1, R2, R3, R4, Req;
        R1 = 5.1;
        R2 = 68;
        R3 = 75;
        R4 = 82;
        //Uso de variables
        Req = 1/((1/R1)+(1/R2)+(1/R3)+(1/R4));
        System.out.println("La resistencia Equivalente es de: " + formato.format(Req) + "ohm");
    }
    
}
