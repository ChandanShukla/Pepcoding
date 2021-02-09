import java.util.*;


public class powerLinearRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		
		System.out.println(powerLinear(x,n));
	}
	
	public static int powerLinear(int x,int n) {
		if(n==0) {
			return 1;
		}
		int temp=powerLinear(x,n-1);
		int power=x*temp;
		return power;
		
	}

}
