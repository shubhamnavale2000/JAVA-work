package oops;

import java.util.*;


class Math {
	int add(int a,int b) {
		return a+b;
	}
	int product(int a,int b) {
		return a*b;
	}
}


public class Exp1 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter two numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	Math m =new Math();
	System.out.println(m.add(a,b));
	System.out.println(m.product(a,b));
	
	sc.close();
	
	}

}