package practice;

public class loopConcept {

	public static void main(String[] args) {

		// While loop.
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		// to print odd numbers
		int j=1;
		System.out.println("Odd Numbers");
		while(j<=10) {	
			System.out.println(j);
			j=j+2;
		}
		
		// to print even numbers
		System.out.println("Even Numbers");
		int k=2;
		while(k<=10) {
			System.out.println(k);
			k=k+2;
		}
		// print values from 10-1
		int l=10;
		System.out.println("printing the values from 10-1");
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		
		//***********Do-While loop*************//
		System.out.println("Do while loop");
		int m=1;
		do {
			System.out.println(m);
			m++;
		}
		while(m<=5);
		
		//*******For Loop********//
		System.out.println("for Loop");
		for(int n=1;n<=5;n++) {
			System.out.println(n);
		}
		
	}

}
