package basic;
class College{
	int collegeCode;
	String collegeName;
	String collegeLocation;
	public College(int collegeCode, String collegeName, String collegeLocation) {
		this.collegeCode = collegeCode;
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
	}
	public void collegeDetails() {
		System.out.println("College Code="+collegeCode);
		System.out.println("College Name="+collegeName);
		System.out.println("College Location="+collegeLocation);
	}
}
class Student{
	int rollNo;
	String studentName;
	String studentBranch;
	College coll;
	public Student(int rollNo, String studentName, String studentBranch, College coll) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.coll = coll;
	}
	public void studentDetails() {
		System.out.println("Student Roll No="+rollNo);
		System.out.println("Student Name="+studentName);
		System.out.println("Student Branch="+studentBranch);
		System.out.println("College Details...");
		coll.collegeDetails();
	}
}
public class CollegeTest {

	public static void main(String[] args) {
		College co1=new College(1234,"KITS","Guntur");
		Student s1=new Student(19,"Janu","CSE",co1);
		s1.studentDetails();

	}

}
