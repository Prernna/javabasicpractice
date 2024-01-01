package practice;

import java.util.Random;
import java.util.Scanner;
//rock,paper,scissor
public class randomgame {
    public static void main(String[] args) {
        Random rm=new Random();
        Scanner sc=new Scanner(System.in);
System.out.println(sc);

        System.out.println("Welcome to the game :");
        System.out.println("Choose any number between 1 to 3 . where \n 1->rock \n 2->paper \3 3->scissor \nwrite your number");
        int user = sc.nextInt();
        int comp=rm.nextInt(3);
        System.out.println("now, computer has chosen "+comp);

        if(user==comp){
            System.out.println("Match is draw!! ");
        }
        else if(user==1 && comp==3 && user==2 && comp== 1 && user==3 && comp == 2){
            System.out.println("Whoo!! User wins.");
        }
        else if(user>4){
            System.out.println("You can only enter number between 1 to 3.");
        }
        else{

        System.out.println("Computer wins");
        }


    }
}
