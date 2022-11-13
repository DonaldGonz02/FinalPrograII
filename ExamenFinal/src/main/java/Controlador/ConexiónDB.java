/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author DONALD
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;        
        
public class ConexiónDB {
    Connection con = null;
    public Connection Conectar(){
        String db = "jdbc:mysql://localhost:3306/bd_ventas";
        String Usuario = "root";
        String Password = "722435";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(db, Usuario, Password);
            //JOptionPane.showMessageDialog(null, "Conexión Existosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexión"+e);
    }
        return con;
    }
}
