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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KindOfRoom;
import model.Room;

/**
 *
 * @author GL552VW
 */
public class RoomDAO extends DBContext {
    public ArrayList<Room> getRooms(boolean status){
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "Select * From [Room] where status =?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, status);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next()){
                String rid = rs.getString("rid");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                String roomnumber = rs.getString("roomnumber");
                Room r = new Room(rid, roomnumber, kindroom, status);
                rooms.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rooms;
    }
       public ArrayList<Room> getTopRoomBykid(int top,String kid){
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "Select top (?) * from Room where kid =? and Status= 0";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, top);
            statement.setString(2, kid);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next()){
                String rid = rs.getString("rid");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                String roomnumber = rs.getString("roomnumber");
                Room r = new Room(rid, roomnumber, kindroom, status1);
                rooms.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rooms;
    }
           public int getCountRoomByKidStatus(String kid){
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "Select count(*) as sRoom From [Room] where kid = ? and Status= 0";
        try {
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setString(1, kid);
            ResultSet rs = statement.executeQuery();
            
            //cursor
            if(rs.next()){
                int count =rs.getInt("sRoom");
                return count;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
    public ArrayList<Room> getKindRooms1(){
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "Select * From [Room] where kid ='k01'";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);      
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next()){
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                Room r = new Room(sql, sql, kindroom, true);
                rooms.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rooms;
    }
    public int getKindRoom1() {
        int count = 0;
        String sql = "Select * From [Room] where kid ='k01'";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                count = rs.getInt("kid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
   
    
    public ArrayList<Room> getRoomByDate(Date from, Date to){
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "SELECT r.rid as id,r.kid,r.status,r.roomnumber FROM [Room] r INNER JOIN [Customer] c ON r.rid = c.rid where c.checkin > ? or c.checkout < ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, to);
            statement.setDate(2, from);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next()){
                String rid = rs.getString("id");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                String roomnumber = rs.getString("roomnumber");
                Room r =new Room(rid, roomnumber, kindroom, status1);
                rooms.add(r);
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rooms;
    }
    
    public Room getRoomByRid(String rid) {
        String sql = "SELECT * FROM [Room] WHERE [rid] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, rid);
            ResultSet rs = statement.executeQuery();
            //cursor
            if (rs.next()) {
                String rid1 = rs.getString("rid");
                String roomnumber = rs.getString("roomnumber");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                Room room = new Room(rid1, roomnumber, kindroom, status1);
                return room;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
     public Room getRoomByNum(String roomnum) {
        String sql = "SELECT * FROM [Room] WHERE [roomnumber] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, roomnum);
            ResultSet rs = statement.executeQuery();
            //cursor
            if (rs.next()) {
                String rid1 = rs.getString("rid");
                String roomnumber1 = rs.getString("roomnumber");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                Room room = new Room(rid1, roomnumber1, kindroom, status1);
                return room;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
     
    public void updateRoom(Room r) {
        try {
            String sql = "UPDATE [dbo].[Room]\n" +
                        "   SET [Roomnumber] = ?\n" +
                        "      ,[KID] = ?\n" +
                        "      ,[Status] = ?\n" +
                        " WHERE [RID] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,  r.getRoomnumber());
            statement.setString(2,  r.getKindroom().getKid());
            statement.setBoolean(3,  r.isStatus());
            statement.setString(4,  r.getRid());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Room> getRoomByDate(Date from, Date to, String kid, boolean status) {
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "SELECT r.rid as id,r.kid,r.status,r.roomnumber FROM [Room] r INNER JOIN [Customer] c ON r.rid = c.rid where c.checkin > ? or c.checkout < ? \n"
                + "UNION\n"
                + "Select r.rid as id,r.kid,r.status,r.roomnumber as id FROM [Room] r where r.[status] = ? ";
        if (kid!=null) {
            sql += " AND r.[kid] = ?";
        }
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, to);
            statement.setDate(2, from);
            statement.setBoolean(3, status);
            if (kid!=null) {
                statement.setString(4, kid);
            }
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String rid = rs.getString("id");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                String roomnumber = rs.getString("roomnumber");
                Room r = new Room(rid, roomnumber, kindroom, status1);
                rooms.add(r);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rooms;
    }
    
     public ArrayList<Room> paging(int pageindex,int pagesize,Date from, Date to, String kid, boolean status) {
        ArrayList<Room> rooms = new ArrayList<>();
        String sql = "SELECT id,KID,status,roomnumber FROM\n"
                + "        (SELECT *,ROW_NUMBER() OVER (ORDER BY ID ASC) as row_num FROM  \n"
                + "		(SELECT r.rid as id,r.kid,r.status,r.roomnumber FROM [Room] r INNER JOIN [Customer] c ON r.rid = c.rid where c.checkin > ? or c.checkout < ?\n"
                + "			UNION\n"
                + "			Select r.rid as id,r.kid,r.status,r.roomnumber FROM [Room] r where r.[status] = ? ";
                if (kid!=null) {
                    sql += " AND r.[kid] = ?\n";
                }
                sql += "		) tblRooms\n"
                + "		) tblRoom\n"
                + "        WHERE row_num =(?-1)*?+1 ";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDate(1, to);
            statement.setDate(2, from);
            statement.setBoolean(3, status);
            int index = 4;
            if (kid!=null) {
                statement.setString(4, kid);
                index++;
            }
            statement.setInt(index, pageindex);
            statement.setInt(index+1, pagesize);
            ResultSet rs = statement.executeQuery();
            //cursor
            while (rs.next()) {
                String rid = rs.getString("id");
                KindOfRoom kindroom = new KindOfRoom();
                kindroom.setKid(rs.getString("kid"));
                boolean status1 = rs.getBoolean("status");
                String roomnumber = rs.getString("roomnumber");
                Room r = new Room(rid, roomnumber, kindroom, status1);
                rooms.add(r);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rooms;
    }
     
      public int count(Date from, Date to, String kid, boolean status)
    {
        String sql = "SELECT COUNT(*) as rownum FROM\n" +
"        (SELECT r.rid as id,r.kid,r.status,r.roomnumber,ROW_NUMBER() OVER (ORDER BY r.rID ASC) as row_num FROM [Room] r INNER JOIN [Customer] c ON r.rid = c.rid where c.checkin > ? or c.checkout < ?\n" +
"			UNION\n" +
"			Select r.rid as id,r.kid,r.status,r.roomnumber,ROW_NUMBER() OVER (ORDER BY r.rID ASC) as row_num FROM [Room] r where r.[status] = ? ";
        if (kid!=null) {
                    sql += " AND r.[kid] = ?\n";
                }
sql+="		) tblRoomCount";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, to);
            ps.setDate(2, from);
            ps.setBoolean(3, status);
            if (kid!=null) {
                ps.setString(4, kid);
            }
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                return rs.getInt("rownum");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return -1;
    }
      
}
