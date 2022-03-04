/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.ArrayList;
import model.Room;

/**
 *
 * @author GL552VW
 */
public class NewClass {
    public static void main(String[] args) {
       double sum =4;
        int tong = (int) Math.ceil(sum);
        int loai1 =1;
        int loai2 =2;
        int loai3 =2;
         RoomDAO r = new RoomDAO();
        int check=0;
           for (int k = loai3; k >= 0; k--) {
            for (int j = loai2; j >= 0; j--) {
                for (int i = loai1; i >= 0; i--) {
                    if ((1 * i + 2 * j + 3 * k) == tong) {
                        ArrayList<Room> list = new ArrayList<>();
                        if(i!=0) list.addAll(r.getTopRoomBykid(i, "k01"));
                        if(j!=0) list.addAll(r.getTopRoomBykid(j, "k02"));
                        if(k!=0) list.addAll(r.getTopRoomBykid(k, "k03"));
                        String s="";
                        for(Room room: list){
                            s=s+room.getRoomnumber();
                        }
                        System.out.println(s);
                        check=1;
                        break;
                    }
                }
                if(check==1) break;
            }
             if(check==1) break;
        }
    }
}
