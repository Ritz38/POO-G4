import java.util.Scanner;
public class EjercicioRe13 {
    public static void main(String[] args) throws Exception {
        String COLOR;
        double VALORCOMP, VALPAG, PDES;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        VALORCOMP = entrada.nextDouble();
        System.out.println("Ingrese el color de la bola: ");
        COLOR = entrada.next();
        if (COLOR.equals("blanco")){
            PDES=0;
        }
        else if (COLOR.equals("verde")){
            PDES=0.1;
        }
        else if (COLOR.equals("amarillo")){
            PDES=0.25;
        }
        else if (COLOR.equals("azul")){
            PDES=0.5;
        }
        else {
            PDES=1;
        }
        VALPAG=VALORCOMP-(VALORCOMP*PDES);
        System.out.println("El valor a pagar es de: $"+VALPAG);
    }
}
