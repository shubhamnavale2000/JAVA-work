package QuestionsCode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMax {
	
	public static void find_max(int num1,int num2) {
//		int sum = 0;
//		int count = 0;
		
		List<Integer> num_list = new ArrayList<>();
		
		if(num1 >=10 && num2 <= 99) {
			if (num1> num2) {
				
				System.out.println("not allowed...");
				
			}else {
			
				for (int i = num1; i<= num2; i++) {
					
					if(i%3==0 && i%5==0){
						
						num_list.add(i);
					}
				}
				
				
				System.out.println(num_list);
				
				System.out.println(Collections.max(num_list)); 
				
			}	
		}else {
			System.out.println("not allowed");
		}
		
	}

	public static void main(String[] args) {
		
		find_max(10,99);

	}

}