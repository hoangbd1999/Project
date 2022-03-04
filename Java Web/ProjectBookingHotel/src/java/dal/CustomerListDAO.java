/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Customer;
import model.CustomerList;
import model.FormOfRent;
import model.Room;

/**
 *
 * @author GL552VW
 */
public class CustomerListDAO extends DBContext{
    public List<CustomerList> getAllCustomers() {
        List<CustomerList> list = new ArrayList<>();
        String sql = "select * from customer";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){                
                String username = rs.getString("username");
                String rid = rs.getString("rid");
                String name = rs.getString("name");
                String fid = rs.getString("fid");               
                Date from = rs.getDate("checkin");
                Date to = rs.getDate("checkout");
                
                CustomerList s = new CustomerList(username, rid, name, fid, from, to);
                list.add(s);
            }
        } catch (SQLException ex) {
         Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
}
