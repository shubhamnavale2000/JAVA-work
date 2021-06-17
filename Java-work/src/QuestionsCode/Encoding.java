package QuestionsCode;

import java.util.*;

public class Encoding {

		public static void main(String args[]) {
			Scanner sc =new Scanner(System.in);
			String data;
			System.out.println("Enter the string:");
			data = sc.nextLine();
			System.out.println(data);
			encode(data);
			
			sc.close();
		}
		
		public static void encode(String data) {
			
		String[] words = data.split(" ");
		
		String sms ="";
		
		for(int i =0; i<words.length;i++) {
			String word= words[i];
			
			for (int j =0; j< word.length();j++) {
				if(word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u'  ) {
					continue;
				}
				else {
					sms += word.charAt(j);
				}
			}
			sms += " ";
		}
		System.out.println(sms);
		}
}