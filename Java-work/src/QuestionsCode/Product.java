package QuestionsCode;

import java.util.Scanner;

public class Product {

	public static int find_product(int a, int b,int c) {
		int nums[] = {a,b,c};
		int len = nums.length;
		int product= 0;
		
		for (int i=0; i< len ; i++) {
			
			if(nums[0] == 7) {
				product = nums[1]*nums[2];
			    }
			else if(nums[1] == 7) {
				product = nums[2];
			    }

			else if (nums[2] == 7) {
				product = -1;
			}
			else
				product = nums[0]*nums[1]*nums[2]; 
		}
		return product;
	}
	
	public static void main(String ars[]) {
		Scanner sc = new Scanner(System.in);
		int x=0,y=0,z=0;
		System.out.println("Enter three numbers: ");
		x= sc.nextInt();
		y= sc.nextInt();
		z= sc.nextInt();
		
		System.out.println(find_product(x,y,z));
		sc.close();
	}

}