package laboratorioHerencia;

public class MainPerson {

	public static void main(String[] args) {

		int quantity = 2;
		
		Student[] student = new Student[quantity];
		
		Student carlos = new Student(1, "carlos" , "Lopez", new Document("DNI", "123456789"), 35, null);
		
		Course[] courses = new Course[1];
		courses[0] = new  Course("Digitalers");
		
		carlos.setCourses(courses);
		
		System.out.println(carlos);

	}

}
