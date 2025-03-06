package app;

import java.util.Scanner;

public class Student {
	private String name;
	private String surname;
	private int gradeLevel;
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
		this.gradeLevel = in.nextInt();
		
		setStudentId();
	}
	
	private void setStudentId() {
		id++;
		this.studentId = gradeLevel + "" + id;
	}
	
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses += "\n  " + course;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		}while(true);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	public String showInfo() {
		return "Name: " + name + " " + surname + 
				"\nGrade level: " + gradeLevel +
				"\nStudent id: " + studentId +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
