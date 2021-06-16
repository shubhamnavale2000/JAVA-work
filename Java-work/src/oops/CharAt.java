package oops;
																											
import java.util.*;

public class CharAt {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		System.out.println("Enter the index no.:");
		int idx = sc.nextInt();
		
		System.out.println(position(str, idx));
		
		sc.close();
		}
	
    public static char position(String str, int idx) {
    	
    	char s[] = str.toCharArray();
    	char res = s[idx];
    	return res;
        }
}

																																									