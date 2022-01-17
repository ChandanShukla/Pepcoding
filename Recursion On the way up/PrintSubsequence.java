package Practice;

import java.util.Scanner;

public class PrintSubsequence {

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }
        char first = str.charAt(0);
        String left =str.substring(1);


        printSS(left,ans+first);
        printSS(left,ans+"");


    }

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(str,"");
    }
}
