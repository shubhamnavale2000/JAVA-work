package oops;

	

class Clg{
	void work() {
		System.out.println("Clg class");
	}

}

class Teacher extends Clg{
	void work() {
		System.out.println("Teaching");
	}
}

class Student extends Clg {
	void work() {
		System.out.println("Learning");
	}
	
}

class Management extends Clg{
	void work() {
		System.out.println("Managing");
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		Clg objC =new Clg();
		Clg objT = new Teacher();
		Clg objS = new Student();
		Clg objM = new Management();
		objC.work();
		objT.work();
		objS.work();
		objM.work();
	}
}
	