package week2Assingment;

public class ManageCourses {
	public void addCourse(Course courseAdd) {
		System.out.println(courseAdd.name+" Kursunuz Eklenmiştir. Kurs bilgileriniz:"+courseAdd.name+" "+courseAdd.teacherName);
	}


	public void deleteCourse(Course courseDelete) {
		System.out.println(courseDelete.name+" Kursunuz Silinmiştir.");

	}
}