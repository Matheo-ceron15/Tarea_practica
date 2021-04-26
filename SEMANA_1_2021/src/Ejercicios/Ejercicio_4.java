package Ejercicios;

public class Ejercicio_4 {
    public static void main(String[] args) {
        //declaracion de variables
        double empleado, empleador, P1,P2, TotalEmpleado, TotalEmpleador,Salario;
        Salario=500.00;
        P1=0.06;
        P2=0.065;
        
        //uso de variables
        empleado= 0.06*500.00;
        TotalEmpleado= Salario-empleado;
        
        empleador= 0.065*500.00;
        TotalEmpleador = Salario*empleador;
        System.out.println("El Empleado paga a la AFP un total de: $" + empleado + " Y su pago pago total de un mes es de: $" + TotalEmpleado);
        System.out.println("El Empleador paga a la AFP un total de: $" + empleador);
    }
}
