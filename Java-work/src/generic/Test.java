package generic;


class Sample<A>{
	A obj;
	Sample(A obj){
		this.obj = obj;
	}
	
	public A data() {
		return this.obj;
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Sample<Integer> obj1 = new Sample<Integer>(37439);
		Sample<String> obj2 = new Sample<String>("Shidhar");
		System.out.println(obj1.data());
		System.out.println(obj2.data());

	}

}