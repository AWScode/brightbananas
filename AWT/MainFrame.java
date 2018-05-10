/* MainFrame.java by Maggie Zhang
This java program displays an example frame
using the java awt library */

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{

  //used text field, choice, checkbox, new frame, text area, button, label
  private Button b;
  private Button b2;
  private Button b3;

  private TextField tf;
  private TextField tf2;

  private Label name;
  private Label rate;
  private Label menu;
  private Label where;
  private Label number;
  private Label request;
  private Label method;
  private Label tip;
  private Label sign;

  private Choice wow;
  private Choice c;
  private Choice wh;

  private Checkbox check1;
  private Checkbox check2;
  private Checkbox check3;
  private Checkbox check4;
  private Checkbox check5;
  private Checkbox check6;
  private Checkbox check7;
  private Checkbox check8;
  private Checkbox check9;
  private Checkbox check10;
  private Checkbox check11;
  private Checkbox check12;

  private Button n;
  private Button en;
  private Button q;

  private TextArea ta;
  private TextArea na;
  private TextArea ha;
  private TextArea ta2;

  private Frame f2;

  public MainFrame() {

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    //title of my restaurant
    tf = new TextField("Welcome to the Restaurant!");
    tf.setBounds(270, 50, 300, 50);
    add(tf);
    tf.setText("          ~ Welcome to Hogwarts Cafe! ~");

    //menu and list of dishes
    menu = new Label("~ Hogwarts menu ~");
    menu.setBounds(70, 120, 150, 30);
    add(menu);

    check1 = new Checkbox("Sorting Hat Bread                 $7.00");
    check1.setBounds(15, 160, 250, 50);
    add(check1);
    check2 = new Checkbox("Golden Snitch Lollipop        $3.50");
    check2.setBounds(15, 200, 250, 50);
    add(check2);
    check3 = new Checkbox("Invisible Salad                     $8.00");
    check3.setBounds(15, 240, 250, 50);
    add(check3);
    check4 = new Checkbox("Mincemeat Pie                     $12.00");
    check4.setBounds(15, 280, 250, 50);
    add(check4);
    check5 = new Checkbox("Polyjuice Potion Pudding    $12.00");
    check5.setBounds(15, 320, 250, 50);
    add(check5);
    check6 = new Checkbox("The Shrieking Pizza            $15.00");
    check6.setBounds(15, 360, 250, 50);
    add(check6);
    check7 = new Checkbox("Fried Phoenix                     $22.00");
    check7.setBounds(15, 400, 250, 50);
    add(check7);
    check8 = new Checkbox("The Elder Wand Baguette    $13.00");
    check8.setBounds(15, 440, 250, 50);
    add(check8);
    check9 = new Checkbox("Butterbeer                          $5.00");
    check9.setBounds(15, 480, 250, 50);
    add(check9);


    //get guest name, which can synchronize with the title
    name = new Label("Guest name:");
    name.setBounds(350, 120, 200, 30);
    add(name);
    ta = new TextArea();
    ta.setBounds(300,170,200,40);
    add(ta);


    //number of guests, choices, submit to the title
    number = new Label("Guest number:");
    number.setBounds(350, 230, 200, 30);
    add(number);
    wow = new Choice();
    wow.setBounds(315, 205, 75, 180);
    wow.add("1-2");
    wow.add("3-4");
    wow.add("5-10");
    wow.add(">10");
    add(wow);
    ta.addTextListener(new MyTextListener());
    q = new Button("Submit");
    q.setBounds(387, 280, 100, 30);
    add(q);
    q.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("A guest number of " + wow.getSelectedItem());
      }
    });


    //where to eat, choice, submit to the title
    where = new Label("Where to eat:");
    where.setBounds(350, 375, 200, 30);
    add(where);
    wh = new Choice();
    wh.setBounds(315, 350, 75, 180);
    wh.add("for here");
    wh.add("to go");
    add(wh);
    ta.addTextListener(new MyTextListener());
    en = new Button("Submit");
    en.setBounds(387, 425, 100, 30);
    add(en);
    en.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("The food will be " + wh.getSelectedItem());
      }
    });


    //a button that can transition us to a new frame (f2)
    n = new Button("Click for receipt");
    n.setBounds(315, 500, 150, 30);
    add(n);
    n.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        f2.setVisible(true); {

        }
      }
    });


    //a button that does action
    b = new Button("Call for service!");
    b.setBounds(616, 60, 150, 30);
    add(b);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf.setText("You have successfully called our attendant!");
      }
    });


    //request and allergy, text field where people can write on
    request = new Label("Allergy and request:");
    request.setBounds(580, 120, 200, 30);
    add(request);
    ha = new TextArea();
    ha.setBounds(550,170,200,140);
    add(ha);


    //rate and comment on service, text field
    rate = new Label("Rate our service:");
    rate.setBounds(580, 325, 200, 30);
    add(rate);
    na = new TextArea();
    na.setBounds(550,375,200,160);
    add(na);


    //set new frame
    f2 = new Frame();
    f2.setSize(200,550);
    f2.setBackground(Color.CYAN);
    f2.setBackground(Color.PINK);
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    //title for f2
    tf2 = new TextField("Receipt");
    tf2.setBounds(15, 50, 175, 30);
    f2.add(tf2);
    tf2.setText("    Receipt");


    //paying method, checkbox
    method = new Label("Paying method:");
    method.setBounds(20, 90, 200, 30);
    f2.add(method);
    check10 = new Checkbox("Cash");
    check10.setBounds(10, 110, 100, 50);
    f2.add(check10);
    check11 = new Checkbox("Credit card");
    check11.setBounds(10, 140, 100, 50);
    f2.add(check11);
    check12 = new Checkbox("Debit card");
    check12.setBounds(10, 170, 100, 50);
    f2.add(check12);


    //tip, choice, can submit to the title
    tip = new Label("Tip:");
    tip.setBounds(20, 220, 200, 30);
    f2.add(tip);
    c = new Choice();
    c.setBounds(10, 175, 100, 180);
    c.add("None");
    c.add("15%");
    c.add("20%");
    c.add("25%");
    f2.add(c);
    ta.addTextListener(new MyTextListener());
    b2 = new Button("Submit");
    b2.setBounds(100, 250, 100, 30);
    f2.add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("Your tip percent is " + c.getSelectedItem());
        tf2.setText("Your tip percent is " + c.getSelectedItem());
      }
    });


    //signature, text area
    sign = new Label("Signature:");
    sign.setBounds(10, 350, 100, 30);
    f2.add(sign);
    ta2 = new TextArea();
    ta2.setBounds(10,390,150,40);
    f2.add(ta2);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        String answer = "no selection";
        if (check1.getState()) {
          answer = "Yes";
        }
        else if (check2.getState()) {
          answer = "No";
        }
        System.out.println(answer);
      }
    });


    //set the main frame
    setSize(800,565);
    setLayout(null);
    setVisible(true);
  }

  class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent e) {
      tf.setText(ta.getText());
    }
  }

 public void testCheck() {
    String answer = null;
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        String answer = "no selection";
        if (check1.getState()) {
          answer = "Yes";
        }
        else if (check2.getState()) {
          answer = "No";
        }
      }
    });
    System.out.println(answer);
  }

  public void addList() {
    List l = new List(5);
    l.setBounds(320, 60, 45, 180);
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add("e");
    this.add(l);
  }

  public static void main(String[] args) {
    MainFrame m = new MainFrame();



  }
}
