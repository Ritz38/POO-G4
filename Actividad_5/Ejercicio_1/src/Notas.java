public class Notas {
    
    double [] listaNotas;
    
    
    public Notas(){
        
        listaNotas = new double[5];

}
    
    
    double calcularPromedio(){
        
        double suma = 0;
        for(int i=0; i< listaNotas.length; i++){
            
            suma= suma+listaNotas[i];
        }
        
        return (suma/listaNotas.length);
    }
    
    
    double calcularDesviación() {
        double prom = calcularPromedio(); /* Invoca el método para
        calcular el promedio */
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {
        // Aplica fórmula para la sumatoria de elementos
        suma += Math.pow(listaNotas[i] - prom, 2 );
        }
        return Math.sqrt (suma/listaNotas.length ); /* Retorna el cálculo
        final de la desviación */
}
    
    double calcularMenor() {
        double menor = listaNotas[0]; /* Define una variable como la
        nota menor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
        if (listaNotas[i] < menor) {
        /* Si un elemento del array es menor que el menor actual,
        se actualiza su valor */
        menor = listaNotas[i];
        }
        }
        return menor;
}
    
    double calcularMayor() {
        double mayor = listaNotas[0]; /* Define una variable como la
        nota mayor */
        for(int i=0; i < listaNotas.length; i++) { // Se recorre el array
        if (listaNotas[i] > mayor) {

        /* Si un elemento del array es mayor que el mayor actual,
        se actualiza su valor */
        mayor = listaNotas[i];
        }
        }
        return mayor;
}
    
}
