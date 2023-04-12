
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ContactQuery {
    
    public boolean insertContact(Contact contact) {
        
        boolean contactIsCreated = true;
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = connection.prepareStatement("INSERT INTO `mycontacts`(`fname`, `lname`, `group`, `phone`, `email`, `address`, `pic`, `userid`) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, contact.getFname());
            ps.setString(2, contact.getLname());
            ps.setString(3, contact.getGroupc());
            ps.setString(4, contact.getPhone());
            ps.setString(5, contact.getEmail());
            ps.setString(6, contact.getAddress());
            ps.setBytes(7, contact.getPic());
            ps.setInt(8, contact.getUid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "New Contact Added!");
                    contactIsCreated = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Something Wrong!");
                contactIsCreated = false;
            }


        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contactIsCreated;
    }
    
}
