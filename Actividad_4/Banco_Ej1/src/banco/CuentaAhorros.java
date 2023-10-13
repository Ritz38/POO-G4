/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alejandro
 */
public class CuentaAhorros extends Cuenta {
    
        private boolean activa;
    
    
    public CuentaAhorros(float saldo,float tasa){
        super(saldo,tasa);
        
        if(saldo<10000){
        activa=false;
    } else{
            
            activa=true;
        }
}
    
    
    public void Retirar(float cantidad){
        
        if(activa){
            
            super.Retirar(cantidad);
        } 
        
    }
    
    public void Consignar(float cantidad){
        
        if(activa);
        
        super.Consignar(cantidad);
    }
    
    public void ExtractoMensual(){
        
        if(numRetiros>4){
            comMensual+=(numRetiros-4)*1000;
        }
        
        super.extractoMensual();
        
        if(saldo<10000){
            
            activa=false;
        }
    }
    
    public void imprimir(){
        System.out.println("Saldo = $"+saldo);
        
        System.out.println("Comisión mensual = $"+comMensual);
        
        System.out.println("Número de transacciones="+(numConsignaciones+numRetiros));
        
        System.out.println("");
    }
    
}
