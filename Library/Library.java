/* Library.java created by Maggie Z
This program holds all of the information for
the Library class. Library builds a record of
all the words in a book and can sort them in any
way the user would like. This class can also
return words that fit the search criteria. */

import java.util.*;

public class Library {

  public ArrayList<String> words;

  public Library() {
    this.words = new ArrayList<String>();


    words.add("once");
    words.add("upon");
    words.add("a");
    words.add("time");
    words.add("there");
    words.add("was");
    words.add("a");
    words.add("girl");
    words.add("who");
    words.add("lived");
    words.add("in");
    words.add("a");
    words.add("beautiful");
    words.add("castle");
    words.add("one");
    words.add("day");
    words.add("the");
    words.add("castle");
    words.add("there");
    words.add("fell");
    words.add("there");
    words.add("down");

  }

  //Sort with Insertion
  public void alphaSort(){

  }
  //Sort with Selection
  public void wLengthSort(){

  }

  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }

  public ArrayList<String> getTopWords(){
    ArrayList<String> topWords = new ArrayList<String>();

    return topWords;
  }


  public static void main(String[] args) {

    Library myLib = new Library();

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("\n");
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: castle : " + Integer.toString(myLib.getWordCount("castle")));
    System.out.println("Word: once : " + Integer.toString(myLib.getWordCount("once")));

  }

}
