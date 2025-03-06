package app;

import java.util.Scanner;

public class Student {
	private String name;
	private String surname;
	private int year;
	private String studentId;
	private int tuitionBalance = 0;
	private String courses = "";
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.name = in.nextLine();
		
		System.out.print("Enter student last name:");
		this.surname = in.nextLine();
		
		System.out.print("Enter student class level:\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senor\nEnter:");
		this.year = in.nextInt();
		
		setStudentId();
		
		System.out.println(name + " " + surname + " " + year + " " + studentId);
	}
	
	private void setStudentId() {
		id++;
		this.studentId = year + "" + id;
	}
	
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses += "\n" + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		}while(true);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
}
