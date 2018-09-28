
public class Employee extends Person {

	private int id;

	Employee(String fName, String lName, int age, int id) {
		super(fName, lName, age);
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
