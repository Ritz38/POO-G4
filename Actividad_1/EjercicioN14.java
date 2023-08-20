package Actividad_1;
import java.util.Scanner;
public class EjercicioN14 {
    public static void main(String[] args) {
        double x, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el numero: ");
        x=entrada.nextDouble();
        cuadrado=Math.pow(x,2);
        cubo=Math.pow(x,3);
        System.out.println("El cuadrado del numero es:"+cuadrado);
        System.out.println("El cubo del numero es:"+cubo);
    }
}
