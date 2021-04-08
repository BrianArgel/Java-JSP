/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author devbrian
 */
public class Conexion {
    Connection con; 
    
    public Connection getConection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
            System.out.println("Conectado satisfactoriamente");
        } catch(Exception e) {
            System.out.println("Error en la conexiopn" +e);
        }
        return con;
    }
    
}
