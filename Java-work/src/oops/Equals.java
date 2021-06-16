package oops;

																					
																																								
import java.util.*;

public class Equals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings:");
		String a,b;
		a = sc.nextLine();
		b = sc.nextLine();
		
		check(a,b);
		
		sc.close();
	}
	public static void check(String a, String b) {
		
		char A[]= a.toCharArray();
		char B[]= b.toCharArray();
		
		int i=0,j=0;
		while(i<A.length && j<B.length) {
			if(A[i] != B[i])
				System.out.println("false");
				break;
			//else 
				//System.out.println("true");
		}
	}
}
