/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KhanhTN
 */
public class ManagerSV {
    ArrayList<SinhVien> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void NhapSV(){
        String chon,name,ID;
        int age;
        
        do{
            System.out.println("1. Nhap");
            System.out.println("2. Thoat");
            System.out.println("Chon:");
            sc = new Scanner(System.in);
            chon = sc.nextLine();
            
            switch(chon){
                case "1":{
                    System.out.println("Ten:");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();
                    
                    System.out.println("ID:");
                    sc = new Scanner(System.in);
                    ID = sc.nextLine();
                    
                    System.out.println("Age: ");
                    age = sc.nextInt();
                    
                    SinhVien sv = new SinhVien(name, ID, age);
                    array.add(sv);
                    break;
                }
            }
        }
        while(!chon.equals("2"));
    }
    
}
