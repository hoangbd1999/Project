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
public class CustomerList {
    private String username;
    private String rid;
    private String name;
    private String fid;
    private Date checkin, checkout;

    public CustomerList() {
    }

    public CustomerList(String username, String rid, String name, String fid, Date checkin, Date checkout) {
        this.username = username;
        this.rid = rid;
        this.name = name;
        this.fid = fid;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
   
}
