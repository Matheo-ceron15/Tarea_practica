package Ejercicios;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //declaracion de variables
        double gananciaDiaria, diasTrabajadosMes, HorasExtra,TotalMes, PorcentajeExtra, Mes, porcentajeExtra, PagoExtra, Renta, PagoFinal;
        //inicializacion de variables
        gananciaDiaria = 10.00;
        diasTrabajadosMes= 26;
        PorcentajeExtra=0.1;
        HorasExtra=50;
        //uso de variables
        Mes = gananciaDiaria*26;  //EL 26 LO PUSE PORQUE SON 26 DIAS TRABAJADOS AL MES A $10
        porcentajeExtra = gananciaDiaria +(0.1*10.00); //LA GANANCIA DIARIA MAS EL 10% DE LAS HORAS EXTRAS
        PagoExtra= porcentajeExtra*HorasExtra; //GANANCIA DE LAS HORAS EXTRAS
        
        TotalMes= Mes + PagoExtra;
        Renta = 0.1*TotalMes;
        PagoFinal=TotalMes-Renta;
        System.out.println("El pago final del trabajodor es de: $" + PagoFinal);
    }
   
}
