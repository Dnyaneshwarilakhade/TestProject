package Abstract;

abstract public class Demo {
	
	Demo(){
		System.out.println("hello Demo");
	}

	public void test() {
		System.out.println("complete method");
	}
	
	public abstract void test1();
	public abstract void test2();
}
