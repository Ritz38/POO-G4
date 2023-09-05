import java.util.Arrays;
import java.util.Scanner;

public class EjercicioRe15 {
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
        System.out.println("Ingrese peso de D: ");
        esfD = esf.nextDouble();
        
        double [] arr = {esfA,esfB,esfC,esfD};
        double [] arraux={esfA,esfB,esfC,esfD};
        String arrT[] = {"Esfera A","Esfera B","Esfera C","Esfera D"};
        Arrays.sort(arr);
        
        while(arr[1]==arraux[n]){
            
            
            n++;
        }
        
        if(arraux[n]>arr[1]){
            
            System.out.println("La "+arrT[n]+" "+"es más pesada");
            
            
        }
        
        else{
            System.out.println("La "+arrT[n]+" "+"es menos pesada");
        }
    }
}
