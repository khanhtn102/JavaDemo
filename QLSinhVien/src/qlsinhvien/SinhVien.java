/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlsinhvien;

/**
 *
 * @author KhanhTN
 */
public class SinhVien {
    private String name;
    private String ID;
    private int age;

    public SinhVien(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    public String ToString(){
        return "Name: " +name+ " --- " +"ID: " +ID+ " --- " +"Age: " +age;
    }
}
