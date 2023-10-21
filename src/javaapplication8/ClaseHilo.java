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
        //Cuando un hilo es interrumpido mientras está en espera, duerme u ocupado.
        //Algún código llama al método interrupt()
        catch(InterruptedException er) {
            System.out.println("Excepcion " + er);
        }
        System.out.println("Fin de la ejecución de " + entrada);
    }
}
