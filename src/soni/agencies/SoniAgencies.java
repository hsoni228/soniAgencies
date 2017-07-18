/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soni.agencies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author YATRAONLINE\himanshu.soni
 */
public class SoniAgencies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/soni_agencies", "root", "root");
            
            SoniAgenciesData data = new SoniAgenciesData(conn);
            data.setVisible(true);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Unable to make connection. Please try again later ...", "Error Message: ", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
}
