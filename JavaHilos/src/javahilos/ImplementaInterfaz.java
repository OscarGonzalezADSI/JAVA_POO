/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



Si la clase implementa la interfaz Runnable, el hilo se puede ejecutar pasando
una instancia de la clase al Threadconstructor de un objeto y luego llamando al
start()método del hilo :
 */
package javahilos;

/**
 *
 * @author Usuario
 */
public class ImplementaInterfaz implements Runnable {
    @Override
    public void run() {
        System.out.println("Hilo Implementar Interfaz");
    }
}
