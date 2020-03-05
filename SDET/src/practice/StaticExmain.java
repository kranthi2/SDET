package practice;

public class StaticExmain {

	public static void main(String[] args) {
		StaticExample.m2();
		System.out.println(StaticExample.b);
		
		StaticExample sem = new StaticExample();
				sem.m1();
		System.out.println(sem.a);
		
	}

}
