package assignment;

public class Student {

	private int rollNo;
	private String name;
	private String course;
	private String result;
	private char grade;
	private int mark;

	public void setInfo(int rollNo, String name, String course, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.mark = marks;
		System.out.println(mark);
	}


	public String setResult(int mark) {
		if (mark > 60)
			return result = "PASS";
		else
			return result = "FAIL";
	}

	public char setGrade(double mark) {
		if (mark > 90)
			return grade = 'A';
		else if ( mark < 90  && mark > 80)
			return grade = 'B';
		else if ( mark < 80  && mark > 70)
			return grade = 'C';
		else if ( mark < 70 && mark > 60)
			return grade = 'D';
		else
			return grade = 'F';
	}

	public void display() {
		System.out.println("Name       :" + name);
		System.out.println("Roll No    :" + rollNo);
		System.out.println("Course     :" + course);
		System.out.println("Marks      :" + mark);
		grade=setGrade(mark);
		System.out.println("Grade      :" + grade);
		result=setResult(mark);
		System.out.println("Result     :" + result);
	}

	public static void main(String[] args) 
	{
		 Student student=new Student();
		 student.setInfo(1, "MONIKA", "CDAC",88);
		 student.display();
		 
	}

}
