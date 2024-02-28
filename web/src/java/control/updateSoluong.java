/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.account;
import entity.manager;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "updateSoluong", urlPatterns = {"/updateSoluong"})
@MultipartConfig
public class updateSoluong extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet themsvPhong</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet themsvPhong at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
       // processRequest(request, response);
        String id = request.getParameter("tenphong");
      //  DAO s = new DAO();
       // manager a = s.getsinhvienId(id);
       // request.setAttribute("st", a);
       PrintWriter out = response.getWriter();
                out.println(id);
       
       
        // request.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
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
       // String id = request.getParameter("id");
        String tenphong = request.getParameter("tenphong");
        String soluong = request.getParameter("soluong");
          //PrintWriter out = response.getWriter();
            //    out.println(tenphong);
              account a = new account();
            int i = Integer.parseInt(soluong);
            if(i == 4){
                a.updateTrangthai(tenphong);
            }else{
                a.updateTrangthai1(tenphong);
            }
          
            a.updateSoluong(tenphong, soluong);
            response.sendRedirect("phongControl");
            //request.getRequestDispatcher("dsSvPhong.jsp").forward(request, response);
                //out.print(id);
        // DAO a = new DAO();
        // a.updateSvPhong(tenphong, id);
         //response.sendRedirect("phongControl");
         
         
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
