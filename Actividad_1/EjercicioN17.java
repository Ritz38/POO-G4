package Actividad_1;
import java.util.Scanner;
public class EjercicioN17 {
    public static void main(String[] args) {
        double r, area, longitud;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia:");
        r=entrada.nextDouble();
        area=Math.PI*(r*r);
        longitud=2*Math.PI*r;
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia es: "+longitud);
    }
}
