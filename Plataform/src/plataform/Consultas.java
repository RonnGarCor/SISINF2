
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas{
    
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