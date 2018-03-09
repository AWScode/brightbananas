/* ConnectFour.java by Maggie Z
This class holds all of the data and methods
to create ConnectFour games. This is a class to be
imported and used in other files that want to play
this game. */

import  java.util.*;

 public class ConnectFour {
 public static String[][] setBoard(){
     String [][] f = new String[7][15];
    for (int i=0;i<f.length ; i++){
        for (int j=0 ; j<f[i].length ; j++){
            if (j%2 == 0) f[i][j] = "|";
            else f[i][j] = " " ;
            if (i == 6 ) f[i][j] = "-";

        }
    }
    return f;
}

public static void displayBoard(String[][] f) {
    for(int i=0;i<f.length;i++){
        for (int j=0 ; j<f[i].length;j++){
            System.out.print(f[i][j]);
        }
        System.out.println();
    }

}
public static void addPiece1(String [][] f){
    System.out.println("Player X wants to go (0-6):");
    Scanner input = new Scanner(System.in);
    int c = 2*input.nextInt()+1;
    for (int i=5;i>= 0;i--){//place the piece in the largest empty space
        if (f[i][c] == " "){
            f[i][c] = "X";
            break;
        }
    }
}
public static void addPiece2(String[][] f){
    System.out.println("Player Y wants to go (0-6): ");
    Scanner input = new Scanner(System.in);
    int c = 2*input.nextInt()+1;
    for(int i =5;i>= 0 ; i--){
        if (f[i][c] == " "){
            f[i][c] = "Y";
            break;
        }
    }
}
public static String checkFour(String[][] f){
    for(int i =0;i<6;i++){
        for (int j= 0; j<7;j+=2){//check vertically
            if((f[i][j+1] != " ")//if down 1/3/5/7 is not empty
                    && (f[i][j+3] != " ")
                    && (f[i][j+5] != " ")
                    && (f[i][j+7] != " ")
                    &&((f[i][j+1] == f[i][j+3])//check if it is from the same player
                            &&(f[i][j+3] == f[i][j+5])
                            && (f[i][j+5] == f[i][j+7])))
                return f[j][j+1];
        }
    }
    for (int i=1;i<15;i+=2){ //check horizontally
        for (int j=0;j<3;j++){
            if((f[j][i] != " ")
                    && (f[j+1][i] != " ")
                    && (f[j+2][i] != " ")
                    && (f[j+3][i] != " ")
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
                    && (f[i+3][j+6] != " ")
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
                    && (f[i+3][j-6] != " ")
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
        if (count % 2 == 0) addPiece1(f);
        else addPiece2(f);
        count++;
        displayBoard(f);
        if(checkFour(f) != null ){
            if (checkFour(f) == "X")
                System.out.println("Player X won!");
            else if (checkFour(f)== "Y")
                System.out.println("Player Y won!");
            else if (checkFour(f) == "draw")
                System.out.println("That game draw!");
            repeat = false;
          }

      }
  }

 }


 //checking for draw condition.
 //since this doesn't work now, I commented out this part. Will be fixed

    /*for(int i=0;i<6;i++){
        for (int j=0 ; j<7;j+=2){
            if((f[i][j+1] != " ")
                    && (f[i][j+3] != " ")
                    &&(f[i][j+5] != " ")
                    &&(f[i][j+7] != " "))
                return "draw";
        }
    }*/
