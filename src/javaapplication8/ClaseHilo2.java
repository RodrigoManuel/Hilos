/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class ClaseHilo2 extends Thread {
    private String entrada;
    public ClaseHilo2 (String m) {
        entrada = m;
    }
    public void run(){
        System.out.println("Comienza ejecución de : " + entrada);
        try {
            System.out.println("Duerme");
            sleep(10000);
        }
        //Cuando un hilo es interrumpido mientras está en espera, duerme u ocupado.
        //Algún código llama al método interrupt()
        catch(InterruptedException er) {
            System.out.println("Excepcion " + er);
        }
        System.out.println("Fin de la ejecución de " + entrada);
    }
}
