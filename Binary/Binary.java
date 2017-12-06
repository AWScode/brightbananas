/*
Program Name: Binary.java
Programmer: Maggie
Date: Dec 13, 2017
*/

import java.util.Scanner;
import java.math.*;

public class Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean keepGoing = false;

        /*
         * Ask the user to input the first binary number
         */
        System.out.print("Please enter a binary number : ");
        String a = input.nextLine();
        int size = a.length();

        /*
         * Check if the first input goes over '1'
         */
         for (int s = 0; s < size; s++) {
             if (str.charAt(s) != '0' && str.charAt(s) != '1') {
                 System.out.println("OOPS...This is not a binary number.");
                 size = 0;
                 main(args);
                 break;
             } else {
                 keepGoing = true;
             }

         }

         /*
          * Ask the user to input the second binary number
          */
        System.out.print("Please enter another binary number : ");
        String b = input.nextLine();
        int size = b.length();

        /*
         * Check if the second input goes over '1'
         */
         for (int s = 0; s < size; s++) {
             if (str.charAt(s) != '0' && str.charAt(s) != '1') {
                 System.out.println("OOPS...This is not a binary number.");
                 size = 0;
                 main(args);
                 break;
             } else {
                 keepGoing = true;
             }

         }

         /*
          * The Condition needed in order to move on
          */
         if (keepGoing = true) {
             int total = 0;
             int result = 0;
             int position = 0;

        /*
         * Convert the two input into 8-bit
         */
        if
