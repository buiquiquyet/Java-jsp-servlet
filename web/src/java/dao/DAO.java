/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.Test;
import entity.Product;
import entity.admin;
import entity.manager;
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
public class DAO {
    
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
   

        	public List<manager> getAllManager() {
		
		try {
			List<manager> list = new ArrayList<>();
			
			String query = ("Select * from hocsinh1 ORDER BY id asc");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
		
		while (rs.next()) {
				
		    manager a = new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                    rs.getString("tenphong"));
                   
		    list.add(a);
		    
		    
		    // Ghi vào vector
		}
		return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
                public List<manager> getAllManager1(String tenphong) {
		
		try {
			List<manager> list = new ArrayList<>();
			
			String query = ("Select * from hocsinh1 where tenphong = ? ORDER BY id asc");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                         ps.setString(1,tenphong);
			rs = ps.executeQuery();
		
		while (rs.next()) {
				
		    manager a = new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                    rs.getString("tenphong"));
                   
		    list.add(a);
		    
		    
		    // Ghi vào vector
		}
		return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
                
                public String getPhonghs(String id){
                      String tenphong = null ;
                       try {
                       String query = ("select tenphong from hocsinh1 where id = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        rs = ps.executeQuery();
                        
                        if(rs.next()){
                           tenphong = rs.getString(1);
                        }
                  } catch (Exception e) {
                  }
                      return tenphong;
                  }
                public List<manager> getTensangPhong() {
		
		try {
			List<manager> list = new ArrayList<>();
			
			String query = ("Select distinct ten from hocsinh1,phong2");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
		
		while (rs.next()) {
				
		    manager a = new manager(rs.getString("ten"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi")
		   );
		    list.add(a);
		    
		    
		    // Ghi vào vector
		}
		return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
                
                public List<manager> gethsbyPhong() {
		
		try {
			List<manager> list = new ArrayList<>();
			
			String query = ("Select * from hocsinh1 where tenphong is NULL");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                      
			rs = ps.executeQuery();
		
		while (rs.next()) {
				
		    manager a = new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                    rs.getString("tenphong"));
                   
		    list.add(a);
		    
		    
		    // Ghi vào vector
		}
		return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
                 public List<manager> getPhongxemSv(String tenphong) {
		
		try {
			List<manager> list = new ArrayList<>();
			
			String query = ("Select * from hocsinh1 where tenphong = ?");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                         ps.setString(1,tenphong);
			rs = ps.executeQuery();
		
		while (rs.next()) {
				
		    manager a = new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                    rs.getString("tenphong"));
                   
		    list.add(a);
		    
		    
		    // Ghi vào vector
		}
		return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
                public void addManager(String id, String name, String age, String diachi) {
		manager a = new manager();
		try {
			//List<manager> list = new ArrayList<>();
			
			String query = ("insert into hocsinh1(id,ten,age,diachi) values(?,?,?,?)");
			conn = new Test().getConnection();
			ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        ps.setString(2, name);
                        ps.setString(3, age);
                        ps.setString(4, diachi);
                    int n = ps.executeUpdate();
		    
		    if(n > 0){
                        System.out.println("ok");
                    }else{
                        System.out.println("ko");
                    }
		    // Ghi vào vector
		
		//return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
                public Product Login(String user,String pass) {
		
		

			try {
				String query = ("Select username,pass from dangnhap1 where username =? and pass =?");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		    ps.setString(2,pass);
		   
			rs = ps.executeQuery();

		while(rs.next()) {
			Product a = new Product(
					rs.getString("username"),
					rs.getString("pass"));
			return a;
		}

			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
			
	}
             
                 public admin LoginAdmin(String user,String pass) {
		
		

			try {
				String query = ("Select ten,pass from admin where ten =? and pass =?");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		    ps.setString(2,pass);
		   
			rs = ps.executeQuery();

		while(rs.next()) {
			admin a = new admin(
					rs.getString("ten"),
					rs.getString("pass"));
			return a;
		}

			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
			
	}
                public Product checkDangki(String user) {
		
		

			try {
				String query = ("Select * from dangnhap1 where username =? ");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		
			rs = ps.executeQuery();

		while(rs.next()) {
			Product a = new Product(
					rs.getString("username"),
					rs.getString("pass"));
			return a;
		}

			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
			
	}
                 public admin admincheckDangki(String user) {
		
		

			try {
				String query = ("Select * from admin where ten =? ");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		
			rs = ps.executeQuery();

		while(rs.next()) {
			admin a = new admin(
					rs.getString("ten"),
					rs.getString("pass"));
			return a;
		}

			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
			
	}
                 public void admindangki(String user,String pass) {
		
		

			try {
				String query = ("insert into admin values (?,?)");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		    ps.setString(2,pass);
		   
			 ps.executeUpdate();

		

			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
	}
                 public void dangki(String user,String pass) {
		
		

			try {
				String query = ("insert into dangnhap1 values (?,?)");
				conn = new Test().getConnection();
				ps = conn.prepareStatement(query);
		    ps.setString(1,user);
		    ps.setString(2,pass);
		   
			 ps.executeUpdate();

		

			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
	}
              public void delete(String id){
		String query = ("delete from hocsinh1 where id = ? ");
                  try {
                      conn = new Test().getConnection();
                	ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        ps.executeUpdate();
      
                  } catch (Exception e) {
                  }

              } 
              public manager getsinhvienId(String name){
                 
                  try {
                       String query = ("select * from hocsinh1 where id = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,name);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                            rs.getString("tenphong"));
                          
                        }
                  } catch (Exception e) {
                  }

                  
                  return null;
              }
               public manager getsinhvienId1(String id){
                 
                  try {
                       String query = ("select * from hocsinh1 where id = ?");
                       conn = new Test().getConnection();
                      ps = conn.prepareStatement(query);
                        ps.setString(1,id);
                        rs = ps.executeQuery();
                        while(rs.next()){
                            return new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                            rs.getString("tenphong"));
                          
                        }
                  } catch (Exception e) {
                  }

                  
                  return null;
              }
             public void update(String id, String ten, String age, String diachi){
                 String query = "update hocsinh1 set  ten = ?, age = ?, diachi = ?  where id = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1, ten);
                 ps.setString(2,age);
                 ps.setString(3,diachi);
               
                 ps.setString(4, id);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
               public void xoaSvPhong(String id){
                 String query = "update hocsinh1 set tenphong = null  where id = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                
                 ps.setString(1,id);
               
               

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
               public void updateSvPhong(String tenphong,String id){
                 String query = "update hocsinh1 set tenphong = ? where id = ?";
                 try {
                    conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1, tenphong);
               
                 ps.setString(2, id);

                 ps.executeUpdate();
                 } catch (Exception e) {
                 }
 
             }
               public void updateSvNull(String tenphong){
                   String query = "update hocsinh1 set tenphong = NULL where tenphong = ?";
                   try{
                       conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1, tenphong);
                 ps.executeUpdate();

                   }catch(Exception e){
                      
                   }
                  
               }
            public List<manager> find(String name){
                 String query = "select * from hocsinh1 where ten like  ? ";
                 try {
                     List<manager> list = new ArrayList<>();
                      conn = new Test().getConnection();
                 ps = conn.prepareStatement(query);
                 ps.setString(1,'%' + name + '%');
                 rs = ps.executeQuery();
                 while(rs.next()){
                     manager a = new manager(rs.getString("id"),
		    rs.getString("ten"),
		    rs.getString("age"),
		     rs.getString("diachi"),
                     rs.getString("tenphong"));
                          
                     list.add(a);
                 }
                 return list;
                 } catch (Exception e) {
                 }
                 return null;
             }
            
           public static void main(String[] args) {
                        DAO s = new DAO();
         
        List<manager> list = s.getAllManager1("102");
        
        for( manager b : list){
            System.out.println(b);
        }
                    
                    
           }             
    
}


