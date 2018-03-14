/* ConnectFour.java by Maggie Z
This class holds all of the data and methods
to create ConnectFour games. This is a class to be
imported and used in other files that want to play
this game. */

import  java.util.*;

 public class ConnectFour {
 public static String[][] setBoard(){
   //create a 6 by 7 board
     String [][] f = new String[7][15]; //f is the board
     //Since two "|" create 1 blank, we need 14 "|" to create 7 blanks
    for (int i=0;i<f.length ; i++){ //set limit of board
        for (int j=0 ; j<f[i].length ; j++){//set limit of board
            if (j%2 == 0) f[i][j] = "|";//2 "|" makes one blank "| |"
            else f[i][j] = " " ;//leave blank
            if (i == 6 ) f[i][j] = "-";//add _________at the bottom

        }
    }
    return f;
}

public static void displayBoard(String[][] f) {
    for(int i=0;i<f.length;i++){
        for (int j=0 ; j<f[i].length;j++){
            System.out.print(f[i][j]);//print out rows
        }
        System.out.println();//print out columns
    }

}

public static void addPiece1(String [][] f){
    //this will add piece for player 1
    System.out.println("Player X wants to go (0-6):");
    Scanner input = new Scanner(System.in);//get player X input
    int c = 2*input.nextInt()+1;//converting user's input into my board system, since it is a 2 | for 1 blank system
    for (int i=5;i>= 0;i--){//place the piece in the largest empty space
        if (f[i][c] == " "){//if blank, place X in
            f[i][c] = "X";
            break;
        }

    }

}



public static void addPiece2(String[][] f){
    //this will add piece for player 1
    System.out.println("Player Y wants to go (0-6): ");
    Scanner input = new Scanner(System.in);//get player Y input
    int c = 2*input.nextInt()+1;//converting user's input into my board system, since it is a 2 | for 1 blank system
    for(int i =5;i>= 0 ; i--){//place the piece in the largest empty space
        if (f[i][c] == " "){//if blank, place Y in
            f[i][c] = "Y";
            break;
        }

    }

}

public static String checkFour(String[][] f){
    for(int i =0;i<6;i++){
        for (int j= 0; j<7;j+=2){
            if((f[i][j+1] != " ")//if down 1/3/5/7 is not empty
                    && (f[i][j+3] != " ")//add it by 3, 5, 7 is still because of my wierd system, I have to add more than usual
                    && (f[i][j+5] != " ")
                    && (f[i][j+7] != " ")//check if there are four horizontally
                    &&((f[i][j+1] == f[i][j+3])//check if it is from the same player
                            &&(f[i][j+3] == f[i][j+5])
                            && (f[i][j+5] == f[i][j+7])))
                return f[j][j+1];
        }

    }
    for (int i=1;i<15;i+=2){
        for (int j=0;j<3;j++){
            if((f[j][i] != " ")
                    && (f[j+1][i] != " ")
                    && (f[j+2][i] != " ")
                    && (f[j+3][i] != " ")//check if there are four in a column
                    && ((f[j][i] == f[j+1][i])
                    && (f[j+1][i] == f[j+2][i])
                    && (f[j+2][i] == f[j+3][i])))
                      return f[j][i];
        }
    }
    for(int i=0;i<3;i++){
        for(int j=1;j<9;j+=2){
            if((f[i][j] != " ")
                    && (f[i+1][j+2] != " ")
                    && (f[i+2][j+4] != " ")
                    && (f[i+3][j+6] != " ")//check in slant, up right
                    && ((f[i][j] == f[i+1][j+2])
                    && (f[i+1][j+2] == f[i+2][j+4])
                    && (f[i+2][j+4] == f[i+3][j+6])))
                      return f[i][j];
        }
    }
    for(int i=0;i<3;i++){
        for (int j=7;j<15;j+=2){
            if((f[i][j] != " ")
                    && (f[i+1][j-2] != " ")
                    && (f[i+2][j-4] != " ")
                    && (f[i+3][j-6] != " ")//check in slant, up left
                    && ((f[i][j] == f[i+1][j-2])
                    && (f[i+1][j-2] == f[i+2][j-4])
                    && (f[i+2][j-4] == f[i+3][j-6])))
                      return f[i][j];
        }
    }

    return null;
}

public static void main(String[] args){

    String[][] f = setBoard();
    boolean repeat = true;
    int count = 0;
    displayBoard(f);
    while(repeat){
        if (count % 2 == 0) addPiece1(f);//when count is even number (including 0), player X's turn
        else addPiece2(f);//when count is odd number, player Y's turn
        count++;//count continues to add, so that even and odd numbers switch around equally.
        displayBoard(f);
        if(checkFour(f) != null ){
            if (checkFour(f) == "X")
                System.out.println("Player X won!"); //if there are four X connected, player x won
            else if (checkFour(f)== "Y")
                System.out.println("Player Y won!");//if there are four Y connected, player Y won
            repeat = false;
          }

  }

 }
}
