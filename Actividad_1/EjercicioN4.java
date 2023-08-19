package Actividad_1;
import java.util.Scanner;
public class EjercicioN4 {
    public static void main(String[] args) {
        int edJuan, edAlber, edAna, edmama;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Edad Juan: "); //Leemos la edad de Juan primero
        edJuan = entrada.nextInt();
        edAlber =(edJuan*2)/3;
        edAna=(edJuan*4)/3;
        edmama=edJuan+edAna+edAlber; //Calculamos las otras edades en base al texto
        System.out.println("Edad Juan: "+ edJuan);//Imprimimos todo
        System.out.println("Edad Alberto: "+ edAlber);
        System.out.println("Edad Ana: "+ edAna);
        System.out.println("Edad Mamá: "+ edmama);
    }
}
