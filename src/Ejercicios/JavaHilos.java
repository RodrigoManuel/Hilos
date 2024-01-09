package Ejercicios;

/**
 *
 * @author Rodrigo
 */
public class JavaHilos extends Thread {
 String nombreCorredor;
 public JavaHilos (int prioridad,String nombre){
    this.nombreCorredor = nombre;
    setPriority(prioridad);
}
 public void run(){
    for(int c=1;c<=30;c++){
        System.out.println(c + "a. vuelta -" + nombreCorredor + "/");
        yield(); 
    }
    System.out.println("\n Llego a la meta " + nombreCorredor);    
}
 static JavaHilos corredorUno;
 static JavaHilos corredorDos;
 static JavaHilos corredorTres;
 
 public static void main(String []args) throws InterruptedException {
 
    corredorUno = new JavaHilos(1," Senna ");
    corredorDos = new JavaHilos(5," Frost ");
    corredorTres = new JavaHilos(8," Räikkönen ");

    System.out.println("Sale " + corredorUno.nombreCorredor + "");
    corredorUno.start();
    System.out.println("Sale " + corredorDos.nombreCorredor + "");
    corredorDos.start();
    System.out.println("Sale " + corredorTres.nombreCorredor + "\n");
    corredorTres.start();

    corredorUno.join();
    corredorDos.join();
    corredorTres.join();
 }
}