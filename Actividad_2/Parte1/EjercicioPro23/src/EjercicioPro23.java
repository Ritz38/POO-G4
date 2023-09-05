import java.util.Scanner;
public class EjercicioPro23 {
    public static void main(String[] args) throws Exception {
        double A, B, C, X1, X2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese A considerando que A acompaña X^2: ");
        A=entrada.nextDouble();
        System.out.println("Ingrese B considerando que B acompaña X: ");
        B=entrada.nextDouble();
        System.out.println("Ingrese C considerando que C es el termino independiente: ");
        C=entrada.nextDouble();
        X1=(-B+Math.sqrt((B*B)-(4*A*C)))/(2*A);
        X2=(-B-Math.sqrt((B*B)-(4*A*C)))/(2*A);
        System.out.println("X1="+X1+" X2="+X2);
    }
}
