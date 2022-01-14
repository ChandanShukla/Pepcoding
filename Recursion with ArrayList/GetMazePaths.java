package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
        if(sr == dr && dc == sc){
            ArrayList<String> baseResult = new ArrayList<String>();
            baseResult.add("");
            return baseResult;
        }

        ArrayList<String> myResult = new ArrayList<>();
        if(sc<dc){
            ArrayList<String> paths1 = getMazePaths(sr,sc+1,dr,dc);
            for(String path:paths1){
                myResult.add('h'+path);
            }
        }
        if(sr<dr){
            ArrayList<String> paths2 = getMazePaths(sr+1,sc,dr,dc);

            for(String path:paths2){
                myResult.add('v'+path);
            }
        }


        return myResult;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }
}


