package Practice;

import java.util.Scanner;

public class PrintPermutations {

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return ;
        }

        for(int i = 0;i < str.length();i++){
            printPermutations(str.substring(0,i)+str.substring(i+1),asf+str.charAt(i));
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printPermutations(str,"");

    }
}
