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
public class staff extends Officers{
    String task;

    public staff() {
    }

    public staff(String task, String name, int yearsold, String gender, String address) {
        super(name, yearsold, gender, address);
        this.task = task;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void InputInfor(){
        super.InputInfor();
        System.out.println("enter level :");
        task = scanner.nextLine();
    }
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| task : "+task+" |");
    }
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    
    
}
