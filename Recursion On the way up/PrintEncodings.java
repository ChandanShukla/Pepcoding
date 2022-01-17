package Practice;

import java.util.Scanner;

public class PrintEncodings {

    public static void printEncodings(String str,String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }else if(str.length()==1){
            char firstChar =str.charAt(0);
            char firstAlpha = (char)(str.charAt(0) + '0');
            asf += firstAlpha;
            System.out.println(asf);
        }else{
            char firstChar =str.charAt(0);
            char firstAlpha = (char)(str.charAt(0) + '0');
            if(firstChar == '0'){
                return ;
            }else{
                String first = str.substring(1);
                printEncodings(first,asf+firstAlpha);
            }
            String firstTwo = str.substring(0,2);
            String second = str.substring(2);
            int check = Integer.parseInt(firstTwo);
            if(check <= 26){
                char code =(char) ('a'+check-1);
                printEncodings(second,asf+(code));
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printEncodings(str,"");
    }
}
