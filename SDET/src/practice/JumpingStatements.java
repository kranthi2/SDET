package practice;

public class JumpingStatements {

	public static void main(String[] args) {

		//Break
		for(int i=1;i<=5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		//continue
		for(int j=1;j<=5;j++) {
			if(j==3) {
				continue;
			}
			System.out.println(j);
		}
		
	}

}
