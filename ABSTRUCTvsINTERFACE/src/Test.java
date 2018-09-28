
public class Test {

	public static void main(String[] args) {
		
		
		Coffee coffee1 = new Coffee(false, 4, 5, 'S', 3);
		
		System.out.println("Your order is: Coffee"+ coffee1.isDecafe()+ " "+ coffee1.getCreame()+ " " + coffee1.getSize());
		
		System.out.println("Your total is: $"+ coffee1.calculatePrice());
	}
	

}
