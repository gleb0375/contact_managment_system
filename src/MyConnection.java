
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hleb Hnatsiuk
 */
public class MyConnection {
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javacontactsapp?autoReconnect=true&useSSL=false","root","root");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
}
