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
public class ProblemaConcurrencia extends Thread {
    public static int amount = 0;
    public static void ProblemaConcurrencia() {
        ProblemaConcurrencia thread = new ProblemaConcurrencia();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run() {
        amount++;
    }
}