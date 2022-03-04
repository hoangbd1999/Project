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
public class KindOfRoom {

    private String kid, kind;

    public KindOfRoom() {
    }

    public KindOfRoom(String kid, String kind) {
        this.kid = kid;
        this.kind = kind;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKid() {
        return kid;
    }

    public String getKind() {
        return kind;
    }

}
