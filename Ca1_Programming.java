/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1_programming;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Andre Goncalves  
 * Student Number: 2020195
 */
public class Ca1_Programming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String myFileName = "people.txt"; //Name of the file that will be read 
        String newFile = "status.txt"; // New file's name

        try {

            Scanner myFile = new Scanner(new FileReader(myFileName)); //FileReader
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(newFile, false));  // File Writer  

            while (myFile.hasNext()) { //Loop that will read all the lines in the file

                //Full name is the file's first line
                String fullName = myFile.nextLine();
                String name = fullName.substring(0, fullName.indexOf(" "));
                String surname = fullName.substring(fullName.indexOf(" "));

                //Reading the second line, age into an Integer
                String age1 = myFile.nextLine();
                int age = Integer.parseInt(age1);

                //reading the third line - gender
                String gender = myFile.nextLine();

                if (name.matches("[a-zA-Z]+") || surname.matches("[a-zA-Z]+")) { //Only letter allowed

                    //If conditions to create the first line of the new file
                    if (gender.equals("M")) {
                        myWriter.write("Mr" + surname + ", " + name.substring(0, 1));
                        myWriter.newLine();
                    } else if (gender.endsWith("F")) {
                        myWriter.write("Ms" + surname + ", " + name.substring(0, 1));
                        myWriter.newLine();
                    } else if (gender.equals("T")) {
                        myWriter.write("Mx" + surname + ", " + name.substring(0, 1));
                        myWriter.newLine();
                    } else { //if the letters is neither M, F or T a message will appear in the outpu
                        System.out.println("Error - Gender has to be one of the following letters: M, F or T");
                    }

                    // if conditions to create the second line according to the person's age
                    if (age >= 0 && age <= 18) {
                        myWriter.write("School");
                        myWriter.newLine();
                    } else if (age >= 19 && age <= 25) {
                        myWriter.write("College");
                        myWriter.newLine();
                    } else if (age >= 26 && age <= 66) {
                        myWriter.write("Worker");
                        myWriter.newLine();
                    } else if (age >= 67 && age <= 100) {
                        myWriter.write("Retired");
                        myWriter.newLine();
                    } else if (age > 100) { // if the age is more than 100 a message will show in the output
                        System.out.println("Error - The age must be a number between 0 and 100");
                    }

                    myWriter.newLine();

                } else { //in case there's a number or special character in the name
                    System.out.println("The name must be ONLY letters");
                }

            }
            myWriter.close(); //closing the writer

        } catch (Exception e) { //catching any exceptions that might appear
            System.out.println("error");
        }
    }
}