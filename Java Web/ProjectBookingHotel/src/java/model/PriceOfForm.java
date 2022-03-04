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
public class PriceOfForm {
    private String pid;
    private KindOfRoom kindroom;
    private FormOfRent formroom;
    private int price;

    public PriceOfForm() {
    }

    public PriceOfForm(String pid, KindOfRoom kindroom, FormOfRent formroom, int price) {
        this.pid = pid;
        this.kindroom = kindroom;
        this.formroom = formroom;
        this.price = price;
    }

    public String getPid() {
        return pid;
    }

    public KindOfRoom getKindroom() {
        return kindroom;
    }

    public FormOfRent getFormroom() {
        return formroom;
    }

    public int getPrice() {
        return price;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setKindroom(KindOfRoom kindroom) {
        this.kindroom = kindroom;
    }

    public void setFormroom(FormOfRent formroom) {
        this.formroom = formroom;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
