package Practice;

import java.util.Scanner;

public class BinarySerachRescursion {


    public static int binarySearch(int []arr, int low,int high,int k){
        if(high < low){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid] < k){
            low = mid + 1;
            return binarySearch(arr,low,high,k);
        }
        else{
            high = mid - 1;
            return binarySearch(arr,low,high,k);
        }
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] =  scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(binarySearch(arr,0,arr.length-1,k));


    }
}
