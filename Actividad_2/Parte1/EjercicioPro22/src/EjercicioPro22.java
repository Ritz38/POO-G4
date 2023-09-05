import java.util.Scanner;

public class EjercicioPro22 {
    public static void main(String[] args) throws Exception {
        Scanner A= new Scanner(System.in);
        
        System.out.println("Ingrese nombre:");
        String nombre= A.next();
        System.out.println("Ingrese salario por hora:");
        double salarioH= A.nextDouble();
        System.out.println("Ingrese número de horas trabajadas en el mes:");
        int horas= A.nextInt();
        
        double Y = salarioH*horas;
        
        if(Y>450000){
            
            System.out.println("Nombre: "+nombre+"\nSalario mensual: "+Y);
        }
        
        else 
            System.out.println("Nombre: "+nombre);
    }
}
