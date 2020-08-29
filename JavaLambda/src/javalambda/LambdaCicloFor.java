/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
 class LambdaCicloFor {
     public static void LambdaCicloFor() {
        ArrayList numbers = new ArrayList();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );
  }
}
