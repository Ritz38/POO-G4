import java.util.Scanner;

public class EjercicioRe11 {
    public static void main(String[] args) throws Exception {
        int A,B,C;
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        A=num.nextInt();
        System.out.println("Ingrese el segundo número: ");
        B=num.nextInt();
        System.out.println("Ingrese el tercer número: ");
        C=num.nextInt();
        
        if(A>B & A>C){
            
            System.out.println("El número mayor es:"+A);
        }
        
        else if(B>A & B>C){
            
            
        System.out.println("El número mayor es:"+B);
    }
        
        else{
            
            System.out.println("El número mayor es: "+C);
        }
    }
}
