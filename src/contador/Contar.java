/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador;

/**
 *
 * @author Rodrigo
 */
public class Contar {   
    public static void main(String[] args) {     
        Contador contador = new Contador();     
        for (int i = 0; i < 10; i++) {       
            Thread hilo = new Thread (new ContadorHilo(contador));        
            hilo.start();     
        }   
    } 
}
