package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPath {

    public static ArrayList<String> getStairPaths(int n){
        if(n == 0){
            ArrayList<String> baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }else if(n < 0){
            ArrayList<String> baseResult = new ArrayList<String>();
            return baseResult;
        }
        ArrayList<String> path1 = getStairPaths(n-1);  // this will get me all paths starting with 1
        ArrayList<String> path2 = getStairPaths(n-2);  // this will give me path starting with 2
        ArrayList<String> path3 = getStairPaths(n-3);  // this will give me paths starting with 3


        ArrayList<String> myResult = new ArrayList<>();

        for(String path : path1){
            myResult.add(1+path); // adding 1 in front of all the path with 1
        }
        for(String path : path2){
            myResult.add(2+path); // adding 2 in front of all the path with 2
        }
        for(String path : path3){
            myResult.add(3+path); // adding 3 in front of all the path with 3
        }

        return myResult;

    }

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        System.out.println(getStairPaths(input));
    }
}
