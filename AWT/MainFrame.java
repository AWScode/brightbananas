/* MainFrame.java by Maggie Z
This java program displays an example frame
using the java awt library */

import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{

  private Button b;
  private TextField tf;
  private Label name;
  private TextArea ta;
  private Button b2;

  public MainFrame() {

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    b = new Button("Click me!");
    b.setBounds(90,100,100,30);
    add(b);

    tf = new TextField("Welcome to the Restaurant!");
    tf.setBounds(50, 50, 200, 30);
    add(tf);
    tf.setText("whatebvehfhaergjkbgareilhe");

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf.setText("You clicked the button!");
      }
    });

    Scrollbar sc = new Scrollbar();
    sc.setBounds(400,0,30,300);
    add(sc);
    name = new Label("Your name:");
    name.setBounds(70, 250, 80, 30);
    add(name);
    ta = new TextArea();
    ta.setBounds(150,250,200,40);
    add(ta);
    //ta.addTextListener(new MyTextListener());
    b2 = new Button("Submit");
    b2.setBounds(150, 200, 100, 30);
    add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("Your name is: " + ta.getText());
      }
    });

    setSize(400,300);
    setLayout(null);
    setVisible(true);
  }

  class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent e) {
      tf.setText("");
    }
  }
  public void addCheckbox() {
    Checkbox check1 = new Checkbox("Yes");
    check1.setBounds(220, 50, 80, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("No");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }
  public void addChoice() {
    Choice c = new Choice();
    c.setBounds(5, 20, 75, 180);
    c.add("1");
    c.add("2");
    c.add("3");
    c.add("4");
    c.add("5");
    this.add(c);
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
