/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreammenu;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class IceCreamMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        boolean valid = false;

        do {

            System.out.println("Ice Cream Menu:");

            String option1 = "Raspberry";
            String option2 = "Chocolate";
            String option3 = "Vanilla";
            String option4 = "Leave Shop";

            System.out.println(option1);
            System.out.println(option2);
            System.out.println(option3);
            System.out.println(option4);

            System.out.println("Please pick one flavour");

            Scanner myKb = new Scanner(System.in);
            String input = myKb.nextLine();

            if (input.equals(option1)) {
                System.out.println("You are picking Raspberry");
                valid = false;
            } else if (input.equals(option2)) {
                System.out.println("You are picking Chocolate");
                valid = false;
            } else if (input.equals(option3)) {
                System.out.println("You are picking Vanilla");
                valid = false;
            } else if (input.equals(option4)) {
                System.out.println("Thanks for shopping with us!!");
                valid = true;
            }

            while (input == option4) {
                System.out.println("Thanks for shopping with us!!");
                valid = true;
                break;
            }

        } while (!valid);
    }
}




        
         



