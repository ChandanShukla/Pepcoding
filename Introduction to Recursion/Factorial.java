package Practice;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int fact = 1;
        if(n==1){
            return 1;
        }
        fact *= n*factorial(n-1);
        return fact;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
