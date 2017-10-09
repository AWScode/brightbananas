/*
Program Name: RealWaterCooler.java
Programmer: Rachel and Maggie
Date: Oct 8, 2017
*/

import java.util.*;
import java.io.*;
public class RealWaterCooler{
  public static void main(String args[]){
    ArrayList<String> Highrisk= new ArrayList<>();
    ArrayList<String> Middlerisk= new ArrayList<>();
    ArrayList<String> Lowrisk=new ArrayList<>();
    HashMap<String, Integer> list= new HashMap<>();

//To read the topics file. To record frequency of each topic appeared on the list.
    File file= new File("Topics.txt");
    try{
      Scanner text= new Scanner(file);
      while(text.hasNextLine()){
        String topic =text.nextLine();
        if(list.containsKey(topic)){
          int count=list.get(topic);
          count++;
          list.put(topic, count);
        }
        else{
          list.put(topic,1);
        }
      }
    }
    catch( FileNotFoundException e){
      System.out.println("File not found");
    }

    for(String word: list.keySet()){
      if(list.get(word)==1){
	      Highrisk.add(word);
      }
      else if(list.get(word)==2){
        Middlerisk.add(word);
      }
      else{
       	Lowrisk.add(word);
      }
    }

    //To record user's name.
    System.out.println("Hi! What a coincidence...");
    System.out.println("What is your name?");
    Scanner input2= new Scanner(System.in);
    String a = input2.nextLine();

//To choose which risk level of topic the user wants to talk about.
    System.out.println(a + "," + " " + "nice to meet you!");
    System.out.println("So now you find yourself stranded at the watercooler with Rachel and Maggie.");
    System.out.println("What would you like to talk about?");
    System.out.println("You can choose: low-risk, middle-risk, high-risk, awkwardly-excuse-myself, happily-run-away.");
    Scanner input = new Scanner (System.in);
    String order = input.nextLine();
    Random rand= new Random();
    int lowMax= Lowrisk.size();
    int middleMax= Middlerisk.size();
    int highMax= Highrisk.size();

//To print out conversation according to user's choice.
    if (order.equals("awkwardly-excuse-myself")){
      System.out.println("Maggie:Oh, sad... but alright:(");
      System.out.println("Rachel: Yeah, it is alright. Off you go. Have a great day!");
      System.out.println("After " + a + " " + "leaves, Rachel and Maggie Whispering...");
      System.out.println("Maggie: I will score him 0.1 point for his ability to small-talk.");
      System.out.println("Rachel: Yeah, I agree, but I will give him 0.2 for his effort saying something.");
    }

    else if (order.equals("happily-run-away")){
      System.out.println("Maggie: ...");
      System.out.println("Maggie: What just happened?");
      System.out.println("Rachel: I have no idea.");
      System.out.println("After " + a + " " + "leaves, Rachel and Maggie Whispering...");
      System.out.println("Maggie: I will score him 0 point for his ability to small-talk.");
      System.out.println("Rachel: Defintely...");
    }

    else if (order.equals("low-risk")&& lowMax>0){
	    String topic= Lowrisk.get(rand.nextInt(lowMax));
      System.out.println("How is that new " + topic + " going?");
      System.out.println("Rachel: I love it! It is so much better than the last one!");
      System.out.println("Maggie: Oh my god, Rachel, I totally agree! It never gets stuck and the new system is sooo cool.");
      System.out.println("You: Seriously you guys! That sounds so good. Now I want to get a new " + topic +" too.");
      System.out.println("~~~ You three have talked about " + topic + " for 30 minutes ~~~");
      System.out.println("After " + a + " " + "leaves, Rachel and Maggie Whispering...");
      System.out.println("Maggie: I will score him 9.5 point for his ability to small-talk.");
      System.out.println("Rachel: Yes. He knows how to small talk.");
    }

    else if (order.equals("middle-risk")&& middleMax>0 ){
      String topic= Middlerisk.get(rand.nextInt(middleMax));
      System.out.println("So what is your opinion on " + topic + "?");
      System.out.println("Maggie: To be honest... I don't know. What do you think Rachel?");
      System.out.println("Rachel: umm, I don't really have a strong opinion about it. But I have heard a lot of people disccusing it lately.");
      System.out.println("You: I mean " + topic + " requires proffesional knowledge. And I majored in Computer Science, so how can I know?");
      System.out.println("Maggie: Haha true.");
      System.out.println("10 seconds of silence...");
      System.out.println("After " + a + " " + "leaves, Rachel and Maggie Whispering...");
      System.out.println("Maggie: I will score him 6.875 point for his ability to small-talk.");
      System.out.println("Rachel: Yep. What he said was surely a little awkward, but at least he said a bunch of words.");
    }

    else if (order.equals("high-risk")&& highMax>0){
      String topic= Highrisk.get(rand.nextInt(highMax));
      System.out.println("What is your opinion on " + topic + "?");
      System.out.println("Maggie: Who cares about that.");
      System.out.println("Rachel: Hehe.");
      System.out.println("You: Well I almost got killed because of that.");
      System.out.println("Maggie roles her eyes");
      System.out.println("Rachel: Oh... that is interesting.");
      System.out.println("You three awkwardly pull out your phones and never talk again.");
      System.out.println("After " + a + " " + "leaves, Rachel and Maggie Whispering...");
      System.out.println("Maggie: I will score him 3.201 point for his ability to small-talk.");
      System.out.println("Rachel: Yeah. I don't really know how we should response to his words. And I don't want to talk about his death in small-talks.");
    }

    else {
      System.out.println("NOT a valid option. Please double check your spelling and hyphen.");
    }
  }
}
