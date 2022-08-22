package Abstract;

public class Demo2 extends Demo{ 
	
	//one oe more concrete classes will be there until it complet all the mehod of abstract class
	

	Demo2(){
		System.out.println("Demo2");
	}
	public void test1() {
		System.out.println("this is complete method");
	}
	
	public void test2() {
		System.out.println("this is concrte class method");
	}
	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		d2.test();
		d2.test1();
		d2.test2();
	}

}
