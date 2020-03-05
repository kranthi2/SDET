package practice;

public class oneDArray {

	public static void main(String[] args) {

		int a[] = new int[3]; // Static 1D Array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		for(int c=0;c<a.length;c++) {  //for Loop
			System.out.println(a[c]);
		}
		
		int b[]= {40,50,60,70}; // Dynamic 1D Array
		for(int d:b) {			// Nested for-each loop
			System.out.println(d);
		}
	}

}
