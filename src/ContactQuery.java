
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    
    public void insertContact(Contact contact) {
        
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
            }
            else {
                JOptionPane.showMessageDialog(null, "Something Wrong!");
            }


        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editContact(Contact contact, boolean withImage) {
        
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps;
        String updateQuery = "";  
        
        if (withImage == true) {
            updateQuery = "UPDATE `mycontacts` SET `fname`= ?,`lname`= ?,`group`= ?,`phone`= ?,`email`= ?,`address`= ?,`pic`= ? WHERE `id` = ?";
            
            try {
            ps = connection.prepareStatement(updateQuery);
            ps.setString(1, contact.getFname());
            ps.setString(2, contact.getLname());
            ps.setString(3, contact.getGroupc());
            ps.setString(4, contact.getPhone());
            ps.setString(5, contact.getEmail());
            ps.setString(6, contact.getAddress());
            ps.setBytes(7, contact.getPic());
            ps.setInt(8, contact.getCid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contact data was updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Something Wrong!");
            }


        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            updateQuery =  "UPDATE `mycontacts` SET `fname`= ?,`lname`= ?,`group`= ?,`phone`= ?,`email`= ?,`address`= ?, WHERE `id` = ?";
            
                    try {
            ps = connection.prepareStatement(updateQuery);
            ps.setString(1, contact.getFname());
            ps.setString(2, contact.getLname());
            ps.setString(3, contact.getGroupc());
            ps.setString(4, contact.getPhone());
            ps.setString(5, contact.getEmail());
            ps.setString(6, contact.getAddress());
            ps.setInt(7, contact.getCid());
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contact data was updated");
            }
            else {
                JOptionPane.showMessageDialog(null, "Something Wrong!");
            }


            } catch (SQLException ex) {
                Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public void deleteContact(int cid) {
        
        Connection connection = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps = connection.prepareStatement("DELETE FROM `mycontacts` WHERE `id` = ?");
            ps.setInt(1, cid);
            
            if (ps.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Contact was deleted");
            }
            else {
                JOptionPane.showMessageDialog(null, "Something Wrong!");
            }


        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Contact> contactList(int userId) {
        ArrayList<Contact> clist = new ArrayList<>();
        Connection con = MyConnection.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT `id`, `fname`, `lname`, `group`, `phone`, `email`, `address`, `pic` FROM `mycontacts` WHERE userId = " + userId);
            
            Contact ct;
            
            while(rs.next()) {
                ct = new Contact(rs.getInt("id"), 
                               rs.getString("fname"), 
                               rs.getString("lname"),
                               rs.getString("group"),
                               rs.getString("phone"),
                               rs.getString("email"),
                               rs.getString("address"),
                               rs.getBytes("pic"),
                               userId);
                
                clist.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clist;
    }
    
}
