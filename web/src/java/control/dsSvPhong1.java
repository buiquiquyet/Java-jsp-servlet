/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import com.google.gson.Gson;
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
@WebServlet(name = "dsSvPhong1", urlPatterns = {"/dsSvPhong1"})
@MultipartConfig
public class dsSvPhong1 extends HttpServlet {

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
        

      
          String tenphong = request.getParameter("id");
         

         account  a = new account();
    
          phong b = a.getPhongId(tenphong);
        // Tạo một đối tượng Gson
        Gson gson = new Gson();

        // Chuyển đổi dữ liệu sang định dạng JSON
        String json = gson.toJson(b);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
//      request.setAttribute("st", b);
//       // s.updateSvPhong(sid, tenphong);
//         a.updateSoluongPhong(tenphong);
//       request.setAttribute("list", list);
//       if(a.getSoluong1(tenphong) == 4){        
//            a.updateTrangthai(tenphong);  
//       } else{
//                 a.updateTrangthai1(tenphong);    
//                    }
//       request.getRequestDispatcher("phongControl").forward(request, response);
 

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
