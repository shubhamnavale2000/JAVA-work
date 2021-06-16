package inheritance;

				

class A1{
	void a() {
		System.out.println("a method A class");
	}
}

class B1 extends A1{
	void b() {
		System.out.println("b method B class");
	}
}

class C1 extends B1{
	void c() {
		System.out.println("c method C class");
	}
}

public class Multilevel {
	public static void main(String args[]) {
	    C1 obj = new C1();
		obj.a();
		obj.b();
		obj.c();
	}
}				
