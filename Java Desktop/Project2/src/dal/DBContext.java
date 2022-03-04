/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import entity.Book;
import entity.Member;
import entity.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sonnt
 */
public class DBContext {
    Connection connection;
    public DBContext()
    {
        try {
            String user = "hoang";
            String pass= "dunglun95";
            String url = "jdbc:sqlserver://DESKTOP-F6LT6C6\\SQLEXPRESS:1433;databaseName=ManagerTypn";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<User> getUsers()
    {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT [id]\n" +
                        "       ,[user_name]\n  " +
                        "      ,[user_password]\n" +
                        "      ,[user_type]\n" +
                        "      ,[user_active]\n" +
                        "  FROM [lib_user]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next())              
            {  
                int id = rs.getInt("id");
                String user_name = rs.getString("user_name");
                String user_password = rs.getString("user_password");
                String user_type = rs.getString("user_type");
                boolean user_active = rs.getBoolean("user_active");                
                
                User s = new User(id,user_name, user_password, user_type, user_active);
                users.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }
    
    
    public User getUser(int s_id)
    {
        String sql = "SELECT [id]\n" +
                        "      ,[user_name]\n"    +
                        "      ,[user_password]\n" +
                        "      ,[user_type]\n" +
                        "      ,[user_active]\n" +
                        "  FROM [lib_user] WHERE [id] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s_id);
            ResultSet rs = statement.executeQuery();
            //cursor
            if(rs.next())
            {
                int id = rs.getInt("id");
                String user_name = rs.getString("user_name");
                String user_password = rs.getString("user_password");
                String user_type = rs.getString("user_type");
                boolean user_active = rs.getBoolean("user_active");                
                
                User s = new User(id,user_name, user_password, user_type, user_active);
                return s;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    public void insert(User s)
    {
        try {
            String sql = "INSERT INTO [lib_user]\n" +
                    "           ([id]\n" +
                    "           ,[user_name]\n" +
                    "           ,[user_password]\n" +
                    "           ,[user_type]\n" +
                    "           ,[user_active])\n" +
                    "     VALUES\n" +
                    "           (?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getId());
            statement.setString(2, s.getUser_name());
            statement.setString(3, s.getUser_password());
            statement.setString(4, s.getUser_type());
            statement.setBoolean(5, s.isUser_active());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(User s)
    {
        try {
            String sql = "UPDATE [lib_user]\n" +
                        "   SET [user_name] = ?\n" +
                        "      ,[user_password] = ?\n" +
                        "      ,[user_type] = ?\n" +
                        "      ,[user_active] = ?\n " +
                        " WHERE [id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getUser_name());
            statement.setString(2, s.getUser_password());
            statement.setString(3, s.getUser_type());
            statement.setBoolean(4, s.isUser_active());
            statement.setInt(5, s.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void delete(User s)   
    {
        try {
            String sql ="DELETE FROM [lib_user]\n"+
      "WHERE [id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // Update,Insert and Delete Member ----------------------------------------
    
    
    
    public ArrayList<Member> getMembers()
    {
        ArrayList<Member> members = new ArrayList<>();
        String sql = "SELECT [mem_id]\n" +
                        "       ,[mem_name]\n  " +
                        "      ,[mem_address]\n" +
                        "      ,[mem_mobile]\n" +
                        "      ,[mem_registered_date]\n" +
                        "      ,[mem_active]\n" +
                        "  FROM [lib_member_master]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next())              
            {  
                int mem_id = rs.getInt("mem_id");
                String mem_name = rs.getString("mem_name");
                String mem_address = rs.getString("mem_address");
                String mem_mobile = rs.getString("mem_mobile");
                Date mem_registered_date = rs.getDate("mem_registered_date");
                boolean mem_active = rs.getBoolean("mem_active");                
                
                Member s = new Member(mem_id,mem_name, mem_address, mem_mobile, mem_registered_date,mem_active);
                members.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return members;
    }
    
    
    public Member getMember(int s_mem_id)
    {
        String sql = "SELECT [mem_id]\n" +
                        "      ,[mem_name]\n"    +
                        "      ,[mem_address]\n" +
                        "      ,[mem_mobile]\n" +
                        "      ,[mem_registered_date]\n" +
                        "      , [mem_active]\n" +
                        "  FROM [lib_member_master] WHERE [mem_id] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s_mem_id);
            ResultSet rs = statement.executeQuery();
            //cursor
            if(rs.next())
            {
                int mem_id = rs.getInt("mem_id");
                String mem_name = rs.getString("mem_name");
                String mem_address = rs.getString("mem_address");
                String mem_mobile = rs.getString("mem_mobile");
                Date mem_registered_date = rs.getDate("mem_registered_date");
                boolean mem_active = rs.getBoolean("mem_active");                
                
               Member s = new Member(mem_id,mem_name, mem_address, mem_mobile, mem_registered_date,mem_active);
               return s;
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    public void insert(Member s)
    {
        try {
            String sql = "INSERT INTO [lib_member_master]\n" +
                    "           ([mem_id]\n" +
                    "           ,[mem_name]\n" +
                    "           ,[mem_address]\n" +
                    "           ,[mem_mobile]\n" +
                    "           ,[mem_registered_date]\n" +
                    "           ,[mem_active])\n " +
                    "     VALUES\n" +
                    "           (?\n"+
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getMem_id());
            statement.setString(2, s.getMem_name());
            statement.setString(3, s.getMem_address());
            statement.setString(4, s.getMem_mobile());
            statement.setDate(5, s.getMem_registered_date());
            statement.setBoolean(6, s.isMem_active());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Member s)
    {
        try {
            String sql = "UPDATE [lib_member_master]\n" +
                        "   SET [mem_name] = ?\n" +
                        "      ,[mem_address] = ?\n" +
                        "      ,[mem_mobile] = ?\n" +
                        "      ,[mem_registered_date] = ?\n " +
                        "      ,[mem_active] = ?\n " +
                        " WHERE [mem_id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);           
            statement.setString(1, s.getMem_name());
            statement.setString(2, s.getMem_address());
            statement.setString(3, s.getMem_mobile());
            statement.setDate(4, s.getMem_registered_date());
            statement.setBoolean(5, s.isMem_active());
            statement.setInt(6, s.getMem_id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void delete(Member s)   
    {
        try {
            String sql ="DELETE FROM [lib_member_master]\n"+
      "WHERE [mem_id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getMem_id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
    
    
     // Update,Insert and Delete Book ----------------------------------------
    
    
     public ArrayList<Book> getBooks()
    {
        ArrayList<Book> books = new ArrayList<>();
        String sql = "SELECT [book_id]\n" +
                        "       ,[book_title]\n  " +
                        "      ,[book_author]\n" +
                        "      ,[book_publish_year]\n" +
                        "      ,[book_category]\n" +
                        "      ,[book_keyword]\n" +
                        "      ,[book_status]\n  " +
                        "  FROM [lib_book_master]";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            //cursor
            while(rs.next())              
            {  
                int book_id = rs.getInt("book_id");
                String book_title = rs.getString("book_title");
                String book_author = rs.getString("book_author");
                String book_publish_year = rs.getString("book_publish_year");
                String book_category = rs.getString("book_category");
                String book_keyword = rs.getString("book_keyword");
                String book_status = rs.getString("book_status");
                                                            
               Book s = new Book(book_id,book_title, book_author, book_publish_year,book_category,book_keyword,book_status);
               books.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return books;
    }
    
    
    public Book getBook(int s_book_id)
    {
        String sql = "SELECT [book_id]\n" +
                        "      ,[book_title]\n"    +
                        "      ,[book_author]\n" +
                        "      ,[book_publish_year]\n" +
                        "      ,[book_category]\n" +
                        "      , [book_keyword]\n" +
                        "      ,[book_status]" +
                        "  FROM [lib_book_master] WHERE [book_id] = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s_book_id);
            ResultSet rs = statement.executeQuery();
            //cursor
            if(rs.next())
            {
                int book_id = rs.getInt("book_id");
                String book_title = rs.getString("book_title");
                String book_author = rs.getString("book_author");
                String book_publish_year = rs.getString("book_publish_year");
                String book_category = rs.getString("book_category");
                String book_keyword = rs.getString("book_keyword");
                String book_status = rs.getString("book_status");
                                                            
               Book s = new Book(book_id,book_title, book_author, book_publish_year,book_category,book_keyword,book_status);
               return s;
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    public void insertBook(Book s)
    {
        try {
            String sql = "INSERT INTO [lib_book_master]\n" +
                    "           ([book_id]\n" +
                    "           ,[book_title]\n" +
                    "           ,[book_author]\n" +
                    "           ,[book_publish_year]\n" +
                    "           ,[book_category]\n" +
                    "           ,[book_keyword]\n " +
                    "           ,[book_status])\n " +
                    "     VALUES\n" +
                    "           (?\n"+
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?\n" +
                    "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getBook_id());
            statement.setString(2, s.getBook_title());
            statement.setString(3, s.getBook_author());
            statement.setString(4, s.getBook_publish_year());
            statement.setString(5, s.getBook_category());
            statement.setString(6, s.getBook_keyword());
            statement.setString(7, s.getBook_status());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Book s)
    {
        try {
            String sql = "UPDATE [lib_book_master]\n" +
                        "   SET [book_title] = ?\n" +
                        "      ,[book_author] = ?\n" +
                        "      ,[book_publish_year] = ?\n" +
                        "      ,[book_category] = ?\n " +
                        "      ,[book_keyword] = ?\n " +
                        "      ,[book_status] = ?\n " +
                        " WHERE [book_id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);           
            statement.setString(1, s.getBook_title());
            statement.setString(2, s.getBook_author());
            statement.setString(3, s.getBook_publish_year());          
            statement.setString(4, s.getBook_category());          
            statement.setString(5, s.getBook_keyword());         
            statement.setString(6, s.getBook_status());        
            statement.setInt(7, s.getBook_id());
           
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void delete(Book s)   
    {
        try {
            String sql ="DELETE FROM [lib_book_master]\n"+
      "WHERE [book_id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, s.getBook_id());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
  
    
    
    
    
}
