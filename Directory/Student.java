/*
  Program name: Diretory.java
  Programmer: Maggie Zhang
  Date: 02/16/17
*/

public class Student{

  public static String name;
  public static int grade;
  public static String hobby;
  public static String subject;
  public static String teacher;

  public Student(String n, int g, String o, String f, String t) {
    this.name = n;
    this.grade = g;
    this.hobby = o;
    this.Subject = f;
    this.teacher = t
  }

  public static void hello(){
    System.out.println("Hi guy!");
  }

  public String getName(){
    return name;
  }

  public int getGrade(){
    return grade;
  }

  public String getHobby(){
    return hobby;
  }

  public String getSubject(){
    return subject;
  }

  public String getTeacher(){
    return teacher;
  }

  public void setName(String n){
    name = n;
  }

  public void setGrade(int g){
    grade = g;
  }

  public void setHobby(String h){
    hobby = h;
  }

  public void setSubject(String f){
    subject = f
  }

  public void setTeacher(String t){
    teacher = t
  }

}
