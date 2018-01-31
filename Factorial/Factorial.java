/*
  Program name: Factorial.java
  Programmer: Maggie Zhang
  Date: 01/31/17
*/

//import scanner//
import java.util.*;
//create a class called Factorial//
public class Factorial{

  public static void main(String[] args) {
    //set the number equals to 10 so that it can calculate 10!//
    int number=10;
    int fact=1;
    Scanner input = new Scanner(System.in);
    //use a loop to calculate n*(n-1)*(n-2)...//
    for (int i=1;i<=number; i++){
        fact=fact*i;
    }
    System.out.println("Hi! 10 factorial is " + fact + ".");
  }
}
