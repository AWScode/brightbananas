/*
  Program name: Diretory.java
  Programmer: Maggie Zhang
  Date: 02/16/17
*/
public class Subject{

  public String classname;
  public int classize; //how many there are in the class
  public String teacher;
  public boolean hardness; //if it is HL or SL
  public String description;

  public Subject(String x, int y, String z, boolean w, String v){
    this.classname = x;
    this.classize = y;
    this.teacher = z;
    this.hardness = w;
    this.description = v;
  }

  public String getClassname(){
    return classname;
  }

  public int getClassize(){
    return classize;
  }

  public String getTeacher(){
    return teacher;
  }

  public boolean getHardness(){
    return hardness;
  }

  public String getDescription(){
    return description;
  }


  public void setClassname(String x){
    classname = x;
  }

  public void setClassize(int y){
    classize = y;
  }

  public void setTeacher(String z){
    teacher = z;
  }

  public void setHardness(boolean w){
    hardness = w;
  }

  public void setDescription(String v){
    description = v;
  }


}
