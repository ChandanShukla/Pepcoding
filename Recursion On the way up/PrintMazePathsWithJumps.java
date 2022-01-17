package Practice;

import java.util.Scanner;

public class PrintMazePathsWithJumps {

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return ;
        }
        for(int i = 1;i<= dc-sc;i++){
            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i);
        }
        for(int j = 1;j<=dr-sr;j++){
            printMazePaths(sr+j,sc,dr,dc,psf+"v"+j);
        }
        for(int k = 1;k<=dc-sc && k<=dr-sr;k++){
            printMazePaths(sr+k,sc+k,dr,dc,psf+"d"+k);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printMazePaths(1,1,n,m,"");
    }
}
