/*
  Program name: Factorial.java
  Programmer: Maggie Zhang
  Date: 01/31/17
*/

//import scanner//
import java.util.*;
//create a class called Factorial//
public class Factorial{
  //create long method because numbers can get really big//
  public static long factorial () {
    //use scanner and ask user for a number//
    Scanner input = new Scanner(System.in);
    //in order to make it look better, I used "\n"//
    System.out.println("\nWelcome to Maggie's Factorial Calculator!");
    System.out.println("Please enter a number");
    /*receive input as a long number because the number may be big,
    it can be too big for integers to hold.*/
    long number = input.nextInt();
    //this is the future result, and is stored as long because it can get really big as well.//
    long fact=1;
    /*use a loop to calculate factorial,
    it says to start with 1 and end with the input number and the numbers increase by 1 each time*/
    for (int i=1;i<=number; i++){
        fact=fact*i;
    }
    System.out.println(number + "! is " + fact);
    return fact;
  }
  public static void main(String[] args) {
    factorial();
  }
}
