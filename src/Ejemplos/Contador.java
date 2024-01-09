/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

/**
 * Esta clase define objetos que representan un indice de nombre contador y 
 * sus operaciones de suma y el retorno del valor actual para la instancia.
 * @author: Rodrigo
 * @version: 21/10/2023
 */

public class Contador {
    int contador;

    /**
    * Constructor para la serie de números 
    */
    public Contador() {
        contador = 0;
    }//cierre del constructor
    /**
    * Método que incrementa el indice de la instancia
    */
    public void sumarContador() {     
        contador++;   
    }   //cierre del método
    /**
    * Método que devuelve el valor actual del indice.
    * @return contador el valor actual del indice.
    */
    public int getContador() {
        return contador;   
    }   //cierre del método
}
