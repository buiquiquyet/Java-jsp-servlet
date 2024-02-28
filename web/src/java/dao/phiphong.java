/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author ADMIN
 */

import connect.Test;
import entity.phiPhong;
import entity.phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.apache.coyote.http11.Constants.a;
import org.eclipse.jdt.internal.compiler.batch.Main;

public class phiphong {
    
    
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
         public List<phiPhong> getPhi(){
                 String query = "select * from tienthang ";
                 try {
                     List<phiPhong> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                
                 rs = ps.executeQuery();
                 while(rs.next()){
                     phiPhong a = new phiPhong(rs.getString("tenphong"),
		    rs.getInt("sodien"),
                     rs.getInt("dongia"),
                    rs.getInt("tienphong"));
                   
		  
		    
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
         public  phiPhong getPhiByPhong(){
             
                 String query = "select * from tienthang";
                 try {
                     
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
              
                 rs = ps.executeQuery();
                while(rs.next()){
                        return new phiPhong(rs.getFloat("sodien"),
                                rs.getFloat("dongia"),
                                rs.getFloat("tienphong")
                                
                        );   
                 }
               
                 } catch (Exception e) {
                 }
                 return null;
             }
          public void delete(String id){
		String query = ("delete from tienthang where tenphong = ? ");
                  try {
                      conn = new Test().getConnection();
                	ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        ps.executeUpdate();
      
                  } catch (Exception e) {
                  }

              }
         public void addPhiPhong( String tenphong) {
		
		try {
			//List<manager> list = new ArrayList<>();
			
			String query = ("insert into tienthang(tenphong,sodien,dongia) values(?,'0','2281')");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                       
                        ps.setString(1, tenphong);
                       
                      

                        
		    
                   
		   
                    ps.executeUpdate();
		    
		    
		    // Ghi vào vector
		
		//return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
         public void update(String tenphong, float sodien){
                 String query = "update tienthang set  sodien = ?  where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setFloat(1, sodien);
                
                 
               
                 ps.setString(2, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
           public static void main(String[] args) {
               phiphong a = new phiphong();
              phiPhong b = a.getPhiByPhong();
              
               System.out.println(b);
                       
                     
                      
    }
    
}
