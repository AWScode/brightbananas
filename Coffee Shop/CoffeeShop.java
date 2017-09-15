//Maggie Zhang 2017.9.15
import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] arg){
    Scanner in= new Scanner(System.in);
    System.out.println("~~~~~~~~~~~~~~~~~~");
    System.out.println("Welcome to Maggie's Moonbucks!");
    System.out.println("May I take your order?");
    String a = in.nextLine();

    Scanner in1= new Scanner(System.in);
    System.out.println("I'm very sorry. We don't have " + a + " " + "anymore...");
    System.out.println("Would you like anything else?");
    String b = in.nextLine();

    Scanner in2= new Scanner(System.in);
    System.out.println("And what size would you like?");
    String c = in.nextLine();

    Scanner in3= new Scanner(System.in);
    System.out.println("Okay! Can I have your name, please?");
    String d = in.nextLine();

    Scanner in4= new Scanner (System.in);
    System.out.println("That will be $5");
    String e = in.nextLine();

    System.out.println("Great! One moment please..");

    System.out.println(d+ "!" + " " + "Your order" + " " + c + " " + b + " " + "is ready!");

    System.out.println("Have a great day!");
  }
}
