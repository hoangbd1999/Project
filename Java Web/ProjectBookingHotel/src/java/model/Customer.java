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
public class Customer {

    private Account acc;
    private Room room;
    private Date checkin, checkout;
    private FormOfRent formroom;

    public Customer() {
    }

    public Customer(Account acc, Room room, Date checkin, Date checkout, FormOfRent formroom) {
        this.acc = acc;
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;
        this.formroom = formroom;
    }

    public Account getAcc() {
        return acc;
    }

    public Room getRoom() {
        return room;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public FormOfRent getFormroom() {
        return formroom;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public void setFormroom(FormOfRent formroom) {
        this.formroom = formroom;
    }

}
