package generic;


class Sample1<A,B>{
	
	A obj1;
	B obj2;
	Sample1(A obj1,B obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
		
	}
	public void data() {
		 System.out.println(this.obj1+" "+this.obj2);
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample1<Integer,String> obj1 = new Sample1<Integer,String>(37439,"Rituraj");
		
		Sample1<String,Integer> obj2 = new Sample1<String,Integer>("Rituraj",37439);
		
		obj1.data();
		
		obj2.data();
		
	}

}