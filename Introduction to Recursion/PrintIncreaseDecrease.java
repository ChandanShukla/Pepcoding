package Practice;

import java.util.Scanner;

public class PrintIncreaseDecrease {

    public static void printIncreaseDecrease(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncreaseDecrease(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printIncreaseDecrease(n);

    }

}
