/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlsinhvien;

import java.util.Scanner;

/**
 *
 * @author KhanhTN
 */
public class QLSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String chon;
        ManagerSV m = new ManagerSV();
        
        do{
            System.out.println("*** Quan Ly Sinh Vien ***");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Xoa sinh vien");
            System.out.println("3. Xuat danh sach sinh vien");
            System.out.println("4. Thoat");
            System.out.println("Chon: ");
            sc = new Scanner(System.in);
            chon = sc.nextLine();
            
            switch(chon){
                case "1":{
                    m.NhapSV();
                    break;
                }
                case "2":{
                    System.out.println("2");
                    break;
                }
                case "3":{
                    System.out.println(asdasd);
                    break;
                }
            }
        }
        while(!chon.equals("4"));
        
        
        
    }
    
}
