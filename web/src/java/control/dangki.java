 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import entity.Product;
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
@WebServlet(name = "dangki", urlPatterns = {"/dangki"})
@MultipartConfig
public class dangki extends HttpServlet {

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
         PrintWriter out = response.getWriter();
		 String username = request.getParameter("user");
			String pass = request.getParameter("pass");
                        String repass = request.getParameter("repass");
                         if(username.equals("") || pass.equals("") || repass.equals("")){
                            request.setAttribute("mess", "Thông tin không được để trống!");
                         request.getRequestDispatcher("dangki.jsp").forward(request, response);
                        }
                        else if(!repass.equals(pass)){
                            request.setAttribute("mess", "Mật khẩu chưa trùng nhau!");
                         request.getRequestDispatcher("dangki.jsp").forward(request, response);
                        }else{
                            

                                DAO con = new DAO();
                                Product a = con.checkDangki(username);
                                if(a == null){
                                     con.dangki(username, pass);
                                     
                                      request.getRequestDispatcher("index1.jsp").forward(request, response);

                                }else{
                                    request.setAttribute("mess", "Tài khoản đã tồn tại!");
                                     request.getRequestDispatcher("dangki.jsp").forward(request, response);
                                }
			

				//request.getRequestDispatcher("index1.jsp").forward(request, response);
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
        request.getRequestDispatcher("dangki.jsp").forward(request, response);
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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  

