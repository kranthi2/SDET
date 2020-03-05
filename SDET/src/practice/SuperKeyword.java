package practice;

/*
 * Suoer Keyword:
 * 1) Super Keyword can be used to refer Immediate parent class Instance Variable
 * 2) Super can be used to refer Immediate Parent class Method
 *
 *Final Keyword:
 *1) Variable: you can not change the value of the Variable
 *2) Method: you can not over ride in the child class
 *3) Class: you can not extend into another
 */

class AAA{
	final int a=10;
//	 void m1() {
//		 a=20;		// final can
//	 }
}


public class SuperKeyword extends AAA{

	int a=20;
	
	void m(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		SuperKeyword sk = new SuperKeyword();
		System.out.println(sk.a);
		sk.m();
		
	}

}
