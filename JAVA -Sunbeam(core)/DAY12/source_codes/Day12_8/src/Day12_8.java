import java.util.ArrayList;

// ArrayList of type User defined class Student

class Student
{
	int rollno;
	int marks;
	int age;
	public Student() 
	{
		super();
		
	}
	public Student(int rollno, int marks, int age) 
	{
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", age=" + age + "]";
	}
	 
	void acceptRecord()
	{
		// logic for accepting rn, marks,name 
	}
	
} //end of Student class



public class Day12_8 {

	public static void main(String[] args) 
	{
		Student s1 = new Student(1,85,20); // s1 ==> NP type
		Student s2 = new Student(2,95,18);
		Student s3 = new Student(3,78,19);
		Student s4 = new Student(4,63,17);
		
		// s1.acceptRecord();
		
		
		
		ArrayList<Student> l1 = new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		//System.out.println("L1 = "+l1);
		
		for(Student s : l1)
			System.out.println(s);
		
		System.out.println("fetch roll no of first record of  student ");
		System.out.println(l1.get(1).rollno);
		
		

	}

}
