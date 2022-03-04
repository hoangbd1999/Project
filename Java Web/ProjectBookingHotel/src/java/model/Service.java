/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GL552VW
 */
public class Service {
    private String sid,name;
    private int price;
    
    public Service() {
    }

    public Service(String sid, String name, int price) {
        this.sid = sid;
        this.name = name;
        this.price = price;
    }

    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
