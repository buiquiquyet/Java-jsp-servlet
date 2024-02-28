/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.phi;
import entity.phiPhong;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ADMIN
 */
public class luufile {
            private static PrintWriter pw;
            public static long insert(phi a,phi b, String path) throws  FileNotFoundException, IOException{
               
                String res1 = "QUAN LI KI TUC XA\n" ;
                String res2 = "Ten phong:" + a.getTenphong()+"                                 \n";
                String res3 = "Thang:" + a.getThang()+"                                        \n";
                String res4 = "               " +  "Gia           " + "So luong          " +"Tong             " +"\n";
                String res5 = "Gia dien       "  + "2,340.0       " + b.getSodien()+"            "+"  " + a.getSodien()  +"\n";
                String res6 = "Gia nuoc       "  + "81,110.0      " + b.getSonuoc()+"           "+"   "+ a.getSonuoc() +"\n";
                String res7 = "Gia phong      " +  "300,000.0     " + b.getTienphong()+"          " +"     "+ a.getTienphong()+"\n";
                String res8 = "                                               Tong tien: "+ a.getTongtien()+"\n";
                String res9 ="=====================================================================\n";
                File f = new File(path);
                
                FileWriter fw = new FileWriter(f,true);
                try 
                    (BufferedWriter bw = new BufferedWriter(fw)){
                  
                    bw.write(res1);
                    bw.write(res2);
                    bw.write(res3);
                   
                    bw.write(res4);
                    bw.write(res5);
                    bw.write(res6);
                    bw.write(res7);
                    bw.write(res8);
                    bw.write(res9);
                    bw.write("\n");
                } catch (Exception e) {
                }
                return 0;
    }
    
}
