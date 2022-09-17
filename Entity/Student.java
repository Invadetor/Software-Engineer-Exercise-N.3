package BCE.Entity;

public class Student {

	private String number;
	private String name;
	private String lastname;
	private Position p;


	public void setP(Position p) {
		this.p = p;
	}

	public Student(String name, String lastname, String number) {
		this.name = name;
		this.lastname = lastname;
		this.number = number;
	}

	public String getName() { return this.name; }

	public String getLastname() {
		return this.lastname;
	}

	public String getNumber() { return number; }

}