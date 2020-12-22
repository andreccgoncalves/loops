/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlicenseplateprinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class CarLicensePlatePrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String myFile = "licenses.txt";
        
        Scanner myKb = new Scanner(System.in);
        BufferedWriter myWriter = new BufferedWriter(new FileWriter(myFile, false));
        
        
        System.out.println("Please enter a County name: "); 
        String countyName = myKb.nextLine();
        
        
        System.out.println("Please enter a year between 1990 and 2020: ");
        String carsYear = myKb.nextLine();
        int carsYear1 = Integer.parseInt(carsYear);
        

        
        System.out.println("Please enter a number of License Plates");
        int licensePlates = myKb.nextInt();
        
        if (carsYear1 < 1990 || carsYear1 > 2020) {
            System.out.println("The year must be a number between 1990 and 2020");
        }
        if (licensePlates < 1 || licensePlates > 9999) {
            System.out.println("The number of License Plates has to be between 1 and 9999");
        }
       

        String prefix = carsYear.substring(2,3) + carsYear.substring(3,4)+ "-" + countyName.charAt(0) + "-";
        
        
        for (int i = 1; i <= licensePlates; i++) {
        
            String padding = "";
            
            
            if (licensePlates < 9 ) {
                padding = "0000";
            }                    
            else if (licensePlates < 99 ) {
                padding = "000";
            }
            else if (licensePlates < 999) {
                padding = "00";
            }
            else if (licensePlates < 9999) {
                padding = "0";
            }
            
            myWriter.write(prefix + padding + i);
            myWriter.newLine();
    }
    myWriter.close();
}
}

