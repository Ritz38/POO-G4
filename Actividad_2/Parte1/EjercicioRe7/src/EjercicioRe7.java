import java.util.Scanner;

public class EjercicioRe7 {
    public static void main(String[] args) throws Exception {
        double A,B;
        Scanner n= new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A= n.nextDouble();
        System.out.println("Ingrese valor de B: ");
        B= n.nextDouble();
        
        if(A>B)
        {
            System.out.println("A es mayor a B");
        }
        else if(A<B)
        {
            System.out.println("A es menor a B");
        }
        else 
            System.out.println("A es igual a B");
    }
}
