/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Polimorfismo significa "muchas formas" y ocurre cuando tenemos muchas clases que están relacionadas entre sí por herencia.

Como especificamos en el capítulo anterior; La herencia nos permite heredar atributos y métodos de otra clase. El polimorfismo usa esos métodos para realizar diferentes tareas. Esto nos permite realizar una sola acción de diferentes formas.

Por ejemplo, piense en una superclase llamada Animalque tiene un método llamado animalSound(). Las subclases de animales pueden ser cerdos, gatos, perros, pájaros, y también tienen su propia implementación de un sonido de animal (el cerdo gruñe, el gato maúlla, etc.)
 */
package javapolimorfismo;
/**
 *
 * @author Usuario
 */
public class JavaPolimorfismo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Dog();  // Create a Pig object
        Animal myDog = new Pig();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
