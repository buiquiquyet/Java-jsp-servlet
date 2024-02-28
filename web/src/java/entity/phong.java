
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class phong {
   
    private String tenphong;
    private String giatien;
    private String trangthai;
    private String soluong;
  

  
     public phong( String tenphong,String giatien,String trangthai,String soluong) {
        
        this.tenphong = tenphong;
        this.giatien = giatien;
       this.trangthai = trangthai;
        this.soluong = soluong;
    }


   


public phong(String soluong){
    this.soluong = soluong;
}
    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public phong() {
    }

    
   

    public String getGiatien() {
        return giatien;
    }

    @Override
    public String toString() {
        return "phong{" + " tenphong=" + tenphong + ", giatien=" + giatien + ", trangthai=" + trangthai + ", soluong=" + soluong + '}';
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }


   
  

  

    public String getTenphong() {
        return tenphong;
    }

    

  

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }



  
   

  
    
}
