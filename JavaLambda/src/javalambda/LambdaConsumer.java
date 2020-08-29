/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author Usuario
 */
public class LambdaConsumer {
  public static void LambdaConsumer() {
    ArrayList numbers = new ArrayList();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }    
}

