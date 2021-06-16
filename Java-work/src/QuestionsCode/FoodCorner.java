package QuestionsCode;


public class FoodCorner {

	
	public static int calculate_bill_amount(String food_type, int quantity_ordered, int distance_in_kms) {
		
		int food_amount = 0;
		int delivery = 0;
		
		if (food_type.equals("N")) {
			
			food_amount = quantity_ordered * 150;
			
		}
		
		if (food_type.equals("V")) {
			
			food_amount = quantity_ordered * 120;
			
		}
		
		if (distance_in_kms <= 3) {
			delivery = 0;
		}else if(distance_in_kms > 3 && distance_in_kms <= 6) {
			delivery = 3*distance_in_kms;
		}else if(distance_in_kms > 6) {
			delivery = 6*distance_in_kms;
		}
		
		
		
		return food_amount + delivery;
	}
	
	
	public static void main(String[] args) {
		
		
		int bill = calculate_bill_amount("N",2,7);
		
		System.out.println(bill);

	}

}
