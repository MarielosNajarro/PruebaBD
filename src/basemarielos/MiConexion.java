/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basemarielos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiConexion {
    Connection con;
    String bd = "cine";
    String url = "jdbc:mysql://localhost:3306/"+bd;
    String user="root";
    String pass="tacos97";
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("> Se conecto");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("> ERROR en la conexion");
        }
        return con;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("> Error al tratar de cerrar la conexion");
        }
    }
}
