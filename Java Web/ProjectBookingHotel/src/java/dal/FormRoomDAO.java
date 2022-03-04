/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.FormOfRent;

/**
 *
 * @author GL552VW
 */
public class FormRoomDAO extends DBContext {
     public ArrayList<FormOfRent> getFormroom(){
        ArrayList<FormOfRent> formroom = new ArrayList<>();
        String sql = "SELECT * FROM [FormOfRent]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String fid = rs.getString("fid");
                String form = rs.getString("form");

                FormOfRent f = new FormOfRent(fid, form);
                formroom.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return formroom;
    }
    public FormOfRent getFormByFid(String fid) {
        String sql = "SELECT * FROM [FormOfRent] WHERE [fid] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fid);
            ResultSet rs = statement.executeQuery();
            //cursor
            if (rs.next()) {
                String fid1 = rs.getString("fid");
                String form = rs.getString("form");
                FormOfRent formroom = new FormOfRent(fid1, form);
                return formroom;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
