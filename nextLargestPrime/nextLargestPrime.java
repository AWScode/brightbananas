/*
  Program name: nextLargestPrime.java
  Programmer: Maggie Zhang
  Date: 02/02/17
*/

//import scanner//
import java.util.*;
//create a class called nextLargestPrime//
public class nextLargestPrime {
  //create main//
  public static void main(String[] args) {
    //use scanner to ask users for input//
    Scanner input = new Scanner(System.in);
    System.out.println("Hi! Welcome to NextLargestPrime program.");
    System.out.println("Please enter a number:");
    //store the input as an integer//
    int number = input.nextInt();
    /*this will be my output sentence,
    Primenumber will be a parallel method
    where I code on how to specially calculate the next prime number*/
    System.out.println ("The prime number after " + number + " is " + Primenumber(number));
  }
  //this is the parallel method//
  public static int Primenumber (int num ){
    while (true) {
      boolean isprime = true;
      //how to calculate the result//
      num = num + 1;
      //use square root to find the range of possible integer//
      int sqt = (int)Math.sqrt(num);
      //go from 2 to the largest possible integer, add 1 each time//
      for (int i=2; i<=sqt; i++) {
        //check if the remainder is zero, if yes, it is not the prime, if not, it is the prime!//
        if(num%i == 0){
          isprime = false;
          break;
        }
      }
      if(isprime)
      return num;
    }
  }
}
