package generic;

import java.util.ArrayList;

public class Test3 {

	
	
	public static void main(String[] args) {
		
	
		ArrayList<String> arr = new ArrayList<String>(); 
		
		arr.add("Chirag");
		arr.add("yash");
	//	arr.add(37353);
		
		
		String data0 = (String) arr.get(0);
		
		String data1 = (String) arr.get(1);
		
		System.out.println(data0);
		System.out.println(data1);
		
	}

}