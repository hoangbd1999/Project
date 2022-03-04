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
import model.KindOfRoom;
import model.PriceOfForm;

/**
 *
 * @author GL552VW
 */
public class PriceofDAO extends DBContext{
     public PriceOfForm getPrice(String kid, String fid) {
        String sql = "SELECT * FROM [PriceOfForm] WHERE [kid] = ? and fid = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, kid);
            statement.setString(2, fid);
            ResultSet rs = statement.executeQuery();
            //cursor
            if (rs.next()) {
                String pid = rs.getString("pid");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                FormOfRent formroom = new FormOfRent();
                formroom.setFid(rs.getString("fid"));
                int price = rs.getInt("price");
                PriceOfForm pof = new PriceOfForm(pid, kindroom, formroom, price);
                return pof;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
     
     public ArrayList<PriceOfForm> getPriceByDay(String fid)
    {
        ArrayList<PriceOfForm> prices = new ArrayList<>();
        try {
            String sql = "SELECT * FROM [PriceOfForm] WHERE fid = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, fid);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                String pid = rs.getString("pid");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                FormOfRent formroom = new FormOfRent();
                formroom.setFid(rs.getString("fid"));
                int price = rs.getInt("price");
                PriceOfForm pof = new PriceOfForm(pid, kindroom, formroom, price);
                prices.add(pof);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PriceofDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prices;
    }
}
