import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		int stop = 0;
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> nums = new LinkedList<>();

		System.out.println("Please insert a number ");
		stop = input.nextInt();
		while (stop != 0) {
			nums.add(stop);
			System.out.println("Insert the next number ");
			stop = input.nextInt();
			nums.add(stop);
		}
		input.close();
		Iterator<Integer> iterator = nums.iterator();

		for (int i : nums) {
			int highestFreq = Collections.frequency(nums, i);		
			System.out.println(i + ": is the most frequent number" );	
			
		}

	}

}
