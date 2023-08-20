package Actividad_1;
public class EjercicioN12{
    public static void main(String[] args) {
        double salariobruto, salarioneto, retenciones= 0.125, retencionesT, horassemana=48, valorhora=5000, horasmensuales;
        horasmensuales=horassemana*4;
        salariobruto=horasmensuales*valorhora;
        retencionesT=salariobruto*retenciones;
        salarioneto= salariobruto-retencionesT;
        System.out.println("El salario bruto es: "+salariobruto);
        System.out.println("Las retenciones son: "+ retencionesT);
        System.out.println("El salario neto es: "+ salarioneto);
    }
}
