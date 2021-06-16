package inheritance;

class Animal{
	void walk() {
		System.out.println("I am Walking");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("I am Flying");
	}
	void sing() {
		System.out.println("I am Singing");
	}
}

public class InheritanceExp1 {
	public static void main(String args[]) {
		Bird b = new Bird();
		b.walk();
		b.fly();
		b.sing();
	}
}
															