package practice;

public class thisKeyword {

	int a=10;
	int b=20;
	
	void add(int a,int b){
		System.out.println(this.a);
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		thisKeyword th = new thisKeyword();
		th.add(100, 200);
		System.out.println(th.a);
	}
	
	
	/*
	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
	
	void getstudata(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	void getstuMarks(int sub1, int sub2, int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	
	void totalMarks(){
		System.out.println("sid: "+id +"  sname: "+name);
		int sum =sub1+sub2+sub3;
		System.out.println("Total Marks: "+sum);
		
	}
	
	
	public static void main(String[] args) {
		
		student s1 = new student();
		s1.getstudata(1, "Kranthi");
		s1.getstuMarks(10, 20, 30);
		s1.totalMarks();
		
		
		student s2 = new student();
		s2.getstudata(2, "mamidala");
		s2.getstuMarks(40, 20, 30);
		s2.totalMarks();
	}    */
}
