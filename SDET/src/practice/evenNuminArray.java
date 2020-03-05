package practice;

public class evenNuminArray {

	public static void main(String[] args) {

		int a[]= {-10,-11,12,13,14};
		
		// To Print Even Numbers
		for(int i:a) 
		{
			if(i%2==0) {
				System.out.println(i);
			}	
		}
		System.out.println("Odd Numbers");
		
		// To Print odd Numbers
		for(int i:a) 
		{
			if(i%2!=0) {
				System.out.println(i);
			}	
		}
		
		System.out.println("Positive Numbers");
		//Positive Numbers
		for(int i:a) 
		{
			if(i>0) {
				System.out.println(i);
			}	
		}
		
	}

}
