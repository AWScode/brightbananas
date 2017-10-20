import java.util.*;


public class Palindrome1 {

    public static boolean palindromeCheck(String test) {
      if(test.length() == 0 || test.length() == 1)
                 return true;
             if(test.charAt(0) == test.charAt(test.length()-1))
             return palindromeCheck(test.substring(1, test.length()-1));
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("Congratulation! That's a Palindrome!");
        }
        else {
            System.out.println("Unfortunately, that's not a Palindrome...");
        }

    }

}
