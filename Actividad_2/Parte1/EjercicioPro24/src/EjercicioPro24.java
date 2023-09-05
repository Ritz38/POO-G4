package Actividad_2.Parte1.EjercicioPro24.src;
import java.util.Scanner;

public class EjercicioPro24 {
    public static void main(String[] args) throws Exception {
        double esfA,esfB,esfC,esfD;
        int n=0;
        Scanner esf = new Scanner(System.in);
        
        System.out.println("Ingrese peso de A: ");
        esfA = esf.nextDouble();
        System.out.println("Ingrese peso de B: ");
        esfB = esf.nextDouble();
        System.out.println("Ingrese peso de C: ");
        esfC = esf.nextDouble();
        
        
        if(esfA>esfB & esfA>esfC){
            
            System.out.println("La esfera A es la de mayor peso: ");
        }
        
        else if(esfB>esfA & esfB>esfC){
        
            System.out.println("La esfera B es la de mayor peso: ");
        }
        else{
            
            System.out.println("La esfera C es la de mayor peso: ");
        }
    }
}
