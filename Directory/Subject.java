/*
  Program name: Diretory.java
  Programmer: Maggie Zhang
  Date: 02/16/17
*/

public class Subject{

  public static void main(String[] args) {
   System.out.println("Welcome come to subject check!");
   System.out.println("Here we provide a subject list!");

   Subject ceramics = new Subject("Maggie", 11, "ice skating", "ceramics", "Mrs. Haha");

   Subject robotics = new Subject("Smart", 9, "hacking", "robotics", "Mr. Joke");

   Subject dance = new Subject("Lily", 12, "play piano", "dance", "Ms. Yan");

   Subject love skills= new Subject("Rose", 8, "horse riding", "love skills", "Mr. Jack");

   Subject read mind = new Subject("Dumbledore", 10, "invent things", "read mind", "Ms. Hermione");

   Subject magic = new Subject("Harry", 11, "Quidditch", "magic", "Mr. Potter");

   System.out.println("Let me proudly introduce:");

   ceramics.hello();
   String newSubject = ceramics.getSubject();
   System.out.println("This student is taking: " + newSubject);
 }
}
