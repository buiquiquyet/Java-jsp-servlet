/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.account;
import entity.manager;
import entity.phong;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "svPhong1", urlPatterns = {"/svPhong1"})
@MultipartConfig
public class svPhong1 extends HttpServlet {

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
       // response.setContentType("text/html;charset=UTF-8");
        /* String id = request.getParameter("id");
          String name = request.getParameter("name");
        String age = request.getParameter("age");
         String diachi = request.getParameter("diachi");
         PrintWriter out = response.getWriter();
                out.println(id);
                  out.println(name);
                   out.println(age);
                      out.println(diachi);
         /*DAO s = new DAO();
         
         s.update(id, name, age, diachi);
         response.sendRedirect("home");*/
        
        
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
        //processRequest(request, response);
        // response.setContentType("text/html;charset=UTF-8");
       // request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
      
           
           
           
          
         DAO  s = new DAO();
           List<manager> list = s.gethsbyPhong();
           
           
        String id = request.getParameter("sid");
        String sid = request.getParameter("cid");
        String tenphong =request.getParameter("id");
        
         // PrintWriter out = response.getWriter();
          //      out.println(sid);
               //   out.println(tenphong);
      account  a = new account();
            String name =a.getTenphong(id);
           phong b = a.getPhongId(id);
        
        request.setAttribute("st", b);
       // s.updateSvPhong(sid, tenphong);
        
       request.setAttribute("lists", list);
       
       
     
        request.getRequestDispatcher("trangchu1.jsp").forward(request, response);
                

        
        
        
        
        /*String sid = request.getParameter("id");
          String name = request.getParameter("name");
        String age = request.getParameter("age");
         String diachi = request.getParameter("diachi");*/
       // PrintWriter out = response.getWriter();
                //out.println(a);
                 /* out.println(name);
                   out.println(age);
                      out.println(diachi);
        
         s.update(sid, name, age, diachi);*/
        
        
        
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
        //processRequest(request, response);
        String id = request.getParameter("id");
         String tenphong = request.getParameter("sid");
      
        PrintWriter out = response.getWriter();
                out.println(tenphong);
                  out.println(id);
                  out.print(tenphong);
                  
      DAO a= new DAO();
      
       a.updateSvPhong(tenphong, id);
       // response.sendRedirect("svPhong1");
      

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
