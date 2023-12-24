
import java.util.*;
public class loopbasicques {
    public static void main(String args[]){

//Practice questions
//1. Print the sum of first n natural numbers.
Scanner sc = new Scanner(System.in);
System.out.println(sc);
System.out.println("Enter your integer");
int a = sc.nextInt();
int sum=a*(a+1)/2;
System.out.println(sum);
//this can also be written as following
for(int i=0;i<=a;i++){
    sum=sum+i;
}//comment the first code otherwse it will print the double sum of a
    System.out.println(sum);

    //2. Print the table of a number input by the user
    int b=sc.nextInt();
    for(int j=1;j<11;j++){
        System.out.println(j*b);
    }


    }
}
