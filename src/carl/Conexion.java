

package carl;

 import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author arnold
 */
public class Conexion {
    Connection conectar=null;
    
    public Connection conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost/carl","root","root");
            
        } catch (Exception e) {
            
            System.out.print(e.getMessage());
            
        }
        return conectar;
    }
}
