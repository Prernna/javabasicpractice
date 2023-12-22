//3 Calculate the average marks from an array containing marks of all students in physics using for each loop.

int[] physics={45,46,48,49,40};
int avg=0;
for(int element:physics){
    avg=avg+element;
    }
System.out.println("average is " + avg/physics.length);

// 4. Create a java program to add two matrices of size 2X3

int[][] mat1 ={{1,2,3},
               {4,5,6}};
int[][] mat2 ={{3,2,1},
               {6,5,4}};   
               
int[][] result={{0,0,0},
                {0,0,0}};       

for(int i=0;i<mat1.length;i++){   //prints rows that are 2
    for(int j=0;j<mat1[i].length;j++){   //Coloumn number of time

        // System.out.format(" Setting value for i=%d and j=%d \n" ,i,j);    //Use this formatting in other for loop to prevent over explaining of output.
        result[i][j]=mat1[i][j]+mat2[i][j];
        System.out.print(result[i][j] +  " ");
    }
System.out.println("");
}                

