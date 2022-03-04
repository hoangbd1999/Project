/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author GL552VW
 */
public class Account {

    private int cmnd, phone, money, type;
    private String user, pass, nick, name, address;
    private boolean gender;
    private Date dob;

    public Account() {
    }

    public Account(int cmnd, int phone, int money, int type, String user, String pass, String nick, String name, String address, boolean gender, Date dob) {
        this.cmnd = cmnd;
        this.phone = phone;
        this.money = money;
        this.type = type;
        this.user = user;
        this.pass = pass;
        this.nick = nick;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getCmnd() {
        return cmnd;
    }

    public int getPhone() {
        return phone;
    }

    public int getMoney() {
        return money;
    }

    public int getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getNick() {
        return nick;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean isGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

}
