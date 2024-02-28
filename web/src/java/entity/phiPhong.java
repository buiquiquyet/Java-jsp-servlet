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
public class phiPhong implements Serializable{
        private String tenphong;
        
        private int thang;
        private float sodien;
        private float dongia;
        private float tienphong;

    public phiPhong(String tenphong, float sodien, float dongia, float tienphong) {
        this.tenphong = tenphong;
        this.sodien = sodien;
        this.dongia = dongia;
        this.tienphong = tienphong;
    }

  
   

    public phiPhong(float sodien, float dongia, float tienphong) {
        this.sodien = sodien;
        this.dongia = dongia;
        this.tienphong = tienphong;
    }

    public phiPhong(String tenphong, int thang,  float sodien, float dongia, float tienphong) {
        this.tenphong = tenphong;
       
        this.thang = thang;
       
        this.sodien = sodien;
        this.dongia = dongia;
        this.tienphong = tienphong;
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

    public float getDongia() {
        return dongia;
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

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setTienphong(float tienphong) {
        this.tienphong = tienphong;
    }

    @Override
    public String toString() {
        return "phiPhong{" + "tenphong=" + tenphong + ", thang=" + thang + ", sodien=" + sodien + ", dongia=" + dongia + ", tienphong=" + tienphong + '}';
    }
        
     
}
