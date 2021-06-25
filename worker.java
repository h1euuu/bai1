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
public class worker extends Officers{
    int level;

    public worker() {
    }

    public worker(int level, String name, int yearsold, String gender, String address) {
        super(name, yearsold, gender, address);
        this.level = level;
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void InputInfor(){
        super.InputInfor();
        System.out.println("enter level :");
        level = scanner.nextInt();
    }
    @Override
    public void ShowInfor(){
        super.ShowInfor();
        System.out.println("| level : "+level+" |");
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level>=0&&level<=10){
            this.level = level;
        }else{
            System.err.println("Level( 0 -> 10)!");
        }
        
    }
    
}
