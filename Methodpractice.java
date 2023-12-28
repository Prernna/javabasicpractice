package practice;

public class Methodpractice{
    
    static void table(int n){
    for(int i=1;i<=10;i++){
        System.out.format("%d X %d = %d \n" , n ,i,n*i);
        
    }
    }
    
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
            System.out.print("*");

            }
            System.out.println(" ");
        }
    }
    
    static int recurse(int n){
        if(n==1){
            return 1;
        }
        //sum(n)=1+2+3+4+5...+n-1
        //sum(n)=1+2+3+4+...(n-1)+n
        //sum(n)=sum(n-1)+n
        return n + recurse(n-1);
    }
    
    static void pattern2(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
            System.out.print("*");
        }
        
            System.out.println(" ");
        }
        
    }
    
    static int fib(int n){
        // if(n==1){
        //     return 0;
        // }
        // else if(n==2){
        //     return 1;
        // }
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    static int avg(int...arr){
        int average=0;
        int sum=0;
        for(int b:arr){
            sum += b;
        }
        average=sum/arr.length;
        return average ;
    }
    
     static void pattern1recursive(int n){
        if(n>0){
            pattern1recursive(n-1);
for(int i=0;i<n;i++){
            System.out.print("*");
        }
    System.out.println();
    }
        
    }

//     static void pattern2recursive(int n){
//         if(n<0){
//             pattern2recursive(n+1);
// for(int i=n;i>0;i--){
//             System.out.print("*");
//         }
//     System.out.println();
//     }
// }
    


    public static void main (String args []){
        
        //Practice questions
        //1.Write a java method to print multiplication table of a number n
        table(2);
        
        //2.Write a program using functions to print the following pattern: * ** *** ****
        pattern1(5);
        
        //3.Write a recursive function to calculate sum of first n natural numbers
       int a= recurse(4);
       System.out.println(a);
        
        //4.Write a function to print the following pattern. **** *** ** *
        pattern2(5);
        
        //5.Write a function to print nth term of fibonacci series usig recursion. if index is given in ques then it will start from 0 otherwise it will start from 1.
        // fibonacci series = 0,1,1,2,3,5,8,13....
        int result=fib(6);
        System.out.println(result);
        
        //6.Write a function to find average of a set of numbers passed as arguments
        System.out.println(avg(1,2,3,4));
        System.out.println(avg(5,6,7));    
        
        //7.Repeat ques2 using Recursion
        pattern1recursive(4);

        // //8.Repeat ques4 using Recursion

        // pattern2recursive(4);


    }
}
