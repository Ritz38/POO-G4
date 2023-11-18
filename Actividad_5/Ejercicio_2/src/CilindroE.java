public class CilindroE extends FiguraGeometrica {
private double radio; // Atributo que establece el radio de un cilindro
private double altura; // Atributo que establece la altura de un cilindro


public CilindroE(double radio, double altura) {
this.radio = radio;
this.altura = altura;
this.setVolumen(calcularVolumen()); 
this.setSuperficie(calcularSuperficie());
}
/**
* Método para calcular el volumen de un cilindro
* @return El volumen de un cilindro
*/
public double calcularVolumen() {
double volumen = Math.PI * altura * Math.pow(radio, 2.0);
return volumen;
}
/**
* Método para calcular la superficie de un cilindro
* @return La superficie de un cilindro
*/
public double calcularSuperficie() {
double áreaLadoA = 2.0 * Math.PI * radio * altura;
double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
return áreaLadoA + áreaLadoB;
}
}