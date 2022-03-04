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
public class Room {
    String rid,roomnumber;
    private KindOfRoom kindroom;
    private boolean status;

    public Room() {
    }

    public Room(String rid, String roomnumber, KindOfRoom kindroom, boolean status) {
        this.rid = rid;
        this.roomnumber = roomnumber;
        this.kindroom = kindroom;
        this.status = status;
    }

    public String getRid() {
        return rid;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public KindOfRoom getKindroom() {
        return kindroom;
    }

    public boolean isStatus() {
        return status;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public void setKindroom(KindOfRoom kindroom) {
        this.kindroom = kindroom;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
    
}
