package oops;

											

public class ThisKeyword {
	
	int studId;
	String studName;
	
	ThisKeyword(int id,String name){
		studId = id;
		studName = name;
		System.out.println("This is constructor");
		
	}
	
	void testMethod(){
		System.out.println("This is implemented");
	}
	
	void studinfo() {
		this.testMethod();
		System.out.println("Student info Id "+studId+" and Name is "+studName);
		
	}
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(101,"Shubham");
		obj.studinfo();
	}
}
	