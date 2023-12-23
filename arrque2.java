// 5.*****write a java program to reverse an array

int[] arr ={1,2,3,4,5,6,7,8,9};
int l=arr.length;
int n = Math.floorDiv(l, 2); // used to return the largst(closest)  value that is less then or equal to given length.
int temp;

for(int i=0 ;i<n; i++){
    //Swap a[i] and a[l-1-i]
    // a  b  temp
    // |4| |3| | |

    temp = arr[i];
    arr[i]= arr[l-i-1];
    arr[l-i-1]=temp;
    System.out.println(temp);
}

for( int element: arr){
    System.out.println(element);
}
