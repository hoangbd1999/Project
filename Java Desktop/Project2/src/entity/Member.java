/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author GL552VW
 */
public class Member {
    private int mem_id;
    private String mem_name;
    private String mem_address ;
    private String mem_mobile;
    private Date mem_registered_date;
    private boolean mem_active;

    public Member(int mem_id, String mem_name, String mem_address,String mem_mobile, Date mem_registered_date, boolean mem_active ) {
        this.mem_id = mem_id;
        this.mem_name = mem_name;
        this.mem_address = mem_address;
        this.mem_mobile = mem_mobile;
        this.mem_registered_date = mem_registered_date;
        this.mem_active = mem_active;
    }

    public int getMem_id() {
        return mem_id;
    }

    public void setMem_id(int mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public String getMem_address() {
        return mem_address;
    }

    public void setMem_address(String mem_address) {
        this.mem_address = mem_address;
    }

    public String getMem_mobile() {
        return mem_mobile;
    }

    public void setMem_mobile(String mem_mobile) {
        this.mem_mobile = mem_mobile;
    }

    public Date getMem_registered_date() {
        return mem_registered_date;
    }

    public void setMem_registered_date(Date mem_registered_date) {
        this.mem_registered_date = mem_registered_date;
    }

    public boolean isMem_active() {
        return mem_active;
    }

    public void setMem_active(boolean mem_active) {
        this.mem_active = mem_active;
    }
    
    
    
}
