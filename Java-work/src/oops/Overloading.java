package oops;

	class testOne{
		void xyz() {
		System.out.println("xyz without argument");
	}
	void xyz(String name) {
		System.out.println("xyz with argument "+name);																										
	}
}
public class Overloading {																																													
	public static void main(String[] args) {
		
		testOne obj = new testOne();
		obj.xyz();
		obj.xyz("Shubham");
	}
}
