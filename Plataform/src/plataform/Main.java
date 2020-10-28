
package plataform;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;


    
public class Main extends JFrame 
{   
    JLabel mensajes;
    private JButton ingresar;
    private final JFrame ventana;
    JTextField caja;
   public Main (){
        ventana = new JFrame("PlataForm");
        setLocationRelativeTo (null);
        ventana.setLayout(null);
        ventana.setLocation(500,200);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setSize(600,400);
        ventana.setContentPane(new JLabel(new ImageIcon("Imagenes/fondo.png")));
        JLabel titulo = new JLabel();
        titulo.setVisible(true);
        titulo.setIcon(new ImageIcon("Imagenes/plataform2.png"));
        ventana.add(titulo);
        titulo.setBounds(0, 0, 400,100);
        
        
        JLabel subfondo = new JLabel();
        subfondo.setVisible(true);
        subfondo.setIcon(new ImageIcon("Imagenes/subfondo.png"));
        ventana.add(subfondo);
        subfondo.setBounds(0, 0, 600,75);
        
        JLabel perfil = new JLabel();
        perfil.setVisible(true);
        perfil.setIcon(new ImageIcon("Imagenes/perfil.png"));
        ventana.add(perfil);
        perfil.setBounds(250, 100, 100,100);
    
        botones();
        cajas();
   }
   private void botones(){
    ingresar = new JButton("Ingresar Reunion");
    ingresar.setVisible(true);
    ingresar.setBounds(200, 275, 200, 25);
    ingresar.setIcon(new ImageIcon("Imagenes/boton1.png"));
    ingresar.setContentAreaFilled(false);
    ingresar.setBorder(null);
    ventana.add(ingresar);
    
   }
   
   private void cajas(){
    caja = new JTextField();
    caja.setVisible(true);
    caja.setBounds (175, 225, 250, 30);
    ventana.add(caja);
   }
   
}

