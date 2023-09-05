import java.util.Scanner;
public class EjercicioRe14 {
    public static void main(String[] args) throws Exception {
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el salario de los vendedores: ");
        SALAR = entrada.nextDouble();
        System.out.println("Ingrese las ventas del primer departamento: ");
        VD1 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del segundo departamento: ");
        VD2 = entrada.nextDouble();
        System.out.println("Ingrese las ventas del tercer departamento: ");
        VD3 = entrada.nextDouble();
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN= TOTVEN*0.33;
        if(VD1>PORVEN){
            SALAR1= SALAR+SALAR*0.2;
        }
        else {
            SALAR1= SALAR;
        }
        if(VD2>PORVEN){
            SALAR2= SALAR+SALAR*0.2;
        }
        else {
            SALAR2= SALAR;
        }
        if(VD3>PORVEN){
            SALAR3= SALAR+SALAR*0.2;
        }
        else {
            SALAR3= SALAR;
        }
        System.out.println("SALARIO VENDEDORES DPTO1: "+SALAR1+" SALARIO VENDEDORES DPTO2: "+SALAR2+" SALARIO VENDEDORES DPTO3: "+SALAR3);
    }
}
