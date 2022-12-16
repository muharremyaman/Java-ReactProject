package week2Assingment;


public class Main {

	public static void main(String[] args) {
		
		
		Course course1=new Course(1,"Maths","Engineering","Osman","10b");
		
		ManageCourses manageCourse=new ManageCourses();
		manageCourse.addCourse(course1);
		
		Student student1=new Student(2,"Omer","Asaf",20,'E');
		
		ManageStudent manageStudent=new ManageStudent();
		manageStudent.addStudent(student1);
		
		
	
		

	}

}
