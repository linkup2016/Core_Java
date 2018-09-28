import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		String name;
		int id;
		
		try {
			Scanner input = new Scanner(System.in);
			Scanner input2 = new Scanner(System.in);

			Stack<Student> studentList = new Stack<Student>();

			System.out.println("Student ID: ");
			id = input.nextInt();
			while (id != -1) {
				System.out.println("Name: ");
				name = input2.nextLine();
				Student student = new Student();
				student.setStudentId(id);
				student.setName(name);
				studentList.push(student);
				System.out.println("Student ID: ");
				id = input.nextInt();
			};

			input.close();
			input2.close();
			try {
				writeStudentList(studentList);
			} catch (IOException e) {
				System.out.println("Writing on a file went wrong ");
			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static void writeStudentList(Stack<Student> studentList) throws IOException {
		File file = new File("students.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Student i : studentList) {
				writer.println(i.getName());
				writer.print(i.getStudentId());
			}
			writer.close();
		}

	}

}