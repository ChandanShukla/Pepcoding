package Practice;

import java.util.Scanner;

public class printMazePath {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sc == dc && sr == dr){
            System.out.println(psf);
            return ;
        }

        if(sc <= dc){
            printMazePaths(sr,sc+1,dr,dc,psf+"h");
        }
        if(sr <= dr){
            printMazePaths(sr+1,sc,dr,dc,psf+"v");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printMazePaths(1,1,n,m,"");

    }

}
