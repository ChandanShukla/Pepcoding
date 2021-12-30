package Practice;

import java.util.Scanner;

public class PowerLog {


    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int res = power(x,n/2);
        int finalRes = res*res;

        if(n%2==1){
            finalRes = finalRes*x;
        }
        return finalRes;

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(x,n));
    }
}
