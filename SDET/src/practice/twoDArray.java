package practice;

public class twoDArray {

	public static void main(String[] args) {
		// Static Array
		int a[][] = new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;

		System.out.println(a[0][1]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		
		// Dynamic Array
		int m[][]= {{10,20},{30,40}};
		System.out.println(m[1][1]);
		
		// For Each loop or Enhanced for loop
		for(int n[]:m) {      //Here, we are 1st row of m (i.e 10,30)
			for(int r:n){	  //Here, we are 1st num of 1st row(i.e 10,30)
				System.out.print(r+" ");
			}
			System.out.println();
		}	
	}
}
