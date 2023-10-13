package Inmuebles;

public class CasaRural extends Casa {

protected static double valorArea = 1500000;

protected int distanciaCabera;

protected int altitud;
public CasaRural(int identificadorInmobiliario, int area, String
direccion, int númeroHabitaciones, int númeroBaños, int
númeroPisos, int distanciaCabera, int altitud) {

super(identificadorInmobiliario, area, direccion,
númeroHabitaciones, númeroBaños, númeroPisos);
this.distanciaCabera = distanciaCabera;
this.altitud = altitud;
}
void imprimir() {
super.imprimir();
System.out.println("Distancia la cabecera municipal = " +
númeroHabitaciones + " km.");
System.out.println("Altitud sobre el nivel del mar = " + altitud +
" metros.");
System.out.println();
}
}