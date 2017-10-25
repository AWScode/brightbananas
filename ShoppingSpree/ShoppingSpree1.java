import java. until.*;

public class ShoppingSpree1{

  int budget;
  ArrayList<String> bags;

  public ShoppingSpree1(){
    budget=2000;
    bags= new ArrayList<String>();
}

  public int getMoney(){
    return budget;
}

  public void getBags(){
    System.out.println("You are carrying: ");
    for(int i=0; i< bags.size(); i++){
      System.out. print(bags.get(i)+", ");
  }
    Sydtem.out.println(" and that's it!");
}

  public void buyShoes() {
    System.out.println("Converse or Yeezy?");
    Scanner input2= new Scanner(System.in);
    if (input2.equals("Converse")){
      bags.add("Shoes");
      budget = budget- 60;
    }
    else if (input2.equals("Yeezy")){
      bags.add("Shoes");
      budget = budget - 85;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }}

  public void buyPhone() {
    System.out.println("Nokia or Iphone?");
    Scanner input3= new Scanner(System.in);
    if (input3.equals("Nokia")){
      bags.add("Phone");
      budget = budget- 10;
    }
    else if (input3.equals("Iphone")){
      bags.add("Phone");
      budget = budget - 800;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }

  public void buyFood() {
    System.out.println("Fast food or Fancy restaurant?");
    Scanner input4= new Scanner(System.in);
    if (input4.equals("Fast food")){
      bags.add("Food");
      budget = budget - 20;
    }
    else if (input4.equals("Fancy restaurant")){
      bags.add("Food");
      budget = budget - 100;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }

ShoppingSpree spree = new ShoppingSpree(money);

        spree.buyShoes();
        spree.buyPhone();
        spree.buyFood();

        System.out.println("You have " + spree.getMoney() + " dollars left.");
        spree.getBags();

    }

}
