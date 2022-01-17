package Practice;

import java.util.Scanner;

public class PrintKPC {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return ;
        }
        char firstChar = str.charAt(0);
        String seq = codes[firstChar - '0'];
        for(int i = 0;i < seq.length();i++){
            printKPC(str.substring(1),asf+seq.charAt(i));
        }

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String inp = scn.next();
        printKPC(inp,"");
    }
}
