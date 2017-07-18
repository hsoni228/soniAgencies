package soni.agencies.db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu Soni
 */
public class ShopkeeperDetailsDb {

    public ShopkeeperDetailsDb() {

    }

    public boolean saveData(Connection con, String beat, String name, String mobile_no, String gst_no, String adhaar_no, String pan_no, String composition_no) {
        
        String query = "insert into shopkeeper_details(beat, name, mobile_no, gst_no, adhaar_no, pan_no, composition_no)" + 
                " values('"+beat+"','"+name+"','"+mobile_no+"','"+gst_no+"','"+adhaar_no+"','"+pan_no+"','"+composition_no+"')";
        
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Unable to save shopkeeper details", "Error ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean updateData(Connection con, String id, String beat, String name, String mobile_no, String gst_no, String adhaar_no, String pan_no, String composition_no) {
        
        String query = "update shopkeeper_details set beat = '"+beat+"', name = '"+name+"', mobile_no = '"+mobile_no+"', gst_no = '"+gst_no+"', adhaar_no = '"+adhaar_no+"', pan_no = '"+pan_no+"', composition_no = '"+composition_no+"' where id = '"+id+"'";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to update shopkeeper details", "Error ", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public ResultSet getShopkeeperData(Connection con, String beat) {
        
        String query = beat.isEmpty() ? "select * from shopkeeper_details" : "select * from shopkeeper_details where beat = '"+beat+"'";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean deleteData(Connection con, String id) {
        String query = "delete from shopkeeper_details where id = '"+id+"'";
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to delete shopkeeper details", "Error ", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
        return true;
    }
}
