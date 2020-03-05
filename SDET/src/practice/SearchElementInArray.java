package practice;

public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int num=20;
		boolean flag =true;
		
		for(int n:a) 
		{
			if(n==num)
			{
				System.out.println("Element Found");
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
		System.out.println("Element not Found");
		}
	}

}
