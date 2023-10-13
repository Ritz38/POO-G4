package Inmuebles;

public class CasaUrbana extends Casa {
public CasaUrbana(int identificadorInmobiliario, int area, String
direccion, int numeroHabitaciones, int numeroBaños, int
numeroPisos) {

super(identificadorInmobiliario, area, direccion,
numeroHabitaciones, numeroBaños, numeroPisos);
}

void imprimir() {
super.imprimir();
}
}