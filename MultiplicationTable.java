/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKb = new Scanner(System.in);
        
        System.out.println("Please enter a positive number: ");
        int num = myKb.nextInt();
    
    
    for (int i = 1; i <= 10; i++) {
   
       
        System.out.println(num + " * " + i + " = " + num * i);
}
    
}
}
