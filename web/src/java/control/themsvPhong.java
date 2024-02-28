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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "themsvPhong", urlPatterns = {"/themsvPhong"})
@MultipartConfig
public class themsvPhong extends HttpServlet {

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
//        String id = request.getParameter("cid");
//        DAO s = new DAO();
//        account v = new account();
//        List<phong> c = v.getTenphong();
//        manager a = s.getsinhvienId(id);
//        request.setAttribute("st", a);
//        request.setAttribute("list", c);

         PrintWriter out = response.getWriter();

      
       
       
//         request.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
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
//        processRequest(request, response);
//        String id = request.getParameter("id");
//        String tenphong = request.getParameter("tenphong");
//         // PrintWriter out = response.getWriter();
//            //    out.println(tenphong);
//              //  out.print(id);
//              account c = new account();
//              phong b = c.getPhongId(tenphong);
//              //phong x;
//              //PrintWriter out = response.getWriter();
//               //out.println(name);
//              
//               if(tenphong == " "){
//                   request.setAttribute("mess", "Nhập tên phòng!");
//                                              request.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
//               }else{
//                    if(b != null){
//                 
//                    
//                            if(  c.getSoluong1(tenphong) < 4){
//                               
//                                   DAO a = new DAO();
//                                a.updateSvPhong(tenphong, id);
//                                
//                                c.updateSoluongPhong(tenphong);
//                                c.updateTrangthai1(tenphong);
//                                if(c.getSoluong1(tenphong) == 4){
//                                     c.updateTrangthai(tenphong);
//                                }
//
//                                 //khong can updateSoluong.jsp và updateSoluong.java
//
//                            }else{
//                               
//                                 c.updateTrangthai(tenphong);
//                                  c.getSoluong1(tenphong);
//                                                 request.setAttribute("mess", "Phòng đã đầy!");
//                                                  DAO s = new DAO();
//                          manager a = s.getsinhvienId(id);
//                                                  request.setAttribute("st", a);
//                                                 request.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
//                                                
//                            }
//                            response.sendRedirect("phongControl");
//                    
//                    }else{
//                         request.setAttribute("mess", "Tên phòng không tồn tại!");
//                          DAO s = new DAO();
//                          manager a = s.getsinhvienId(id);
//                          request.setAttribute("st", a);
//                     //.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
//                      request.getRequestDispatcher("themvaoPhong.jsp").forward(request, response);
//
//              }
//               }
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
         DAO a = new DAO();
          account c = new account();
    int count = jsonArray.size();
    JSONObject jsonObject1 = new JSONObject();
    if(count <= 4){   
        for (JsonElement element : jsonArray) {
            JsonObject jsonObject = element.getAsJsonObject();
            String column1 = jsonObject.get("column1").getAsString();
            String column2 = jsonObject.get("column2").getAsString(); 
            if(  c.getSoluong1(column2) < 4){   
                a.updateSvPhong(column2, column1);

                c.updateSoluongPhong(column2);
                c.updateTrangthai1(column2);
                if(c.getSoluong1(column2) == 4){
                    c.updateTrangthai(column2);
                    
                }
                jsonObject1.put("key1", "success"); 

            }else{
                jsonObject1.put("key2", "error");
                 }
        }
    }else{
        jsonObject1.put("key3", "warning");
    }
    String jsonString = jsonObject1.toString();
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().write(jsonString);

         
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
