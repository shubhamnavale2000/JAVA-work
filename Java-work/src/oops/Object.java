package oops;


public class Object {
	
	
	public String myAge(int abc) {
		return ("my age is "+abc);
	}
	
	public static void main(String[] args) {
		
		String first_name,last_name;
		int age;
		boolean isActive;
		
		
		//typecasting automatic
		int data= 10;
		double newData = data;
		System.out.println(newData);
		
		//typecasting manually
		double var = 10.01;
		int var1 = (int) var;
		System.out.println(var1);
		
		
		
		
		
		first_name = "Chirag";
		last_name = "Rahul";
 		age= 30;
		isActive = true;
		
		Object obj = new Object();
		obj.myAge(age);
		
		System.out.println(first_name+" "+last_name+" "+obj.myAge(30));
		System.out.println(first_name+" "+last_name+" "+obj.myAge(49));
		
		
		if(isActive) {
			System.out.println(first_name+" "+last_name+" "+obj.myAge(32));
		}else {
			System.out.println("This account is not activated.....");
		}
		
	}

}
