package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetKPC {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char firstChar = str.charAt(0);
        String leftOver = str.substring(1);

        ArrayList<String> rResults = getKPC(leftOver);
        ArrayList<String> myResult = new ArrayList<>();


        String code = codes[Integer.parseInt(String.valueOf(firstChar))];
        List<Character> chars = code.chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());
        for(Character ch:chars){
            for(String result:rResults) {
                myResult.add(ch + result);
            }
        }


        return myResult;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        ArrayList<String> result = getKPC(input);
        System.out.println(result);

    }
}
