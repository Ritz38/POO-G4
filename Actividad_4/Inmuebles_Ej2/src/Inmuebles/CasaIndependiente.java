package Inmuebles;

public class CasaIndependiente extends CasaUrbana {

protected static double valorArea = 3000000;
public CasaIndependiente(int identificadorInmobiliario, int area,
String direccion, int numeroHabitaciones, int numeroBaños, int
numeroPisos) {
// Invoca al constructor de la clase padre
super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBaños, numeroPisos);
}
void imprimir() {
super.imprimir(); 
System.out.println();
}
}