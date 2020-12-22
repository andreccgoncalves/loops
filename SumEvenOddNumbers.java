/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumevenoddnumbers;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class SumEvenOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.println("Hi. This program will sum Odd and Even Numbers separately, if you want to stop, just press 0 any time!! Cheers.");
        int num;
        int sumOdd = 0;
        int sumEven = 0;

        Scanner myKb = new Scanner(System.in);

        do {
            System.out.println("Please enter a number: ");
            num = myKb.nextInt();

            if (num % 2 == 0) {
                sumEven = sumEven + num;
            } 
            else {
                sumOdd = sumOdd + num;
            }
            
            System.out.println("If you want to stop press 0");
            
        } 
        while (num != 0);
        System.out.println("The sum of the Odd numbers is: " + sumOdd);
        System.out.println("The sum of the Even number is: " + sumEven);

    }
}
