/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
--------------------------------------------------------------------------------
Threads permite que un programa funcione de manera más eficiente al hacer varias
cosas al mismo tiempo.
--------------------------------------------------------------------------------
Los hilos se pueden utilizar para realizar tareas complicadas en segundo plano
sin interrumpir el programa principal.
--------------------------------------------------------------------------------

Curso Java Intermedio #22 | Hilos (Threads) en Java
https://www.youtube.com/watch?v=fiLrTdSKVcE

Curso Java Intermedio #23 | Hilos con parámetros (Threads) en Java
https://www.youtube.com/watch?v=0b1wHDssExQ
 */
package javahilos;
/**
 *
 * @author Usuario
 */
public class JavaHilos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    // cuando es por "implements Runnable"
    ImplementaInterfaz Obj = new ImplementaInterfaz();
    Thread hilo1 = new Thread(Obj);
    // extending    
    extendiendoClaseHilo hilo2 = new extendiendoClaseHilo();
    HiloSimultaneo hilo3 = new HiloSimultaneo();     
     
    hilo1.start();
    // -------------------------------------------------------------------------
    // Si se desea una espera hasta que el hilo1 haya terminado.
    // -------------------------------------------------------------------------
    while(hilo1.isAlive()) {
        System.out.println("Waiting...");
    }
    // -------------------------------------------------------------------------
    // inician los demas hilos ejecutandose al mismo tiempo.
    // -------------------------------------------------------------------------
    hilo2.start();
    hilo3.start();
    }
}
