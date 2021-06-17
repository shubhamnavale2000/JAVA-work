package QuestionsCode;


public class SmsEncoding {

	public static void sms_encoding(String data) {
		String[] words = data.split(" ");
		String sms = "";
//		System.out.println(data.split(" "));
		for (int i=0; i<words.length; i++) {
			String word = words[i];
			for (int j = 0; j<word.length();j++ ) {
				if (word.charAt(j)=='a' || word.charAt(j)=='e' || word.charAt(j)=='i' || word.charAt(j)=='o' || word.charAt(j)=='u') {
					continue;
				}else {
					sms += word.charAt(j);
				}
			}
			sms += " ";
		}
		System.out.println(data);
		System.out.println(sms);
	}
		
	public static void main(String[] args) {
		String data="I will not repeat mistakes";		
		sms_encoding(data);
	}
}
