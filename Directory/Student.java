/*
  Program name: Diretory.java
  Programmer: Maggie Zhang
  Date: 02/16/17
*/
public class Student{

  public String name;
  public int grade;
  public String hobby;
  public String gender;
  public String personality;
  public String subject;

  public Student(String a, int b, String c, String d, String e, String f){
    this.name = a;
    this.grade = b;
    this.hobby = c;
    this.gender = d;
    this.personality = e;
    this.subject = f;

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

  public String getGender(){
    return gender;
  }

  public String getPersonality(){
    return personality;
  }

  public String getSubject(){
    return subject;
  }


  public void setName(String a){
    name = a;
  }

  public void setGrade(int b){
    grade = b;
  }

  public void setGender(String d){
    gender = d;
  }

  public void setHobby(String c){
    hobby = c;
  }

  public void setPersonality(String e){
    personality = e;
  }

  public void setSubject(String f){
    subject = f;
  }


}
