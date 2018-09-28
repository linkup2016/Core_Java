import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws IOException {
		//Reading from a file. 
		//The following program reads a file created previously using the program down below (which is commented out)
		//The scanner object reads the file delimited by a white space.
		//The try block is not here for exception handling. This is a new way of creating and using resources 
		//that should be closed at the end of an operation. Java closes them for us in case we forget. 
		File file = new File("customers.txt");
		try (				
				Scanner input = new Scanner(file);	
				){
			while(input.hasNext()){
				String fName = input.next();
				String lName = input.next();
				String phone = input.next();
				String phoneNumber = input.next();
				String purchase = input.next();
				String total = input.next();
				double spending = input.nextDouble();
				System.out.println(fName+" "+lName+" "+phone+" "+phoneNumber+" "+purchase+" "+total+" "+spending);
			}
			input.close();
		}
	}
		
		//Writing on a file
		//IO programs must be written in a try catch block; Compiler forces you to declare an exception. 
		/*File file = new File("customers.txt");

		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(file);
		output.print("John Massink ");
		output.print("Phone 6143458976 ");
		output.println("Purchase total 540.09");
		output.print("Ruba Duba ");
		output.print("Phone 0987654324 ");
		output.println("Purchase total 222.00");
		output.close();

	}
*/
}
