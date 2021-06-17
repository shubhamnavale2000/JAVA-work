package QuestionsCode;


import java.util.Arrays;

public class Double_Check {
	
	
	public static void check_double(int number) {
		
		int mulnum = number * 2;
		
		String num = String.valueOf(number);
		String dnum = String.valueOf(mulnum);
		
		char[] num_array = num.toCharArray();
		Arrays.sort(num_array);	
		
		char[] dnum_array = dnum.toCharArray();
		Arrays.sort(dnum_array);	
		
		int count = 0;
		
		for (int i=0; i<num_array.length;i++) {
			
			if (num_array[i]==dnum_array[i]) {
				count ++;
			}else {
				System.out.println("false");
				break;
			}
		}
		
		if (count == num_array.length) {
			System.out.println("true");
		}
		
	}
	

	public static void main(String[] args) {
		
		
		int number = 125874;
		
		check_double(number);
		

	}

}