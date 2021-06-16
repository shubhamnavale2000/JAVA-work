package oops;

																																																										
import java.util.*;

public class ChangeCase{
	
	public static void main(String[] args) {
		
		System.out.print("Enter the Name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println(name);
		
		
		Case obj = new Case();
		
		obj.lowerCase(name);
		obj.upperClass(name);
		sc.close();
	}
}

 class Case{
	
	public void lowerCase(String name) {
		
		char str[] = name.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			if(str[i]>='A' && str[i]<='Z') {
				 str[i] = (char)(str[i]+32);
			}
		}
		System.out.println("name in lowercase:");
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}
	
	public void upperClass(String name) {
		
       char str[] = name.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			if(str[i]>='a' && str[i]<='z') {
				 str[i] = (char)(str[i]-32);
			}
		}
		System.out.println();
		System.out.println("name in uppercase:");
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}
	}
}
