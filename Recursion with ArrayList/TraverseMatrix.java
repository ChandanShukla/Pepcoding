package Practice;

import java.util.Scanner;

public class TraverseMatrix {

    public static void traverse(int [][]arr,int currRow,int currCol){
        if(currRow == arr.length){
            return ;
        }

        System.out.println(arr[currRow][currCol]);

        if(currRow < arr.length){
            if(currCol < arr[0].length -1){

                traverse(arr,currRow,currCol+1);
            }else{
                traverse(arr,currRow+1,0);
            }
        }

    }

    public static void main(String []args){
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int m = scn.nextInt();
        int [][]matrix =  {{1,2,3,5,6,7},{4,5,6,7,8,9},{7,8,9,7,8,90}};
        traverse(matrix,0,0);
    }
}
