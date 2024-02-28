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
import dao.phiphong;
import dao.luufile;

import entity.manager;
import entity.phong;
import entity.phi;
import java.io.BufferedReader;

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
@WebServlet(name = "phiPhong", urlPatterns = {"/phiPhong"})
@MultipartConfig
public class phiPhong extends HttpServlet {

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
            out.println("<title>Servlet phiPhong</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet phiPhong at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
         response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        float x = 0;
                float y = 0;
        float z = 0;
        int thang = 0;
        request.setAttribute("thang", thang);
             request.setAttribute("x", x);
        request.setAttribute("y", y);
        request.setAttribute("z", z);
           
           
           
          
      
          String tenphong = request.getParameter("sid");
           
           
           
       
          phiphong a = new phiphong();
//        entity.phiPhong b = a.getPhiByPhong();
        List<entity.phiPhong> s = a.getPhi();
       
       request.setAttribute("list", s);
       request.setAttribute("tenphong", tenphong);

        request.getRequestDispatcher("phiPhong.jsp").forward(request, response);
        
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
//         PrintWriter out = response.getWriter();
    
    PrintWriter out = response.getWriter();
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
    // Xử lý chuỗi JSON và trích xuất thông tin cần thiết
    JsonArray jsonArray = JsonParser.parseString(jsonData).getAsJsonArray();

    JsonArray responseArray = new JsonArray();
    for (JsonElement element : jsonArray) {
        JsonObject jsonObject = element.getAsJsonObject();
        String tenphong = jsonObject.get("column1").getAsString();
        String sodiencu = jsonObject.get("column2").getAsString();
        String sodienmoi = jsonObject.get("column3").getAsString();
        
        String dongia = jsonObject.get("column5").getAsString();
        int rowIndex = jsonObject.get("rowIndex").getAsInt();
        float sdc = Float.parseFloat(sodiencu);
        float sdm = Float.parseFloat(sodienmoi);
        
        float dg = Float.parseFloat(dongia);
        if (sdm < sdc) {
            JsonObject responseObj = new JsonObject();
            responseObj.addProperty("error", "Số cuối kì phải cao hơn số đầu kì.");
            responseArray.add(responseObj);
        } else {
            float tong = ((sdm - sdc) * dg);
            phiphong pp = new phiphong();
            pp.update(tenphong,sdm);
            JsonObject responseObj = new JsonObject();
            responseObj.addProperty("kw", sdm - sdc);
            responseObj.addProperty("tong", tong);
            responseObj.addProperty("rowIndex", rowIndex); // Thêm thông tin về chỉ số dòng đã chọn
            responseArray.add(responseObj);
        }
    }

        response.setContentType("application/json");
        out.write(responseArray.toString());


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
