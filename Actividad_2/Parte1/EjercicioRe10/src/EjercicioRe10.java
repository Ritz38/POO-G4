import java.util.Scanner;

public class EjercicioRe10 {
    public static void main(String[] args) throws Exception {
        double NI,pat,Est,matr;
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese número de inscripción: ");
        NI = datos.nextDouble();
        System.out.println("Ingrese nombre: ");
        String name = datos.next();
        System.out.println("Ingrese patrimonio: ");
        pat = datos.nextDouble();
        System.out.println("Ingrese estrato social: ");
        Est = datos.nextDouble();
    
        if(pat>2000000 & Est>3)
        {
            matr = pat*0.03+50000;
            System.out.println("El número de inscripición es: "+NI+"\nEl nombre es: "+name+"\nLa matrícula es: "+matr);
        }
        
        else{
            matr = 50000;
            System.out.println("El número de inscripición es: "+NI+"\nEl nombre es: "+name+"\nLa matrícula es: "+matr);
        }
    }
}
