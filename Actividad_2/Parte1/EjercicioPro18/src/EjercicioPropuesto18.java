package Actividad_2.Parte1.EjercicioPro18.src;
import java.util.Scanner;
public class EjercicioPropuesto18 {
    public static void main(String[] args){
        int codigo;
        double horasT, valorH, porcentajeRT, salarioB, salarioN;
        String nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese codigo del empleado: ");
        codigo= scanner.nextInt();
        System.out.println("Ingrese nombre del empleado: ");
        nombre= scanner.next();
        System.out.println("Ingrese horas trabajadas del empleado: ");
        horasT= scanner.nextDouble();
        System.out.println("Ingrese el valor de las horas del empleado: ");
        valorH= scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de retencion: ");
        porcentajeRT= scanner.nextDouble();
        
        salarioB= horasT*valorH;
        salarioN= salarioB-salarioB*(porcentajeRT/100);  /* Suponiendo que en las retenciones nos entregan un numero del 0 al 100*/
        System.out.println("El codigo del empleado es: "+ codigo);
        System.out.println("El nombre del empleado es: "+nombre);
        System.out.println("El salario bruto es: "+salarioB);
        System.out.println("El salario neto es: "+salarioN);
        
    }
}
