



/**
 *
 * @author Heliton
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn;
    
   public static Connection ConnecrDb(){
       try {
           Class.forName("org.sqlite.JDBC");
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Administrador\\Documents\\NetBeansProjects\\PROD\\Biblioteca");
           return conn;
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   }
}