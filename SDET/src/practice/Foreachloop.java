package practice;

public class Foreachloop {
	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a.length);
		System.out.println(a[1]);
		
		System.out.println("for Loop");	
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("for each loop");
		for(int j:a) {
			System.out.println(j);
		}
		}

}
