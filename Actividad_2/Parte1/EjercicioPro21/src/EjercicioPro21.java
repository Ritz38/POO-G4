package Actividad_2.Parte1.EjercicioPro21.src;
import java.util.Scanner;
public class EjercicioPro21{
    public static void main(String[] args) {
        double lado1,lado2,lado3,P,S,A;
        Scanner L1= new Scanner(System.in);
        System.out.println("Ingrese los lados del triángulo:"+"\n"+"L1:");
        lado1=L1.nextDouble();
        System.out.println("L2:");
        lado2=L1.nextDouble();
        System.out.println("L3");
        lado3=L1.nextDouble();
        P = lado1+lado2+lado3;
        S= P/2;
        A = Math.sqrt(S*(S-lado1)*(S-lado2)*(S-lado3));
        System.out.println("El perímetro es: "+P+"\nEl semiperímetro es: "+S+"\nEl área es: "+A);
    }
    
}
