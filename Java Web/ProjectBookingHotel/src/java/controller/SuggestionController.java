/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.RoomDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Room;

/**
 *
 * @author GL552VW
 */
public class SuggestionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RoomDAO r = new RoomDAO();
        int c = Integer.parseInt(request.getParameter("c"));
        int d = Integer.parseInt(request.getParameter("d"));
        double sum = (double) c + (double) d * 0.5;
        int tong = (int) Math.ceil(sum);
        int loai1 = r.getCountRoomByKidStatus("k01");
        int loai2 = r.getCountRoomByKidStatus("k02");
        int loai3 = r.getCountRoomByKidStatus("k03");

        int check = 0;
        String s = "";
        for (int k = loai3; k >= 0; k--) {
            for (int j = loai2; j >= 0; j--) {
                for (int i = loai1; i >= 0; i--) {
                    if ((1 * i + 2 * j + 3 * k) == tong) {
                        ArrayList<Room> list = new ArrayList<>();
                        if (i != 0) {
                            list.addAll(r.getTopRoomBykid(i, "k01"));
                        }
                        if (j != 0) {
                            list.addAll(r.getTopRoomBykid(j, "k02"));
                        }
                        if (k != 0) {
                            list.addAll(r.getTopRoomBykid(k, "k03"));
                        }

                        for (Room room : list) {
                            s = s + ","+ room.getRoomnumber();
                        }
                        check=1;
                        break;
                    }
                }
                if (check == 1) {
                    break;
                }
            }
            if (check == 1) {
                break;
            }
        }
        if (check == 0) {
            request.setAttribute("c", c);
            request.setAttribute("d", d);
            request.setAttribute("goiy", "k có gợi ý nào phù hợp");
            request.getRequestDispatcher("/view/book.jsp").forward(request, response);
        }
        else{
            request.setAttribute("goiy", s);
            request.setAttribute("c", c);
            request.setAttribute("d", d);
            request.getRequestDispatcher("/view/book.jsp").forward(request, response);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
