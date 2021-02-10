import java.util.*;

public class ZigZag_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		
		pzz(n);

	}
	
	public static void pzz(int n) {
		if(n==0) {
			return ;
		}
		System.out.print(n);
		pzz(n-1);
		System.out.print(n);
		pzz(n-1);
		System.out.print(n);
		
		
	}

}
