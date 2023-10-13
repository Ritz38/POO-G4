package Inmuebles;

public class Apartamento extends InmuebleVivienda {

public Apartamento(int identificadorInmobiliario, int area, String
dirección, int numeroHabitaciones, int númeroBaños) {

super(identificadorInmobiliario, area, dirección,
numeroHabitaciones, númeroBaños);
}

void imprimir() {
super.imprimir();
}
}