package list;

import java.util.ArrayList;

class Student{
	int regNo;
	String name;
	int marks;
	public Student(int regNo, String name, int marks) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class StudentList {

	public static void main(String[] args) {
		Student s1=new Student(1,"Ram",89);
		Student s2=new Student(2,"Janu",85);
		Student s3=new Student(3,"Sindhu",82);
		Student s4=new Student(4,"Sharvan",76);
		Student s5=new Student(5,"Rohit",80);
		ArrayList<Student>list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.forEach(System.out::println);

	}

}
