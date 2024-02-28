/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dao.DAO;
import dao.account;
import entity.manager;
import entity.phong;
import java.io.BufferedReader;
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
@WebServlet(name = "xoaSvPhong", urlPatterns = {"/xoaSvPhong"})
@MultipartConfig
public class xoaSvPhong extends HttpServlet {

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
        String id = request.getParameter("cid");
        PrintWriter out = response.getWriter();
            out.println(id);
        DAO a = new DAO();
        account c = new account();
        manager b = a.getsinhvienId1(id);
        String tenphong = a.getPhonghs(id);
        a.xoaSvPhong(id);
         
        c.updateSoluongPhong(tenphong);
        if(  c.getSoluong1( tenphong) >= 4){
            c.updateTrangthai(tenphong);
        }else{
            c.updateTrangthai1(tenphong);
        }
        response.sendRedirect("phongControl");
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
     
        DAO a = new DAO();
        account c = new account();      
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = request.getReader();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } finally {
            reader.close();
        }
        String jsonData = sb.toString();
        JsonArray jsonArray = JsonParser.parseString(jsonData).getAsJsonArray();   
        for (JsonElement element : jsonArray) {
            JsonObject jsonObject = element.getAsJsonObject();
            String column1 = jsonObject.get("column1").getAsString();       
            manager b = a.getsinhvienId1(column1);      
            String tenphong = a.getPhonghs(column1);
            a.xoaSvPhong(column1);
            c.updateSoluongPhong(tenphong);
            if(  c.getSoluong1( tenphong) >= 4){
                c.updateTrangthai(tenphong);
            }else{
                c.updateTrangthai1(tenphong);        
            } 
            JsonObject jsonResponse = new JsonObject();
            response.setStatus(HttpServletResponse.SC_OK);    
        } 
         
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
