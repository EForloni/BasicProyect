package com.mycompany.java_crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    
    private Connection conectar = null;
    
    String usuario="root";
    String contrasenia="root";
    String bd="dbcontactos";
    String ip="localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null,"Se establecio conexion con la bd");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la bd"+e.toString());
        }
        
        return conectar;
    }
}
