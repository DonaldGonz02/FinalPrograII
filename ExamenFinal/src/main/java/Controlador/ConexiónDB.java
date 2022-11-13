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
        String db = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String Usuario = "root";
        String Password = "";
        
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
