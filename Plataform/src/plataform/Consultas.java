/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataform;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

/**
 *
 * @author Sergio Soliz
 */
public class Consultas {
    
       public static boolean buscar (String nom){
        boolean existe = false;
        try {
            Connection conex = Conexion.getConexion ();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT Nombres_y_Apellidos FROM Inscritos");
            while (rs.next()){
                if (nom.equals(rs.getString("Nombres_y_Apellidos"))){
                    existe = true;
                }
            }
            }catch (SQLException ex){    
        }
        return existe;
    }
}
