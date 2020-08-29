/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalambda;

/**
 *
 * @author Usuario
 */
public class LambdaComoParametro {
    public static void LambdaComoParametro() {
      StringFunction exclaim = (s) -> s + "!";
      StringFunction ask = (s) -> s + "?";
      printFormatted("Hello", exclaim);
      printFormatted("Hello", ask);
    }
    static void printFormatted(String str, StringFunction format) {
      String result = format.run(str);
      System.out.println(result);
    }
}
