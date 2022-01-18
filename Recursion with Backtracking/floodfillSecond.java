package Practice;
import java.io.*;
import java.util.*;



public class floodfillSecond {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean [][]visited) {
        if(visited[sr][sc] == true){
            return ;
        }
        if(sr == maze.length - 1 && sc == maze[0].length - 1){
            System.out.println(asf);
            return ;
        }

        visited[sr][sc] = true;
        if(sc<maze[0].length-1){
            if(maze[sr][sc+1]==0){
                floodfill(maze,sr,sc+1,asf+"r",visited);
            }
        }

        if(sr<maze.length-1){
            if(maze[sr+1][sc]==0){
                floodfill(maze,sr+1,sc,asf+"d",visited);
            }
        }

        if(sc>0){
            if(maze[sr][sc-1]==0){
                floodfill(maze,sr,sc-1,asf+"l",visited);
            }
        }

        if(sr>0){
            if(maze[sr-1][sc]==0){
                floodfill(maze,sr-1,sc,asf+"t",visited);
            }
        }
        visited[sr][sc]=false;
    }
}