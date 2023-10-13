/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Alejandro
 */
public class Perro extends Canido {
    
    @Override
    public String getSonido(){
        
        return "Ladrido";
    }
    
    @Override
    public String getAlimentos() {
        return "Carnívoro";
}
    @Override
    public String getHabitat() {
        return "Doméstico";
}
    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
}
    
}
