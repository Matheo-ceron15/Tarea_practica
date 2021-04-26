package Ejercicios;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Ejercicio_2 {
    public static void main(String[] args) {
        NumberFormat formato =  new DecimalFormat("#0.00");
        //declaracion de variables
        double dolar, Europa, ReinoUnido, Australia,Canada;
        
        dolar=100.00;
        //uso de cariables
        Europa = (100 * 1)/ 0.70;
        System.out.println("El valor de 100 USD en Europa son de: " + formato.format(Europa) + " Euros");
        
        ReinoUnido = (100*1) / 0.61;
        System.out.println("El valor de 100 USD en Reino unido es de: " + formato.format(ReinoUnido)+ " Libras Esterlinas");
        
        Australia = (100*1)/0.95;
        System.out.println("El valor de 100 USD en Australia es de: " + formato.format(Australia)+ " Dolares Australianos");
        
        Canada = (100*1)/0.97;
        System.out.println("El valor de 100 USD en Canada es de: " + formato.format(Canada) + " Dolares Canadienses");
    }
}
