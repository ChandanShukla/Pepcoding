import java.util.*;

public class powerLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		
		System.out.println(powLog(x,n));

	}
	
	public static int powLog(int x,int n) {
		if(n==0) {
			return 1;
		}
		else if(n%2==0) {
			int tempE = powLog(x, n/2);
			return tempE*tempE;
		}
		else {
			int tempO = powLog(x, n/2);
			return tempO*tempO*x;
		}
	}

}
