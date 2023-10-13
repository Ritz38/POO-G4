/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alejandro
 */
public class CuentaCorriente extends Cuenta {
    
    float sobregiro;
 
    
    public CuentaCorriente(float saldo, float tasa){
        
        super(saldo,tasa);
        sobregiro=0;
    }
    
    
    public void retirar(float cantidad){
        
        float resultado = saldo - cantidad;
        
        if(resultado<0){
            sobregiro = sobregiro-resultado;
            saldo=0;
        }else{
            super.Retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        
        float residuo= sobregiro-cantidad;
        
        if(sobregiro>0){
            
            if(residuo>0){
                sobregiro=0;
                saldo=residuo;
            }else{
                
                sobregiro=-residuo;
                saldo=0;
            }
        }else{
            
            super.Consignar(cantidad);
        }
    }
    
    public void imprimir(){
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comMensual);
        System.out.println("Número de transacciones = " +
        (numConsignaciones + numRetiros));
        System.out.println("Valor de sogregiro = $" +
        (numConsignaciones + numRetiros));
        System.out.println();
    }
}
