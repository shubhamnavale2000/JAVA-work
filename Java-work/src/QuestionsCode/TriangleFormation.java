package QuestionsCode;

import java.util.*;

public class TriangleFormation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		System.out.println("Enter sides of triangle:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		check(a,b,c);
		
		sc.close();
	}
	
	public static void check(int a,int b,int c) {
		if (a >= (b+c) || b >= (a+c) || c >= (a+b)) {
			System.out.println("Triangle can't be formed");
		}
		else {
			System.out.println("Triangle can be formed");
		}
	}
}