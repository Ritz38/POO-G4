public class EsferaE extends FiguraGeometrica {
private double radio; // Atributo que identifica el radio de una esfera
/**
* Constructor de la clase Esfera
* @param radio Parámetro de define el radio de una esfera
500 Ejercicios de programación orientada a objetos con Java y UML
*/
public EsferaE(double radio) {
this.radio = radio;
this.setVolumen(calcularVolumen()); 

this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y
establece su atributo */
}
/**
* Método para calcular el volumen de una esfera
* @return El volumen de una esfera
*/
public double calcularVolumen() {
double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
return volumen;
}
/**
* Método para calcular la superficie de una esfera
* @return La superficie de una esfera
*/
public double calcularSuperficie() {
double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
return superficie;
}
}
