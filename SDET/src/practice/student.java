package practice;

/*Create a Student class contains sid,sname,sub1,sub2sub3 variables
 * 
 *Methods:
 * getstudata(): Takes student details sid and sname as params and assign them to varibles
 * getstuMarks(): Takes student Marks as parameters and assign them to sub1,sub2,sub3 
 * totalMarks(): Calculate total Marks and print the student details with total Marks
 * 
 * Now, create objects from student class stu1,stu2 etc.. then call Student class Methods.
 */

public class student {
	int sid;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	
	void getstudata(int id,String name) {
		sid=id;
		sname=name;
	}
	
	void getstuMarks(int subj1, int subj2, int subj3) {
		sub1=subj1;
		sub2=subj2;
		sub3=subj3;
		
	}
	
	void totalMarks(){
		System.out.println("sid: "+sid +"  sname: "+sname);
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
	}

}
