package CarreraCiclistica;

public class Escalador extends Ciclista {

private double aceleracionPromedio;

private double gradoRampa;
public Escalador(int identificador, String nombre, double
aceleracionPromedio, double gradoRampa) {
super(identificador, nombre);
this.aceleracionPromedio = aceleracionPromedio;
this.gradoRampa = gradoRampa;
}

protected double getAceleracionPromedio() {
return aceleracionPromedio;
}

protected void setAceleracionPromedio(double
aceleracionPromedio) {
this.aceleracionPromedio = aceleracionPromedio;
}

protected double getGradoRampa() {
return gradoRampa;
}
protected void setGradoRampa(double gradoRampa) {
this.gradoRampa = gradoRampa;
}

protected void imprimir() {
super.imprimir(); 
System.out.println("Aceleración promedio = " +
aceleracionPromedio);
System.out.println("Grado de rampa = " + gradoRampa);
}

protected String imprimirTipo() {
return "Es un escalador";
}
}