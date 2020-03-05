package practice;

public class ReverseString {

	public static void main(String[] args) {

		// reverse a String
	String name = "KRANTHI";
	for(int i=name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
	}
	System.out.println();
	
	// Print all the words of sentence in reverse
	String name1= "my name is Kranthi";
	String a[]=name1.split(" ");
	
	for(int j=a.length-1;j>=0;j--) {
		System.out.println(a[j]);
	}
	}
}
