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
public class admin {
   
	private String ten;
	private String pass;
	
	public admin() {
	}
	public admin( String ten, String pass) {
		//super();
		
		this.ten = ten;
		this.pass = pass;
	}

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }
	
	
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "account [ ten=" + ten + ", pass=" + pass + "]";
	}
}
