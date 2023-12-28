package dsacourse;
import java.util.*;
public class patterns {
    public static void main (String args[]){
//1.Print the pattern - Solid rectangle
Scanner sc =new Scanner(System.in);
System.out.println(sc);
//This will help us to print the stars as per users need. or we can also put the vallue without putting the scanner class.
// int n = sc.nextInt();
// int m = sc.nextInt();
//outer loop-->rows
// for(int i=1;i<=n;i++){
//     //inner loop-->coloumns
//     for(int j=1;j<=m;j++){
// System.out.print("*");
// }
// System.out.println("");
// }
// //2.Print the pattern. A hollow rectangle with only borders in it. 
// int n=4;
// int m=5;
// //outer loop
// for(int i=1;i<=n;i++){
//     //inner loop
//     for(int j=1;j<=m;j++){
//         //cell-> (i,j)
//         if(i==1 || j==1 || i==n || j==m){
//         System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//         System.out.println("");
// }

// //3.Print the pattern -> Half pyramid

// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println("");
// }

// //4.Print the pattern -> Inverted Half pyramid

//     for(int i=4;i>=1;i--){   //or it can be written like this for(int i=1;i>=4;i++){
//      for(int j=i;j>=1;j--){  // for(int j=i;j>=4;j++){

//          System.out.print("*"); //System.out.print("*");
//      }
//     System.out.println("");
// }

// //5/Print the pattern -> Inverted half pyramid (rotated by 180 degree)
// int n=4;
// //outer loop
// for(int i=1;i<=n;i++){
//     //inner loop
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     //inner loop -> start print
//      for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// //6.Print the pattern ->Half pyramid with numbers
// int n=5;
// //outer loop
// for(int i=1;i<=n;i++){
//     //inner loop
//     for(int j=1;j<=i;j++){
//         System.out.print(j+"");
//     }
//     System.out.println();
// }

// //7.Print the pattern ->Inverted Half pyramid with numbers
// int n=5;
// //outer loop
// for(int i=n;i>=1;i--){  //for(int i=n;i>=1;i--){  
//     //inner loop
//     for(int j=1;j<=i;j++){   //OR for(int j=1;j<=n-i+1;j++)
//         System.out.print(j);
//     }
//     System.out.println();
// }

//8.Print the Pattern-> Floyd's triangle
int n=5;
int number = 1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(number +" ");
        number ++;  //number=number + 1;
    }
    System.out.println();
}

//9.Print the Pattern-> 0-1 triangle
// int n=5;

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        int sum=i+j;
        if(sum%2==0){ //even
System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        // System.out.print(i);
    }
    System.out.println();
}


    }
}
