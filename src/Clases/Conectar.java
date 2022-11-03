package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    
    Connection cn;
    
    public Connection conexion(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_crud_java","root","");
            
            System.out.println("conectado");
        } catch (Exception e) {
            
            System.err.println(e.getMessage());
        }
        
        return cn;
    }
}
