package Actividad_2.Parte1.EjercicioPro19.src;
import java.util.Scanner;
public class EjercicioPropuesto19 {
    public static void main(String[] args){
        float l;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado del triangulo equilatero: ");
        l= entrada.nextFloat();
        TrianguloEquilatero triangulo = new TrianguloEquilatero(l);
        System.out.println("El perimetro del triangulo es: "+ triangulo.calcularPerimetro());
        System.out.println("El valor de la altura es: "+ triangulo.calcularAltura());
        System.out.println("El area del triangulo es: "+ triangulo.calcularArea());
    }
}
