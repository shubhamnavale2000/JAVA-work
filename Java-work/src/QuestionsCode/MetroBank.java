package QuestionsCode;



public class MetroBank {

	public static void calculate_loan( int account_number, int salary, int account_balance, String loan_type, int loan_amount_expected, int customer_emi_expected) {
		
		String acc_no = String.valueOf(account_number);

		
		if (acc_no.length() == 4 && (account_number/1000)==1) {
			
			if(account_balance >= 100000) {
				
				if (salary > 25000 && loan_type.equals("Car")) {
					
					if (loan_amount_expected <= 500000 && customer_emi_expected <= 36) {
						
						System.out.println("eligible account number for loan "+ acc_no + " ");
						
						System.out.println("loan amount is "+loan_amount_expected+" emi is "+customer_emi_expected);
						
					}else {
						
						System.out.println("The customer is not eligible for the loan");
						
					}
					
					
				}else if(salary > 50000 && loan_type.equals("House")) {
					
					
					if (loan_amount_expected <= 6000000 && customer_emi_expected <= 60) {
						
						System.out.println("eligible account number for loan "+ acc_no + " ");
						
						System.out.println("loan amount is "+loan_amount_expected+" emi is "+customer_emi_expected);
						
					}else {
						
						System.out.println("The customer is not eligible for the loan");
						
					}
					
					
				}else if(salary > 75000 && loan_type.equals("Business")) {
					
					if (loan_amount_expected <= 7500000 && customer_emi_expected <= 84) {
						
						System.out.println("eligible account number for loan "+ acc_no + " ");
						
						System.out.println("loan amount is "+loan_amount_expected+" emi is "+customer_emi_expected);
						
					}else {
						
						System.out.println("The customer is not eligible for the loan");
						
					}
					
				}else {
					System.out.println("Invalid loan type or salary");
				}
			}else {
				System.out.println("Insufficient account balance");
			}
			
		}else {
			System.out.println("Invalid account number");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate_loan(1001,40000,250000,"Car",300000,30);
	}

}

