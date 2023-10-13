package CarreraCiclistica;

public class Velocista extends Ciclista {
private double potenciaPromedio; 
private double velocidadPromedio;
public Velocista(int identificador, String nombre, double
potenciaPromedio, double velocidadPromedio) {
super(identificador, nombre);
potenciaPromedio = potenciaPromedio;
this.velocidadPromedio = velocidadPromedio;
}

protected double getPotenciaPromedio() {
return potenciaPromedio;
}

protected void setPotenciaPromedio(double potenciaPromedio) {
this.potenciaPromedio = potenciaPromedio;
}

protected double getvelocidadPromedio() {
return velocidadPromedio;
}

protected void setVelocidadPromedio(double velocidadPromedio) {
this.velocidadPromedio = velocidadPromedio;
}
protected void imprimir() {
super.imprimir();
System.out.println("Potencia promedio = " + potenciaPromedio);
System.out.println("Velocidad promedio = " +
velocidadPromedio);
}

protected String imprimirTipo() {
return "Es un velocista";
}
}