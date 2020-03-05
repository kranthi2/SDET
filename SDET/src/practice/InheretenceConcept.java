package practice;

class A{
	void AA() {
		System.out.println("AA Method in A class");
	}		
}

class B extends A{
	void BB() {
		System.out.println("BB Method in B class");
	}
}


public class InheretenceConcept extends B{

	
	public static void main(String[] args) {
	
		InheretenceConcept in = new InheretenceConcept();
				in.AA();
				in.BB();
		
		A a = new A();
		a.AA();
		
		B b = new B();
		b.AA();
		b.BB();
		
	}
}
