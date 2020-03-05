package practice;

public class StaticExample {

	
	int a=10;
	static int b=20;
	
	void m1() {
		System.out.println("this is non Static Method");
	}
	
	static void m2() {
		System.out.println("This is Static Method");
	}
	
	void m3() {
		// 1.Non Static methods can access everything directly
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		// 2.Static methods can access only Static Stuff
		System.out.println(b);  
		m2();
		
		// 3.Static method can access non Static stuff by creating obj.
		StaticExample se = new StaticExample(); 
		se.m1();
		System.out.println(se.a);
	}

}
