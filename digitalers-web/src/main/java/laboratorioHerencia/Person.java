package laboratorioHerencia;

public class Person {

	private static Integer autoId=0;
	private Integer id;
	private String name;
	private String lastName;
	private Document document;
	private Integer age;

	public Person(Integer id, String name, String lastName, Document document, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.document = document;
		this.age = age;
		autoId++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + ", document=" + document + ", age="
				+ age + "]";
	}
	
	

}
