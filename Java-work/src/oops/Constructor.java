package oops;
																																														

public class Constructor {
	
	int studId;
	String studName;
	
	Constructor(int id,String name){
		studId = id;
		studName = name;
		System.out.println("This is constructor");
		
	}
	
	void studinfo() {
		System.out.println("Student info Id "+studId+" and Name is "+studName);
		
	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(101,"Shubham");
		obj.studinfo();
	}

}
																																		