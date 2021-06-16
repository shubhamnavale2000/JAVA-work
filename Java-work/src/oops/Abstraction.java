package oops;

																												

/*Object of abstract class can not be created */
																																																																																															

abstract class ClgNew{
	void work() {
		System.out.println("Clg class work");
	}
	void work1() {
		System.out.println("Clg class work1");
	}
}

class TeacherNew extends ClgNew{
	void teaching() {
		System.out.println("teaching");
	}
	void work1() {
		System.out.println("Teacher class work1");
	}

}
public class Abstraction {
	
	public static void main(String[] args) {
		TeacherNew obj = new TeacherNew();
		obj.work();
		obj.work1();        //overriding
		obj.teaching();
	}

}
																																																																																														