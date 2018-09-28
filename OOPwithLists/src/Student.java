
public class Student {
	private String name;
	private Course [] courses;
	
	Student(String name, Course [] courses){
		this.name = name;
		this.courses = courses;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
