/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author Plaza
 */
public class koneksi {
    public Statement state;
    public Connection connect;
    public String namadatabase = "jdbc:mysql://localhost/db_uas_15311021";
    
    public void koneksidatabase(){
        try {
            connect = DriverManager.getConnection(namadatabase,"root","");
            state = connect.createStatement();
        } catch (SQLException e) {
            System.err.println(""+e);
        }
    }
}
