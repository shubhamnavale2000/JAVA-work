package inheritance;


class A {
	void a() {
		System.out.println("A class");
	}
}

class B extends A{
	void b() {
		System.out.println("B class");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.a();
		obj.b();
	
	}
}