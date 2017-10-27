import java.util.*;

public class ShoppingSpree1{

  int budget;
  String name;
  ArrayList<String> bags;

  public ShoppingSpree1(int money){
    budget= money;
    bags= new ArrayList<String>();
    name = "Maggie";
}

  public int getMoney() {
    return budget;
}

  public void getBags(){
    System.out.println("You are carrying: ");
    for(int i=0; i< bags.size(); i++){
      System.out.print(bags.get(i)+", ");
    }
    System.out.println("and that's it!");
}

  public void buyShoes() {
    System.out.println("Converse or Yeezy?");
    Scanner input2= new Scanner(System.in);
    String brand = input2.nextLine();

    if (brand.equals("Converse")){
      bags.add("Converse");
      budget = budget- 60;
    }
    else if (brand.equals("Yeezy")){
      bags.add("Yeezy");
      budget = budget - 85;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }

  public void buyPhone() {
    System.out.println("Nokia or Iphone?");
    Scanner input3= new Scanner(System.in);
    String brand2 = input3.nextLine();

    if (brand2.equals("Nokia")){
      bags.add("Nokia");
      budget = budget- 10;
    }
    else if (brand2.equals("Iphone")){
      bags.add("Iphone");
      budget = budget - 800;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }

  public void buyFood() {
    System.out.println("Fast food or Fancy restaurant?");
    Scanner input4= new Scanner(System.in);
    String brand3 = input4.nextLine();
    if (brand3.equals("Fast food")){
      bags.add("fast food");
      budget = budget - 20;
    }
    else if (brand3.equals("Fancy restaurant")){
      bags.add("fancy restaurant");
      budget = budget - 250;
    }
    else {
      System.out.println("NOT a valid option. Please double check your spelling.");
    }
  }

  public static void main(String[] args){

        System.out.println("Welcome to your Shopping Spree!");
        System.out.println("How much money have you brought today?");
        Scanner amount = new Scanner(System.in);
        int money = Integer.parseInt(amount.nextLine());

        ShoppingSpree1 spree = new ShoppingSpree1(money);


        spree.buyShoes();
        spree.buyPhone();
        spree.buyFood();

        System.out.println("You have " + spree.getMoney() + " dollars left.");
        spree.getBags();

  }

}
