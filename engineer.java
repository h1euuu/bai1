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
public class engineer extends Officers{
    String department;

    public engineer() {
    }

    public engineer(String department, String name, int yearsold, String gender, String address) {
        super(name, yearsold, gender, address);
        this.department = department;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void InputInfor(){
        super.InputInfor();
        System.out.println("enter department :");
        department = scanner.nextLine();
    }
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| department : "+department+" |");
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    

    
    
    
    
}
