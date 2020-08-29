/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class Encapsulacion {
   
    // private = restricted access
    private String nombre;
    private String apellido;
    private String cedula;
    ArrayList<String> cars;
    ArrayList<String> coleccion;

    public Encapsulacion() {
        this.cars = new ArrayList<>();
        this.coleccion = new ArrayList<>();
    }

    // Getter
    public ArrayList<String> getName() {
        String dato;
        for (int i = 0; i < coleccion.size(); i++) {
            dato = coleccion.get(i);
            dato = dato.replace(",", "");
            dato = dato.replace("[", "");
            dato = dato.replace("]", "");
            System.out.println(dato);
        }
        return coleccion;
    }

    // Setter
    public void setName(String BxNombre, String BxApellido, String BxCedula) {
    this.nombre = BxNombre;
    this.apellido = BxApellido;
    this.cedula = BxCedula;
    cars.add(nombre);
    cars.add(apellido);
    cars.add(cedula);
    coleccion.add(cars.toString());
    cars.clear();
    }
}
