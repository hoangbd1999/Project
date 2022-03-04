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
public class Invoice {

    private Account acc;
    private Service service;
    private Room room;
    private Date invoicedate;
    
    public Invoice() {
    }

    public Invoice(Account acc, Service service, Room room, Date invoicedate) {
        this.acc = acc;
        this.service = service;
        this.room = room;
        this.invoicedate = invoicedate;
    }

    public Account getAcc() {
        return acc;
    }

    public Service getService() {
        return service;
    }

    public Room getRoom() {
        return room;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }
    
}
