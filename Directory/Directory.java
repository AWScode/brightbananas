/*
  Program name: Diretory.java
  Programmer: Maggie Zhang
  Date: 02/16/17
*/

import java.util.*;
//create Directory class
public class Directory{

  public static void main(String[] args) {
    System.out.println("\n ~ ~ ~ ~ ~ ~ $ ~ ~ ~ ~ ~ ~\nWelcome come to Maggie Land! \n ~ ~ ~ ~ ~ ~ $ ~ ~ ~ ~ ~ ~");
    System.out.println("\nMaggie Land is the TOP 1 high school in the world. \nWe only accept elites of elites."); //Introduction

    Student Maggie = new Student("Maggie", 11, "do ice skating", "lovely girl", "hopeless...ly clever", "Ceramics"); //Details for all categories of students using Student class
    Student Smart = new Student("Smart", 9, "hack", "boy", "sleepy all the time", "Robotics");
    Student Lily = new Student("Lily", 12, "play piano", "girl", "tireless", "Dance");
    Student Rose = new Student("Rose", 8, "ride horse", "girl", "sentive", "love skills");
    Student Dumbledore = new Student("Dumbledore", 10, "invent things", "boy", "trouble making", "Mindreading");
    Student Harry = new Student("Harry", 11, "play Quidditch", "boy", "timid and frightened", "Magic");
    Subject Ceramics = new Subject("Ceramics", 17, "Mrs. Haha", false, "a class that students can study, research about, and work on clay.\nIt is enjoyable to create things with clay."); //details for all categories of students using the Subject class
    Subject Robotics = new Subject("Robotics", 12, "Mr. Joke", false, "a class that involves critical and creative thinking.\nIf you are interested in programming or inventing things, this is definitely a great class for you.");
    Subject Dance = new Subject("Dance", 7, "Ms. Yan", true, "a class that you can shake your body and move along with music.\nNo matter you are a ballet dancer or a modern dancer, you can practice whichever you like here.");
    Subject LoveSkills = new Subject("LoveSkills", 35, "Mr. Jack", true, "a class that teaches you how to date the ones you love.\nThere are so many unknown tricks and techniques taught in this class.");
    Subject Mindreading = new Subject("Mindreading", 4, "Ms. Hermione", false, "a class that teaches you how to see through people.\nOur slogan is TO WIPE OUT EVERY LAST LIE.");
    Subject Magic = new Subject("Magic", 28, "Mr. Potter", true, "a class that opens a whole new door for you.\nThis is a place to accomplish your wizard or witch dream!");

    System.out.println("\nHere are the student ambassadors we have: \n");

    ArrayList<Student> listOfStudents = new ArrayList<Student>(); //create an arraylist made up of all the students and info.
    listOfStudents.add(Maggie);
    listOfStudents.add(Smart);
    listOfStudents.add(Lily);
    listOfStudents.add(Rose);
    listOfStudents.add(Dumbledore);
    listOfStudents.add(Harry);

    for (int i = 0; i < listOfStudents.size(); i++) { //print out objects in the arraylist, which are the students.
      System.out.println(listOfStudents.get(i).getName());
    }

    System.out.println("\nWhich student would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();//get user's input of a student's name

    Boolean found = false;
    Student theStudent = new Student("Test", 0, "TestO", "Test1", "Test2", "Test3");
    for (int i = 0; i < listOfStudents.size(); i++) {//a for loop to find out the user's choice of student
      if (choice.equals(listOfStudents.get(i).getName())) {//if the name is valid, catch it and move on.
        System.out.println("\nWhat do you want to know about " + choice + "? \nName, gender, grade, hobby, or personality?"); //if the user chose a student that goes to the school, it asks if you would like to know the subject
        found = true;
        theStudent = listOfStudents.get(i);
        break;
      }
    }

    if (!found) {//if the name is not valid, tell the user.
      System.out.println("We don't have this student in our school...");
    }
    else {//this is the case that the name is valid
      Scanner q = new Scanner(System.in);
      String question =  q.next();//record user's choice of which category he/she wants to look at.
      if (question.equals("name") || question.equals("Name")) {//this is a case where the category is valid
        System.out.println(theStudent.getName() + "\'s name is " + theStudent.getName() + ".");
      }
      else if (question.equals("grade") || question.equals("Grade")) {//this is a case where the category is valid
        System.out.println(theStudent.getName() + " is in " + theStudent.getGrade() + "th grade.");
      }
      else if (question.equals("hobby") || question.equals("Hobby")) {//this is a case where the category is valid
        System.out.println(theStudent.getName() + " really likes to " + theStudent.getHobby() + ".");
      }
      else if (question.equals("gender") || question.equals("Gender")) {//this is a case where the category is valid
        System.out.println(theStudent.getName() + " is a " + theStudent.getGender() + ".");
      }

      else if (question.equals("personality") || question.equals("Personality")) {//this is a case where the category is valid
          System.out.println("I would describe " + theStudent.getName() + " as a " + theStudent.getPersonality() + " person.");
      }
      else System.out.println("Sorry, " + question + " is not accessible information."); //this is a case where the category is not valid.
    }

    System.out.println("\nWould you like to know about " + choice + "\'s major subject? Yes or no?");//since subject itself is an object, I extract it from the list of categories to emphasize it.
    Scanner newInX = new Scanner(System.in);
    String choiceM = newInX.next();
    if (choiceM.equals("yes") || choiceM.equals("Yes")){//this is the case if the user says yes
      System.out.println(theStudent.getName() + "\'s major subject is " + theStudent.getSubject() + ".");
    }
    else {//this is the case if the user says no
      System.out.println("Ok.");
    }

    System.out.println("\nMore detailed information is followed...");//this is like a transition thing to the subject part


    //Above is Student part. Below is the Subject part.

    ArrayList<Subject> listOfSubjects = new ArrayList<Subject>();//create another arraylist made up of all the subjects and info.
    listOfSubjects.add(Ceramics);//adding subjects and details to the arraylist
    listOfSubjects.add(Robotics);
    listOfSubjects.add(Dance);
    listOfSubjects.add(LoveSkills);
    listOfSubjects.add(Mindreading);
    listOfSubjects.add(Magic);

    System.out.println("\nNow do you want to learn about our subjects more? Yes or No?");
    Scanner q2 = new Scanner(System.in);
    String question2 = q2.next();
    if (question2.equals("yes")){ //if the user says yes to the question "would you like to take a look at all out subjects," below lines will occur.
      System.out.println("\nThese are all courses we provide at Maggie Land. \nWhich would you like to know more about?");//if the user says yes to the previous question, this question will then appear
      for (int i = 0; i < listOfSubjects.size(); i++) {//print out objects in the arraylist, which are the subjects.

        System.out.println(listOfSubjects.get(i).getClassname());
      }

      Scanner q3 = new Scanner(System.in);//record user's choice of subject
      String question3 = q3.next();

      Boolean found2 = false;
      Subject theSubject = new Subject("Test", 0, "TestO", true, "Test1");
      for (int i = 0; i < listOfSubjects.size(); i++) {////a for loop to find out the user's choice of subject
        if (question3.equals(listOfSubjects.get(i).getClassname())) { //if the user's input of subject is valid, the following occurs
          theSubject = listOfSubjects.get(i);
          System.out.println("\nWhat do you want to know about " + question3 + "? \nClassName, classSize, teacher, level, or description?"); //if the user chose a student that goes to the school, it asks if you would like to know the subject
          found2 = true;
          theSubject = listOfSubjects.get(i);
          break;
        }
      }

      if (!found2) {//if the user's input is not valid.
        System.out.println("We don't have that class.\nReminder: check capitalization and spelling please.");//if user inputs something other than the subjects listed, this is outputted
      }
      else {//when user's input is valid
        Scanner n = new Scanner(System.in);
        String questionX =  n.next();
        if (questionX.equals("ClassName") || questionX.equals("className")) {
          System.out.println(theSubject.getClassname() + "\'s class name is " + theSubject.getClassname() + ".");
        }
        else if (questionX.equals("classSize") || questionX.equals("ClassSize")) {
          System.out.println("There are " + theSubject.getClassize() + " students taking " + theSubject.getClassname() +".");
        }
        else if (questionX.equals("teacher") || questionX.equals("Teacher")) {
          System.out.println(theSubject.getClassname() + " is taught by " + theSubject.getTeacher() + ".");
        }
        else if (questionX.equals("Level") || questionX.equals("level")) {
          System.out.println(theSubject.getClassname() + " is an high level class: " + theSubject.getHardness() + ".");
        }
        else if (questionX.equals("Description") || questionX.equals("description")){
          System.out.println(theSubject.getClassname() + " is " +theSubject.getDescription());
        }
        else System.out.println("Sorry, " + questionX + " is not accessible information."); //if user doesn't input yes to question about, this is outputted
        }

      }

    else System.out.println("Wow. Then that's it from me. \nSee you next time!"); //if the user says no to the question "would you like to take a look at all out subjects"





  }

}
