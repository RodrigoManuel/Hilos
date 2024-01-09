/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class AppHilo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        ClaseHilo2 h1, h2;
        h1 = new ClaseHilo2 ("Primer hilo");
        h2 = new ClaseHilo2 ("Segundo hilo");
        //se pone en marcha la ejecución de los dos hilos
        h1.start();
        h2.start();
    }
}
