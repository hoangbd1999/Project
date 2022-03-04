/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GL552VW
 */
public class DBContext {
    protected Connection connection;
    public DBContext() {
        try {
            String user = "hoang";
            String pass = "Dunglun95";
            String url = "jdbc:sqlserver://DESKTOP-F6LT6C6\\GL552VW:1433;databaseName=BookHotel";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     
}
