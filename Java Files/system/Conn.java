
package electricity.billing.system;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
        c= DriverManager.getConnection("jdbc:mysql://localhost:3306/EBS","root", "H.arharMahadev1");
        s= c.createStatement();
    } catch(Exception e){
        e.printStackTrace();
    }
    }
}
