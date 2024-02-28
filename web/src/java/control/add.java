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
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "add", urlPatterns = {"/add"})
@MultipartConfig
public class add extends HttpServlet {

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
                //response.setContentType("text/html;charset=UTF-8");
              /* String sname = request.getParameter("name");
        String sid = request.getParameter("id");
                String sage =request.getParameter("age");
               String sdiachi = request.getParameter("diachi");
                DAO  s = new DAO();
                /*PrintWriter out = response.getWriter();
                out.println(sname);
                  out.println(sid);
                   out.println(sage);
                      out.println(sdiachi);
                s.addManager(sname,sid,sage,sdiachi);
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
        String sname = request.getParameter("name");
        String sid = request.getParameter("id");
                String sage =request.getParameter("age");
               String sdiachi = request.getParameter("diachi");
            
                DAO  s = new DAO();
               /* PrintWriter out = response.getWriter();
                out.println(sname);
                  out.println(sid);
                   out.println(sage);
                      out.println(sdiachi);*/
              //manager b = new manager("1","1","1","1");  
              //  account  b = new account();
               //   List<phong> a = b.getPhong();
              // request.setAttribute("lista", a);
              manager b = s.getsinhvienId(sid);
              if(sname.equals("")|| sid.equals("")  || sage.equals("")||sdiachi.equals("")){
//                   request.setAttribute("mess", "Điền đầy đủ thông tin!");
//                     request.getRequestDispatcher("add.jsp").forward(request, response);
//                    response.sendRedirect("home");
                        out.print("error");
                        return;
//                               response.sendRedirect("home");
              }
              else if(b == null){
                  
                   s.addManager(sname,sid,sage,sdiachi);
                 response.sendRedirect("home");
                 
              }else{
//                   request.setAttribute("mess", "Mã sinh viên đã tồn tại!");
//                     request.getRequestDispatcher("home").forward(request, response);
//                    response.sendRedirect("home");
                        out.print("error1");
                        return;
              }
          
              
             
    
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
