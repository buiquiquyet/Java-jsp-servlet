/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.Test;
import entity.Product;
import entity.manager;
import entity.phong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class account {
    
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
 
            public List<phong> getPhong(){
                 String query = "select * from phong2 ORDER BY tenphong ASC";
                 try {
                     List<phong> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                
                 rs = ps.executeQuery();
                 while(rs.next()){
                     phong a = new phong(
		    rs.getString("tenphong"),
                     rs.getString("giatien"),
                     rs.getString("trangthai"),
                     rs.getString("soluong"));
		  
		    
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
            
             public List<phong> getTenphong(){
                 String query = "select tenphong from phong2 ";
                 try {
                     List<phong> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                
                 rs = ps.executeQuery();
                 while(rs.next()){
                     phong a = new phong(
		    rs.getString("tenphong"),
                     rs.getString("giatien"),
                     rs.getString("trangthai"),
                     rs.getString("soluong"));
		  
		    
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
            
           
            
             
         public void addPhong( String tenphong, String trangthai, String soluong) {
		
		try {
			//List<manager> list = new ArrayList<>();
			
			String query = ("insert into phong2(tenphong,trangthai,soluong) values(?,?,?)");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                       
                        ps.setString(1, tenphong);
                       
                        ps.setString(2, trangthai);
                       ps.setString(3, soluong);

                        
		    
                   
		   
                    ps.executeUpdate();
		    
		    
		    // Ghi vào vector
		
		//return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
             public void updatePhong(String tenphong, String trangthai, String soluong ){
                 String query = "update phong2 set   trangthai=?,soluong =? where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 
                 
                 ps.setString(1,trangthai);
                 ps.setString(2,soluong );
                 ps.setString(3, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
             public void updateSoluong(String tenphong,String soluong ){
                 String query = "update phong2 set soluong =? where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
               
                 ps.setString(1,soluong );
                 ps.setString(2, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
              public void delete(String id){
		String query = ("delete from phong2 where tenphong = ? ");
                  try {
                      conn = new Test().getConnection();
                	ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        ps.executeUpdate();
      
                  } catch (Exception e) {
                  }

              }
            
              public phong getSoluong(String id){
                  
                   try {
                       String query = ("select distinct soluong from hocsinh1 inner join phong2 on hocsinh1.id = ? and phong2.tenphong = hocsinh1.tenphong");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new phong(
		    rs.getString("tenphong"),
                      rs.getString("giatien"),
		    rs.getString("trangthai"),
		     rs.getString("soluong"));
                          
                        }
                  } catch (Exception e) {
                  }

                  
                  return null;
              }
                public void updateTrangthai(String tenphong ){
                 String query = "update phong2 set trangthai = 'HET  ' where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
               
               
                 ps.setString(1, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
                 public void updateTrangthai1(String tenphong ){
                 String query = "update phong2 set trangthai = 'CON  ' where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
               
               
                 ps.setString(1, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
                    public void updateSoluongPhong(String tenphong ){
                 String query = "update phong2 set soluong =  (select distinct count(ten) as soluong from hocsinh1 inner join phong2 on hocsinh1.tenphong = phong2.tenphong  AND phong2.tenphong = ?) where tenphong = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
               
               
                 ps.setString(1, tenphong);
                   ps.setString(2, tenphong);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
                  public int getSoluong1(String tenphong){
                      int soluong = 0;
                       try {
                       String query = ("select soluong from phong2 where tenphong = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,tenphong);
                        rs = ps.executeQuery();
                        
                        if(rs.next()){
                           soluong = rs.getInt(1);
                        }
                  } catch (Exception e) {
                  }
                      return soluong;
                  }
                  
                  public String getTenphong(String tenphong){
                      String name = null;
                       try {
                       String query = ("select tenphong from phong2 where tenphong = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,tenphong);
                        rs = ps.executeQuery();
                        
                        if(rs.next()){
                           name = rs.getString(1);
                        }
                  } catch (Exception e) {
                  }
                      return name;
                  }
               public phong getPhongId(String tenphong){
                 
                  try {
                       String query = ("select * from phong2 where tenphong = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,tenphong);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new phong(
		    rs.getString("tenphong"),
                      rs.getString("giatien"),
		    rs.getString("trangthai"),
		     rs.getString("soluong"));
                          
                        }
                  } catch (Exception e) {
                  }

                  
                  return null;
              }
               public List<phong> find(String name){
                 String query = "select * from phong2 where tenphong like  ? ";
                 try {
                     List<phong> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1,'%' + name + '%');
                 rs = ps.executeQuery();
                 while(rs.next()){
                     phong a = new phong(
		    rs.getString("tenphong"),
                     rs.getString("giatien"),
                       rs.getString("trangthai"),
                                    rs.getString("soluong"));
		   
		    
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
                 public List<phong> timFull(String name){
                 String query = "select * from phong2 where trangthai like  ?  ORDER BY tenphong asc ";
                 try {
                     List<phong> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1,'%' + name + '%');
                 rs = ps.executeQuery();
                 while(rs.next()){
                     phong a = new phong(
		    rs.getString("tenphong"),
                     rs.getString("giatien"),
                       rs.getString("trangthai"),
                                    rs.getString("soluong"));
		   
		    
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
                 
                 public phong tenphong(String tenphong){
                        try {
                       String query = ("select tenphong from phong2 where tenphong = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,tenphong);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new phong(rs.getString("tenphong"));
                          
                        }
                  } catch (Exception e) {
                  }

                  
                  return null;
                     
                    
                 }
                 
                 public phong soluong(String soluong){
                     
                       try {
                       String query = ("select distinct count(ten) as soluong from hocsinh1 inner join phong2 on hocsinh1.tenphong =  phong2.tenphong and phong2.tenphong = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,soluong);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new phong(rs.getString("soluong"));
                          
                        }
                  } catch (Exception e) {
                  }
                     return null;
                 }
           public static void main(String[] args) {
                        account  s = new account();
                       phong a = s.soluong("8");
                        System.out.println( a);
                       
              
                     
                      
    }
}


