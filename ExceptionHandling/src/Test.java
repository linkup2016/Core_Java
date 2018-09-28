
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		double num;
		try {
			Scanner input = new Scanner(System.in);		
			System.out.println("Enter an integer ");
			num = input.nextDouble();
			if(num > 20) {
				throw new ArithmeticException("Number beyond limit");
			}
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}	

	}

}
