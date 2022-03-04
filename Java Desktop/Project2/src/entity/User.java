/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author sonnt
 */
public class User {
    private int id;
    private String user_name;
    private String user_password ;
    private String user_type;
    private boolean user_active;

    public User(int id, String user_name, String user_password,String user_type, boolean user_active ) {
        this.id = id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_type = user_type;
        this.user_active = user_active;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public boolean isUser_active() {
        return user_active;
    }

    public void setUser_active(boolean user_active) {
        this.user_active = user_active;
    }

   
    
}
