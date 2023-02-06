package ejercicioLaboratorio;

public class Persona {

	private String name;
	private String lastName;
	private Integer age;
	private Document document;

	public Persona() {
		this.age = (int) ((Math.random() * 99) + 1);
	}

	public Persona(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.age = (int) ((Math.random() * 99) + 1);
	}

	public Persona(String name, String lastName, Integer age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Persona(String name, String lastName, Integer age, Document document) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.document = document;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Persona document1) {
		this.document = (Document) document1;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.lastName);
		System.out.println(this.document.getDniType());
		System.out.println(this.document.getDniNumber());
		isMayor();
	}

	public void isMayor() {
		if (this.age >= 18) {
			System.out.println("Sos mayor de edad: " + this.age);
		} else {
			System.out.println("Sos menor de edad");
		}
	}

}
