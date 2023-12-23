6.Write a java program to find the maximum element in an array

int[] arr ={1,2,3,4,5,6,7,8,9};
int max=0;
for(int element:arr){
    if(element>max){
        max = element;
    }
}
         System.out.println("The maximum value of this array is :  " + max);


//7.Write a java program to find the minimum element in an array


int[] arr ={211,24,32,34,54,66,70};

// int min=4098;  to find the minimum number in the given array we can put the greatest number which is not present in the list (if the list no. are countable) or we can use Integer.MAX_VALUE 

int min=Integer.MAX_VALUE; //Ths is used to check the max value and then to check it from the given number of integers. we can also use Integer.MIN_VALUE. to swap it and check it with the maximum number of element in the given array.

for(int element:arr){
    if(element<min){
        min = element;
    }
}
         System.out.println("The minimum value of this array is :  " + min);

