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
import model.KindOfRoom;

/**
 *
 * @author GL552VW
 */
public class KindRoomDAO extends DBContext {

    public ArrayList<KindOfRoom> getKindroom() {
        ArrayList<KindOfRoom> kindroom = new ArrayList<>();
        String sql = "SELECT * FROM [KindOfRoom]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String kid = rs.getString("kid");
                String kind = rs.getString("kind");

                KindOfRoom k = new KindOfRoom(kid, kind);
                kindroom.add(k);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kindroom;
    }
    
    public KindOfRoom getKindByKid(String kid) {
        String sql = "SELECT * FROM [KindOfRoom] WHERE [kid] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, kid);
            ResultSet rs = statement.executeQuery();
            //cursor
            if (rs.next()) {
                String kid1 = rs.getString("kid");
                String kind = rs.getString("kind");
                KindOfRoom kindroom = new KindOfRoom(kid1, kind);
                return kindroom;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
