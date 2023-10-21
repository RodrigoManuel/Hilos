/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

/**
 *
 * @author Rodrigo
 */
public class ContadorHilo implements Runnable{  
    Contador contador;   
    
    public ContadorHilo (Contador contador){     
        this.contador=contador;   
    }
    
    @Override
    public void run() {  
        synchronized (contador){
            contador.incrementar();     
            System.out.println(contador.valor());   
        }
    } 
    
} 
