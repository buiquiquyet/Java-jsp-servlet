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
import org.json.JSONObject;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "chuyenPhong", urlPatterns = {"/chuyenPhong"})
@MultipartConfig
public class chuyenPhong extends HttpServlet {

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
//        String id = request.getParameter("id");
//       // String tenphong = request.getParameter("tenphong");
//       //PrintWriter out = response.getWriter();
//                //out.println(id);
//       DAO s = new DAO();
//     // manager a = s.getsinhvienId(id);
//       // request.setAttribute("st", a);
//        DAO a = new DAO();
//          manager b = a.getsinhvienId1(id);
//      
//          request.setAttribute("sl", b);
//       request.setAttribute("sll", b);
//      a.xoaSvPhong(id);
//    
//           request.getRequestDispatcher("chuyenPhong.jsp").forward(request, response);
       // response.sendRedirect("updateSoluong");
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
//                String id = request.getParameter("id");
//                String tenphong = request.getParameter("tenphong");
//                String tenphongcu = request.getParameter("tenphongcu");
//               
//                // response.sendRedirect("updateSoluong");
//                    account c = new account();
//              phong b = c.getPhongId(tenphong);
//              
//              //phong x;
//              //PrintWriter out = response.getWriter();
//               //out.println(name);
//             
//               if(tenphong == ""){
//                    request.setAttribute("mess", "Nhập vào phòng muốn chuyển!");
//               }else{
//                   if(b != null){
//                          
//                     if(c.getSoluong1(tenphong) == 4){
//                          
//                           request.setAttribute("mess", "Phòng bạn muốn chuyển đã đầy!");
//                            DAO a = new DAO();
//                           manager k = a.getsinhvienId1(id);
//                        request.setAttribute("sll", k);
//                             request.getRequestDispatcher("chuyenPhong.jsp").forward(request, response);
//                     }else{
//
//                                     DAO a = new DAO();
//                                            a.updateSvPhong(tenphong, id);
//                                      a.getPhonghs(id);
//                                      c.updateSoluongPhong(tenphongcu);
//                                      c.updateSoluongPhong(tenphong);
//
//
//                                      if(  c.getSoluong1(tenphong) >= 4){
//                                                          c.updateTrangthai(tenphong);
//                                                            c.updateTrangthai1(tenphongcu);
//                                      }else{
//                                           c.updateTrangthai1(tenphongcu);
//                                          
//                                      }
//                        }
//                     
//                        response.sendRedirect("phongControl");
//                    }else{
//
//                         request.setAttribute("mess", "Tên phòng không tồn tại!");
//                          DAO a = new DAO();
//                          manager z = a.getsinhvienId(id);
//
//                          request.setAttribute("sll", z);
//                     request.getRequestDispatcher("chuyenPhong.jsp").forward(request, response);
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
            String column3 = jsonObject.get("column3").getAsString();
            if(column2.equals(column3) ){
                jsonObject1.put("key4", "error3"); 
            }else{
                if(column2.equals("") ){
                jsonObject1.put("key1", "error"); 
                }else{
                    if(c.getSoluong1(column2) == 4){

                        jsonObject1.put("key2", "error1"); 

                    }else{

                        a.updateSvPhong(column2, column1);
                        a.getPhonghs(column1);
                        c.updateSoluongPhong(column3);
                        c.updateSoluongPhong(column2);

                        if(  c.getSoluong1(column2) >= 4){
                            c.updateTrangthai(column2);
                            c.updateTrangthai1(column3);
                        }else{
                            c.updateTrangthai1(column3);

                        }
                        jsonObject1.put("key3", "success"); 
                    }
                
                }
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
