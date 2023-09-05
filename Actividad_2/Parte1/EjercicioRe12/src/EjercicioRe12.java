import java.util.Scanner;
public class EjercicioRe12 {
    
    public static void main(String[] args) throws Exception {
        String NOM;
        float NHT, VHN, HET, HEE8, SALARIO;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del trabajador: ");
        NOM= entrada.next();
        System.out.println("Ingrese el numero de horas trabajadas: ");
        NHT= entrada.nextFloat();
        System.out.println("Ingrese el valor de las horas trabajadas: ");
        VHN= entrada.nextFloat();
        if(NHT>40){
            HET= NHT-40;
            if (HET>8){
                HEE8= HET-8;
                SALARIO=40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            }
            else {
                SALARIO=40 * VHN + HET * 2 * VHN;
            }
        }
        else {
            SALARIO=NHT * VHN;
        }
        System.out.println("EL trabajador "+NOM+" devengo: $"+SALARIO);
    }
}
