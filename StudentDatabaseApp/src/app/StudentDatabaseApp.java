package app;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student student = new Student();
		student.enroll();
		student.payTuition();
		System.out.println(student.showInfo());
	}

}
