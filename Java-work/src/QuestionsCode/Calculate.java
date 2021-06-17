package QuestionsCode;


public class Calculate {

	public static int calculate(int distance,int no_of_passengers) {
		
		int fuel_price = 70;
		int mileage = 10;
		int ticket_price = 80;
		int expenses = (distance/mileage) * fuel_price;
		int income = no_of_passengers * ticket_price;
		
		if(income > expenses) {
			return income-expenses;
		}else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		int distance=20;
		int no_of_passengers=50;
		System.out.println(calculate(distance,no_of_passengers));

	}

}