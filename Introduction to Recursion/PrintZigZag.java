package Practice;

import java.util.Scanner;

public class PrintZigZag {


    public static void printZigZag(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        printZigZag(n-1);
        System.out.println(n);
        printZigZag(n-1);
        System.out.println(n);

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printZigZag(n);

    }
}
