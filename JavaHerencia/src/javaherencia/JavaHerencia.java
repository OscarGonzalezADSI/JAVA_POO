/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


Herencia de Java (subclase y superclase)
En Java, es posible heredar atributos y métodos de una clase a otra. Agrupamos 
el "concepto de herencia" en dos categorías:

subclase (hijo): la clase que hereda de otra clase
superclase (padre): la clase que se hereda de
Para heredar de una clase, use la palabra clave extends.

En el siguiente ejemplo, la Carclase (subclase) hereda los atributos y métodos
de la clase Vehicle(superclase)

 */
package javaherencia;

/**
 *
 * @author Usuario
 */

class JavaHerencia extends Vehiculo {
  private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {
        // Create a myCar object
        JavaHerencia myCar = new JavaHerencia();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
