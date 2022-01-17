package Practice;

import java.util.ArrayList;

public class GetMazePathJump {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        ArrayList<String> myResult = new ArrayList<>();
        for(int i = 1;i<=dc-sc;i++){
            ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String hpath:hpaths){
                myResult.add("h"+i+hpath);
            }
        }

        for(int j = 1;j<=dr-sr;j++){
            ArrayList<String> vpaths = getMazePaths(sr+j,sc,dr,dc);
            for(String vpath:vpaths){
                myResult.add("v"+j+vpath);
            }
        }

        for(int k = 1;k<=dr-sr && k<=dc-sc;k++){
            ArrayList<String> vpaths = getMazePaths(sr+k,sc+k,dr,dc);
            for(String vpath:vpaths){
                myResult.add("d"+k+vpath);
            }
        }
        return myResult;
    }

    public static void main(String []args){
        System.out.println(getMazePaths(1,1,2,2));
    }
}
