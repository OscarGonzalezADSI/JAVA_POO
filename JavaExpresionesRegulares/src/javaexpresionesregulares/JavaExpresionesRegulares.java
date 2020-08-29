/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.




¿Qué es una expresión regular?
Una expresión regular es una secuencia de caracteres que forma un patrón de búsqueda. Cuando busca datos en un texto, puede utilizar este patrón de búsqueda para describir lo que está buscando.

Una expresión regular puede ser un solo carácter o un patrón más complicado.

Las expresiones regulares se pueden utilizar para realizar todo tipo de operaciones de búsqueda y reemplazo de texto .

Java no tiene una clase de expresión regular incorporada, pero podemos importar el java.util.regex paquete para trabajar con expresiones regulares. El paquete incluye las siguientes clases:

Pattern Clase: define un patrón (para usar en una búsqueda)
Matcher Clase: se utiliza para buscar el patrón
PatternSyntaxException Clase: indica un error de sintaxis en un patrón de expresión regular
fuente:
https://www.w3schools.com/java/java_regex.asp
 */
package javaexpresionesregulares;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Usuario
 */
public class JavaExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }    
}

// Outputs Match found