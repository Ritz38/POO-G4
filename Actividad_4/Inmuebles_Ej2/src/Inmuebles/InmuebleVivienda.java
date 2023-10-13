package Inmuebles;

public class InmuebleVivienda extends Inmueble {
    protected int númeroHabitaciones;

protected int númeroBaños;

public InmuebleVivienda(int identificadorInmobiliario, int área, String
dirección, int númeroHabitaciones, int númeroBaños) {
super(identificadorInmobiliario, área, dirección); 
this.númeroHabitaciones = númeroHabitaciones;
this.númeroBaños = númeroBaños;
}

void imprimir() {
super.imprimir(); // Invoca al método imprimir de la clase padre
System.out.println("Número de habitaciones = " +
númeroHabitaciones);
System.out.println("Número de baños = " + númeroBaños);
}
}