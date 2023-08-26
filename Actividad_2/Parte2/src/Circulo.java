package Actividad_2.Parte2.src;

public class Circulo {
    int radio; // Atributo que define el radio de un círculo
    /**
    * Constructor de la clase Círculo
    * @param radio Parámetro que define el radio de un círculo
    */
    Circulo(int radio) {
    this.radio = radio;
    }
    /**
    * Método que calcula y devuelve el área de un círculo como pi
    * multiplicado por el radio al cuadrado
    * @return Área de un círculo
    */
    double calcularArea() {
    return Math.PI*Math.pow(radio,2);
    }
    /**
    * Método que calcula y devuelve el perímetro de un círculo como la
    * multiplicación de pi por el radio por 2
    * @return Perímetro de un círculo
    */
    double calcularPerimetro() {
    return 2*Math.PI*radio;
    }
}
