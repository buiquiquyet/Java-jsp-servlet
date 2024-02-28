/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class phi implements Serializable{
        private String tenphong;
        
        private int thang;
        private float sodien;
        private float sonuoc;
        private float tienphong;
        private float tongtien;

    public phi(String tenphong, float sodien, float sonuoc, float tienphong) {
        this.tenphong = tenphong;
        this.sodien = sodien;
        this.sonuoc = sonuoc;
        this.tienphong = tienphong;
    }

  
   

    public phi(float sodien, float sonuoc, float tienphong) {
        this.sodien = sodien;
        this.sonuoc = sonuoc;
        this.tienphong = tienphong;
    }

    public phi(String tenphong, int thang,  float sodien, float sonuoc, float tienphong,float tongtien) {
        this.tenphong = tenphong;
       
        this.thang = thang;
       
        this.sodien = sodien;
        this.sonuoc = sonuoc;
        this.tienphong = tienphong;
        this.tongtien = tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public float getTongtien() {
        return tongtien;
    }
      

    public String getTenphong() {
        return tenphong;
    }

    
    public int getThang() {
        return thang;
    }

    

    public float getSodien() {
        return sodien;
    }

    public float getSonuoc() {
        return sonuoc;
    }

    public float getTienphong() {
        return tienphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

   

    public void setThang(int thang) {
        this.thang = thang;
    }

   

    public void setSodien(float sodien) {
        this.sodien = sodien;
    }

    public void setSonuoc(float sonuoc) {
        this.sonuoc = sonuoc;
    }

    public void setTienphong(float tienphong) {
        this.tienphong = tienphong;
    }

    @Override
    public String toString() {
        return "phi{" + "tenphong=" + tenphong + ", thang=" + thang + ", sodien=" + sodien + ", sonuoc=" + sonuoc + ", tienphong=" + tienphong + ", tongtien=" + tongtien + '}';
    }

 
  
        
     
}
