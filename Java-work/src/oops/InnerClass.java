package oops;

	

class OuterClassA{
	
	int a = 15;
	
	void xyz() {
		System.out.println("Outer xyz");

	}
	
	class InnerClassA{
		
		int b = 25;
		
	}
}

public class InnerClass {

	public static void main(String[]args) {
		
		OuterClassA objO = new OuterClassA();			//object creation of outer class
		
		OuterClassA.InnerClassA objI = objO.new InnerClassA();     //object creation of inner class 
		
		System.out.println(objO.a);
		objO.xyz();
		System.out.println(objI.b);

	}
}
