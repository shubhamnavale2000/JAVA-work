package oops;


																															
class testTwo{
	
	static int add(int a,int b) {
		return a+b;
	}
	static int add(double a,double b) {
		return (int)(a+b);
	}
	
}

public class OverloadingwithDataType {

		public static void main(String[] args) {
			
			System.out.println(testTwo.add(10, 20));
			System.out.println(testTwo.add(10.2, 20));
			
		}
}
																												