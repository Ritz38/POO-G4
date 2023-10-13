/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alejandro
 */
public class Cuenta {
    
    protected float saldo;
    protected int numConsignaciones=0;
    protected int numRetiros=0;
    protected float tasaAnual;
    protected float comMensual=0;
    
    public Cuenta(float saldo, float tasaAnual){
        
        this.saldo=saldo;
        this.tasaAnual=tasaAnual;
        numConsignaciones=numConsignaciones+1;
    }
    
    public void Consignar(float cantidad){
        
        saldo=saldo+cantidad;
    }
    
    public void Retirar(float cantidad){
        
        float nuevoSaldo=saldo-cantidad;
        
        if(nuevoSaldo>=0){
            
            saldo= nuevoSaldo;
        } else{
            
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
        
        numRetiros=numRetiros+1;
    }
    
    public void calcularInteres(){
        
        float tasaMensual= tasaAnual/12;
        
        float interesMensual=saldo*tasaMensual;
        saldo+=interesMensual;
    }
   
    
    public void extractoMensual(){
        
        saldo-=comMensual;
        calcularInteres();
    }
}
