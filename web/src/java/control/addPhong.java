/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.account;
import dao.phiphong;
import entity.manager;
import entity.phong;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "addPhong", urlPatterns = {"/addPhong"})
@MultipartConfig

public class addPhong extends HttpServlet {

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
           
//               processRequest(request, response);
//                PrintWriter out=response.getWriter();  

                
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
          PrintWriter out=response.getWriter();  
          //out.print(out);
       // String id = request.getParameter("id");
        String tenphong = request.getParameter("tenp_add");
              
               String trangthai = request.getParameter("tt_add");
               String soluong = request.getParameter("sl_add");
                account a = new account();
                phiphong s = new phiphong();
               phong b = a.getPhongId(tenphong);
               if( tenphong.equals("") || soluong.equals("") || trangthai.equals("")){
//                    request.setAttribute("mess", "Điền đầy đủ thông tin!");
//                     request.getRequestDispatcher("addPhong.jsp").forward(request, response);
                        out.print("error");
                        return;
               }
               else if(b == null){
                    a.addPhong(tenphong,trangthai,soluong);
                    s.addPhiPhong(tenphong);
                    response.sendRedirect("phong1");
               }else{
//                   request.setAttribute("mess", "Tên phòng đã tồn tại!");
//                     request.getRequestDispatcher("addPhong.jsp").forward(request, response);
                        out.print("error1");
                        return;
               }
    
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
