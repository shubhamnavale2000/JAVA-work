package QuestionsCode;


import java.util.ArrayList;
import java.util.List;

public class Leap_Year {
	
	public static List<Integer> find_leap_years(int given_year) {
		
		
		List<Integer> leap_years = new ArrayList<>();
		
		int count = 0;
		
//		for (int i=0;i<15;i++) {
//			
//			if ((given_year % 4==0 && given_year != 100) || given_year % 400 ==0) {
//				
//				leap_years.add(given_year);
//	
//			}	
//			
//			given_year += 4;
//			
//		}
		
		
		while (count < 15) {
			
			if ((given_year % 4==0 && given_year != 100) || given_year % 400 ==0) {
				
				leap_years.add(given_year);
				count ++;
			}	
			
			given_year += 1;
			
		}
		
		return leap_years;
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(find_leap_years(2000));

	}

}