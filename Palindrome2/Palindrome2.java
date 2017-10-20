/* Palindrome.java
Maggie Z
October 20, 2017*/

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Palindrome2 {

    public static boolean palindromeCheck(String str) {

        str = str.toUpperCase();
        char[] strChars = str.toCharArray();

        List<Character> word = new ArrayList<>();
        for (char c : strChars) {
            word.add(c);
        }

        while (true) {
            if ((word.size() == 1) || (word.size() == 0)) {
                return true;
            }
            if (word.get(0) == word.get(word.size() - 1)) {
                word.remove(0);
                word.remove(word.size() - 1);
            } else {
                return false;


        }
    }
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
