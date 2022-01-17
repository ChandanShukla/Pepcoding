package Practice;

import java.util.Scanner;

public class PrintStairPaths {

    public static void printStairPaths(int n, String path) {
        if(n == 0){
            System.out.println(path);
            return ;
        }
        for(int i=1;i<=3 && n>=0;i++){
            printStairPaths(n-i,path+i);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printStairPaths(n,"");
    }
}
