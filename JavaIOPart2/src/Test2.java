import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws TextNotFoundException{
		System.out.print("Enter a URL ");
		String URLString = new Scanner(System.in).next();
		int count = 0;
		try {
			URL url = new URL(URLString);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				String line = input.nextLine();
				System.out.print(line+" ");
			}
		}
		catch(MalformedURLException ex) {
			System.out.print("Invalid URL ");
		}
		catch(IOException ex) {
			throw new TextNotFoundException("Input not found ");
		}
	}

}
