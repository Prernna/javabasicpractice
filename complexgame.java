    /*
     Create the class game, which allows a user to play" Guess the number" game once. game should have the following methods:
     1.Constructor to generatr the random number
     2. Takeuserinput() to take a user input of number
     3. isCorrectnumber() to detect whether the nmber entered by the user is true or not
     use properties such as noOfGuesses(int),etc get this task done
     4. getters and setters for no. of guesses.
    sol-> suppose comp selected random no. 43 (bw 0 to 50)
    user-49 //no. is too big
    40 //no. is small
    42 //no. is smaa
    45 //no. is big
    43 //no. is correct
    now print the score of the user 
     */

package practice;

import java.util.Random;
import java.util.Scanner;

class game{
    int user,comp,guess;

    public game(){

 comp = (int)Math.random()*(50);
    System.out.println("Computer have choosen the number."+comp);
    }
    // public game(){}
    public void setuser(int n){ this.user=n;}
    public int getuser(){ return user; }
    // public void setcomp(int m){ this.comp=m;}
    // public int getcomp(){ return comp;}
    public int isCorrect(){
        if (user>comp) return -1;
        else if(user<comp) return 1;
        else return 0;
    }
    public void guess(){ guess++;}
}

public class game{
public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);
//  Random rd = new Random();
// int comp,user;
// comp = rd.nextInt(50);
// user=sc.nextInt(50);

// System.out.println(player.getcomp());
// System.out.println(player.getuser());
game player = new game();
int n=0;
while(true){
    System.out.println("Enter your number between 1 to 50 :");
    n=sc.nextInt();
    player.setuser(n);
    System.out.println(player.getuser());
}
 if(player.isCorrect()==0){
    player.guess();
    System.out.println("Your guess is right");
    System.out.println("Number of your counts is "+ (player.guess));
    break;
}
else if(player.isCorrect()==1){
    player.guess;
}
// player.setcomp(comp);
// player.setuser(user);

// if(user>comp){
//     System.out.println("OOPS! Your no. is large ");
// }
// else if(user<comp){
// System.out.println("AHMM!! your no. is small.");
// }
// else if(user==comp){
//     System.out.println("Your guess is right!!");
// }
// else{
//     System.out.println("Try!Try! You will get closer.");
// }





}
}
