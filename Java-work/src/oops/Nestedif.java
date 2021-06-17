package oops;

import java.util.*;

public class Nestedif {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number: ");
    int no = sc.nextInt();
	System.out.println(no);

	if(no%3 ==0 && no%5 == 0) {
		System.out.println("No.is divisble by both 3 and 5");
		}
	else if(no%3 == 0){
		System.out.println("No.is divisble by 3");
	}
	else if(no%5 == 0) {
		System.out.println("No.is divisble by 5");
	}
	else {
		System.out.println("Not divisble");
	}
	
	sc.close();
  }
}