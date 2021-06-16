package oops;
	




class A {
	String name ="Shubham";

	void a() {
		System.out.println("A class");
	}
	void xyz() {
		System.out.println("Parent xyz");
	}
}

class B extends A{
	void b() {
		super.xyz();
		this.xyz();
		
		System.out.println("B class,name is: "+super.name);
	}
	
	void xyz() {
		System.out.println("child xyz");
	}
}
public class SuperKeyword{

	public static void main(String[] args) {
		B obj = new B();
		obj.a();
		obj.b();
	
	}
}


	