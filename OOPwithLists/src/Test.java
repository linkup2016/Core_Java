
public class Test {

	public static void main(String[] args) {
		Course class1 = new Course("English", 65.45);
		Course class2 = new Course("Java", 80.22);
		Course class3 = new Course("HTML", 45.45);
		
		Course[] classes = {class1, class2, class3};
		Student stud1 = new Student("Lema", classes);
		
		getStudentStatus(stud1);
	}
	
	public static void getStudentStatus(Student student) {
		Course [] courselist = student.getCourses();
		System.out.println("**** Student Status Report ****");
		System.out.println("");
		System.out.println("Student Name: "+ student.getName());
		System.out.println("Courses registered for: ");
		for (Course i: courselist){
			System.out.println(i.getCourseTitle());
		}
		
		
	}

}
