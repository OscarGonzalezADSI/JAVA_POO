/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahilos;

/**
 *
 * @author Usuario
 */
public class HiloSimultaneo extends Thread {
    public static int amount = 0;
    public void run() {
        System.out.println("Inicia Hilo");  
        amount++;
        System.out.println(amount);
        System.out.println("Termina Hilo");
    }
}