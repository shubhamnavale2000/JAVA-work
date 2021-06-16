package oops;

	

	
class testThree{
	
	void xyz() {
		System.out.println("parent method");
	}
}

class testFour extends testThree {
	
	void xyz() {
		System.out.println("Child method");
	}
	
}

public class Overrinding {
	
	public static void main(String[] args) {
		testFour obj = new testFour();
		obj.xyz();
	}
}
