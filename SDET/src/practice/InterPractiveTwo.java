package practice;

// Interface 1:
interface intone{
	int a=10;
	int b=20;
	
	void add();
}

// Interface 2:
interface inttwo{
	int x=10;
	int y=20;
	
	void mul();
}

// Main Class to Implement Interface
public class InterPractiveTwo implements intone,inttwo{

	public void mul() {
		System.out.println("Multiplication is "+(x*y));
		
	}

	public void add() {

		System.out.println("Addition is "+(a+b));
	}
	public static void main(String[] args) {

		InterPractiveTwo ip2 = new InterPractiveTwo();
		ip2.add();
		ip2.mul();
	}

	

}
