package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetSubsequence {

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char firstChar = str.charAt(0);
        String subWithoutFirst = str.substring(1);
        ArrayList<String> result = gss(subWithoutFirst);

        ArrayList<String> myResult = new ArrayList<>();

        for(String rstr: result){
            myResult.add(""+rstr);
        }
        for(String rstr: result){
            myResult.add(firstChar+rstr);
        }
        return myResult;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        List<String> subSequence = gss(str);
        for(String sequence: subSequence){
            System.out.println(sequence);
        }
    }
}
