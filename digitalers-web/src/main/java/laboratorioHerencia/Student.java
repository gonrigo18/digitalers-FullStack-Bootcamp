package laboratorioHerencia;

import java.util.Arrays;

public class Student extends Person {

	private Course[] courses;

	public Student(Integer id, String name, String lastName, Document document, Integer age, Course[] courses) {
		super(id, name, lastName, document, age);
		this.courses = courses;
	}
	
	

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return super.toString() +  "Student [courses=" + Arrays.toString(courses) + "]";
	}
	
	

}
