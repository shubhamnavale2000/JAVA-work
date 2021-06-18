package QuestionsCode;

import java.util.ArrayList;

public class GemsStore {

	public static int calculate_bill_amount(ArrayList gems_list, ArrayList price_list, ArrayList reqd_gems,ArrayList reqd_quantity) {
		
		int bill_amount = 0;
		
		ArrayList<Integer> cart = new ArrayList<Integer>();
		
		int gem_price = 0;
		
		int final_bill = -1;
		
		for (int i=0; i < reqd_gems.size();i++) {
			
			String gem = (String) reqd_gems.get(i);
			
			int gem_qty =  (int) reqd_quantity.get(i);
			
			for (int j=0; j<gems_list.size();j++) {
				
				int gem_index = gems_list.indexOf(gem);
				
				if (!gems_list.contains(gem)) {
					
					return bill_amount = -1;
//					break;
					
				}
				
				for (int k=0; k < price_list.size();k++) {
					
					gem_price = (int) price_list.get(gem_index);
					
					gem_price *= gem_qty;
					
				}
				
			}
			
			cart.add(gem_price);
			
		}
		
		for (int i = 0; i <cart.size(); i++) {
			
			bill_amount += cart.get(i);
			
		}
		
		if (bill_amount > 30000 ) {
			
			final_bill = bill_amount - ((bill_amount*5)/100);
			
		}else {
			
			return (bill_amount);
		}
		
		return final_bill;
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> gems_list = new ArrayList<String>();
		
		gems_list.add("Emerald");
		gems_list.add("Ivory");
		gems_list.add("Jasper");
		gems_list.add("Ruby");
		gems_list.add("Garnet");
		
		ArrayList<Integer> price_list = new ArrayList<Integer>();
		
		price_list.add(1760);
		price_list.add(2119);
		price_list.add(1599);
		price_list.add(3920);
		price_list.add(3999);
		
		ArrayList<String> reqd_gems = new ArrayList<String>();
		
		reqd_gems.add("Ivory");
		reqd_gems.add("Emerald");
		reqd_gems.add("Garnetq");
		
		
		ArrayList<Integer> reqd_quantity = new ArrayList<Integer>();
		
		reqd_quantity.add(3);
		reqd_quantity.add(10);
		reqd_quantity.add(12);

		
		int amount  = calculate_bill_amount(gems_list, price_list, reqd_gems, reqd_quantity);
		
		System.out.println(amount);

	}

}