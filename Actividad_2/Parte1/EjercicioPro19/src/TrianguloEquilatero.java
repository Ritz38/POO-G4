package Actividad_2.Parte1.EjercicioPro19.src;

public class TrianguloEquilatero {
    float l;
    TrianguloEquilatero(float l) {
        this.l= l;
    }

    float calcularPerimetro(){
        return l+l+l;
    }

    double calcularAltura() {
        return((Math.sqrt(3))*l)/2;
    }

    double calcularArea() {
        return ((Math.sqrt(3))*(l*l))/4;
    }
}
