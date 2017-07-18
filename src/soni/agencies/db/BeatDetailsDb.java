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
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu Soni
 */
public class BeatDetailsDb {

    Statement st;

    public BeatDetailsDb() {

    }

    public boolean saveData(Connection con, String beat) {
        
        String query = "insert into beat_details(beat_name) values('"+beat+"')";
        try {
            st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Unable to add beat details", "Error ", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public Set<String> getBeats(Connection conn){
        
        Set<String> beats = new HashSet<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select beat_name from beat_details");
            ResultSet result = ps.executeQuery();
            
            while(result.next()){
                beats.add(result.getString(1));
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } 
        return beats;
    }
    
    public void updateBeat(Connection conn, String oldBeat, String newBeat){
        String query = "update beat_details set beat_name = '"+newBeat+"' where beat_name = '"+oldBeat+"'";
        String query2 = "update shopkeeper_details set beat = '"+newBeat+"' where beat = '"+oldBeat+"'";
        
        try {
            st = conn.createStatement();
            st.executeUpdate(query);
            
            st = conn.createStatement();
            st.executeUpdate(query2);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
