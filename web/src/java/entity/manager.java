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
public class manager {
    private String ten;
	private String id;
	private String age;
	private String diachi;
        private String tenphong;
       
	 
	public manager() {
		// TODO Auto-generated constructor stub
	}
		
	public manager(String id, String ten, String age, String diachi) {
		
		this.ten = ten;
		this.id = id;
		this.age = age;
		this.diachi = diachi;
               
	}
        public manager(String id, String ten, String age, String diachi,String tenphong) {
		
		this.ten = ten;
		this.id = id;
		this.age = age;
		this.diachi = diachi;
               this.tenphong = tenphong;
	}
        public manager(String ten,String age, String diachi){
            this.ten = ten;
            this.age = age;
		this.diachi = diachi;
        }
public manager(String ten){
    this.ten = ten;
}
    public String getTen() {
        return ten;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getDiachi() {
        return diachi;
    }

   

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    @Override
    public String toString() {
        return "manager{" + "ten=" + ten + ", id=" + id + ", age=" + age + ", diachi=" + diachi + ", tenphong=" + tenphong + '}';
    }

  

	

   
	
	
}
