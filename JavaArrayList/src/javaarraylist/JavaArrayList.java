/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;
/*
 *
 * @author Usuario
 */

public class JavaArrayList {
    public static void main(String[] args) { 
        Encapsulacion myObj7 = new Encapsulacion();
        myObj7.setName("aaa", "bbb", "ccc");
        myObj7.setName("ddd", "eee", "fff");
        System.out.println(myObj7.getName());
    }
}