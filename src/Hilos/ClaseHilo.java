package Hilos;

/**
 *
 * @author Rodrigo
 */
import java.lang.Thread;

public class ClaseHilo implements Runnable {
    private Thread hilo;
    private String entrada;
    public ClaseHilo (String m) {
        entrada = m;
        hilo = new Thread (this);
        hilo.start();
    }
    public void run(){
        System.out.println("Comienza ejecución de : " + entrada);
        try {
            Thread.sleep(10000);
        }
        catch(InterruptedException er) {
            System.out.println("Excepcion " + er);
        }
        System.out.println("Fin de la ejecución de " + entrada);
    }
}
