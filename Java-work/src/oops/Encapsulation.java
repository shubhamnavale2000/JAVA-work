package oops;
																																																																																																																																													
class testFive{
	
	private String name;
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String nameArg) {
		this.name = nameArg;
	}
}

public class Encapsulation {

	public static void main(String[] args) {																																																																																				
	testFive obj = new testFive();

	obj.setName("Shubham");
	System.out.println(obj.getName());
	}
}

																												