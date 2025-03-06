package app;

import java.util.Scanner;

public class Student {
	private String name;
	private String surname;
	private int year;
	private String studentId;
	private int tuitionBalance;
	private String courses;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name:");
		this.name = in.nextLine();
		
		System.out.println("Enter student last name:");
		this.surname = in.nextLine();
		
		System.out.println("Enter student class level:\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senor\nEnter:");
		this.year = in.nextInt();
		
		setStudentId();
		
		System.out.println(name + " " + surname + " " + year + " " + studentId);
	}
	
	private void setStudentId() {
		id++;
		this.studentId = year + "" + id;
	}
}
