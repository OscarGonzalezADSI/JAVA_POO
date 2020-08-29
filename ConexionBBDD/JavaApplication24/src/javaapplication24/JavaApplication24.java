/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


conexion a bases de datos mysql
 */
package javaapplication24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // jdbc:mysql://localhost:3306/ {{base}} ?serverTimezone=UT
        // https://es.stackoverflow.com/questions/48935/configurar-zona-horaria-jdbc-driver-java
        
    String ruta = "jdbc:mysql://localhost:3306/competencia?serverTimezone=UTC";
    String usuario = "root";
    String pass = "";    
        try{
            Connection conexion = DriverManager.getConnection(ruta, usuario, pass);
            System.out.println("si");
        }catch(SQLException e){
            System.out.println(e.toString());
            System.out.println("no");
        }
    }
}

