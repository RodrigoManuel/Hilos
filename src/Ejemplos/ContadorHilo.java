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
public class ContadorHilo implements Runnable{  
    Contador contador;
    String nombreHilo;
    //private Thread hilo;
    private long tiempoInicial;
    /**
    * Método principal
    * @param args argumentos de línea de comandos
    * Se inicializa las referencias a los objetos del tipo contador
    * Se crea las instancias para el tipo Runnable para ejecutar los hilos
    * Se inicia las ejecuciones de los hilos.
    */
    public static void main(String[] args) {     
        Contador contador = new Contador(); 
        Contador contador2 = new Contador(); 
        Contador contador3 = new Contador(); 
        Contador contador4 = new Contador(); 
        Runnable hilo1,hilo2,hilo3,hilo4;
        
        long initialTime = System.currentTimeMillis();
        
        for (int i = 0; i < 100; i++) {       
//            Thread hilo = new Thread (new ContadorHilo(contador));        
//            hilo.start();     
            hilo1 = new ContadorHilo (contador, "Hilo1", initialTime);
            hilo2 = new ContadorHilo (contador2,"Hilo2", initialTime);
            hilo3 = new ContadorHilo (contador3,"Hilo3", initialTime);
            hilo4 = new ContadorHilo (contador4,"Hilo4", initialTime);
            
            new Thread (hilo1).start();
            new Thread (hilo2).start();
            new Thread (hilo3).start();
            new Thread (hilo4).start();
        
        }
    } 
    /**
    * Constructor para la serie de contadores
    * @param contador instancia de contador
    * @param nombreHilo nombre del hilo
    * @param tiempoInicial valor inicial para calcular tiempo
    */
    public ContadorHilo (Contador contador, String nombreHilo, long tiempoInicial){     
        this.tiempoInicial = tiempoInicial;
        this.contador=contador;
        //considerar ésta situación si no se desea extender y llamar desde el main
        //como tipo ContadorHilo.
        //hilo = new Thread (this);
        //hilo.start();
        this.nombreHilo = nombreHilo;
    }//cierre del constructor
    /**
    * Método que ejecuta el hilo, se debe escribir aquí lo que se deseea
    * ejecutar como proceso.
    */
    @Override
    public void run() {  
        //se puede probar synchronized (contador)
        contador.sumarContador();     
        System.out.println(contador.getContador() + " del : " + nombreHilo);   
    } //cierre del método
    
} 
