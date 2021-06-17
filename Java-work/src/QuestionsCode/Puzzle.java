package QuestionsCode;


public class Puzzle {
	
	public static void solve(int heads,int legs) {
		
		int chicken_count=0;
	    int rabbit_count=0;
		
		
		if (legs % 2 == 0) {

			rabbit_count = (legs/2)-heads;
			
			chicken_count = heads - rabbit_count;
			
			System.out.println("chicken_count "+ chicken_count +" rabbit_count "+ rabbit_count);
			
		}else {
			System.out.println("no solution");
		}		
	}

	public static void main(String[] args) {
		
		solve(35,94);
		
	}

}