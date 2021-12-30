package Practice;

import java.util.Scanner;

public class PowerLinear {
    public static int power(int x, int n){
        int result = 1;
        if(n==0){
            return 1;
        }
        result *= x*power(x,n-1);
        return result;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(power(x,n));

    }
}
