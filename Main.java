/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Hi Hieu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Officers> officerList = new ArrayList<>();
        
        while (true) {
            System.out.println("Application Manager Officer");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To show information officers");
            System.out.println("Enter 3: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("enter the quantity : ");
                            int n = Integer.parseInt(scanner.nextLine());
                            for(int i = 0; i < n; i++){
                                Officers engi = new engineer();
                             engi.InputInfor(); 
                              officerList.add(engi);                       
                            }
                            break;

                        }
                        case "b": {
                            System.out.println("enter the quantity : ");
                            int n = Integer.parseInt(scanner.nextLine());
                            for(int i = 0; i < n; i++){
                            Officers wer = new worker();
                            wer.InputInfor(); 
                            officerList.add(wer);                       
                            }
                            break;
                        }
                        case "c": {
                            System.out.println("enter the quantity : ");
                            int n = Integer.parseInt(scanner.nextLine());
                            for(int i = 0; i < n; i++){
                            Officers stf = new staff();
                            stf.InputInfor(); 
                            officerList.add(stf);                       
                            }
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                
                case "2": {
                    System.out.println("");
                    for(int i = 0; i < officerList.size();i++){
                        officerList.get(i).ShowInfor();
                    }
                    break;
                }
                case "3": {
                    return;
                }
                default:
                    System.out.println("Invalid");
            }

        }


    }
    
}
