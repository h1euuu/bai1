/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Hi Hieu
 */
public class Officers {
    String name;
    int yearsold;
    String gender;
    String address;

    public Officers() {
    }

    public Officers(String name, int yearsold, String gender, String address) {
        this.name = name;
        this.yearsold = yearsold;
        this.gender = gender;
        this.address = address;
    }

    
    public void ShowInfor() {
        System.out.println("name : "+name+"| gender : "+gender+"| age : "+yearsold+"| address : "+ address+"| ");
        
    }
    
    public void InputInfor(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("enter name : ");
        name = scn.nextLine();
        
        System.out.println("enter age : ");
        yearsold = scn.nextInt();
        
        System.out.println("enter gender : ");
        gender = scn.nextLine();
        
        System.out.println("enter address : ");
        address = scn.nextLine();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsold() {
        return yearsold;
    }

    public void setYearsold(int yearsold) {
        this.yearsold = yearsold;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    
}
