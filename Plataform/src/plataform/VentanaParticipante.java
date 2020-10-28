
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author Sergio Soliz
 */
public class VentanaParticipante extends JFrame {
    JPanel panel;   
    public VentanaParticipante (){
            this.setSize (500,500);
            setTitle ("LISTA PARTICIPANTES");
            setLocationRelativeTo (null);
            panel();
            mostrar ();
            setDefaultCloseOperation (DISPOSE_ON_CLOSE);
        }
        
        public void panel (){
            panel = new JPanel();
            this.getContentPane().add(panel);
            panel.setLayout (null);
        }
        
        public void mostrar (){
           int i = 30;
           try {
            Connection conex = Conexion.getConexion();
            Statement sta = conex.createStatement();
            ResultSet rs = sta.executeQuery("SELECT Nombres_y_Apellidos FROM Inscritos");
            while (rs.next()){
                String nom = rs.getString("Nombres_y_Apellidos");
                JLabel nombre = new JLabel (nom);
                panel.add(nombre);
                nombre.setVisible (true);
                nombre.setBounds (10,i,300,25);
                i = i +30;
            }
            }catch (SQLException ex){ 
            }
        }
}