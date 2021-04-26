package Ejercicios;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //declaracion de variables
        double Renta, GananciaMes, Porcentaje, GananciaTotal;
         //inicializacion
         Renta=0.1;
         GananciaMes = 288.00;
         //uso de variables
         Porcentaje=Renta*GananciaMes;
         GananciaTotal=GananciaMes-Porcentaje;
         System.out.println("El pago total del docente es de : " + "$" + GananciaTotal);
    }
}
