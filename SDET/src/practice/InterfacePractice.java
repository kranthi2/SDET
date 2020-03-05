package practice;

//Interface 1:

	interface inter1{
		int a=10;
		int b=20;
		void sum();
	}


// Class to Implement 
public class InterfacePractice implements inter1{

	public void sum() {
	System.out.println(a+b);	
	}
	
	public static void main(String[] args) {
		InterfacePractice ip = new InterfacePractice();
		ip.sum();		
	}

}
