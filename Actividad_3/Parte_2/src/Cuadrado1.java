public class Cuadrado1 {
    int lado; // Atributo que define el lado de un cuadrado
    /**
    * Constructor de la clase Cuadrado
    * @param lado Parámetro que define la longitud de la base de un
    * cuadrado
    */
    public Cuadrado1(int lado) {
    this.lado = lado;
    }
    /**
    * Método que calcula y devuelve el área de un cuadrado como el
    * lado elevado al cuadrado
    * @return Área de un Cuadrado
    */
    double calcularArea() {
    return lado*lado;
    }
    /**
    * Método que calcula y devuelve el perímetro de un cuadrado como
    * cuatro veces su lado
    * @return Perímetro de un cuadrado
    */
    double calcularPerimetro() {
    return (4*lado);
    }
}
