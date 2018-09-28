import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		//Example 1: Using fixed thread pool
		
		SayHello hello = new SayHello();
		SayWhatever say = new SayWhatever("Why there is no one in here?");
		SayWhatever say2 = new SayWhatever("I am so blessed!!");
		SayWhatever say3 = new SayWhatever("Can I get an ice creame please?");
		
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.execute(hello);
		executor.execute(say);
		executor.execute(say2);
		executor.execute(say3);
		
		//Example 1: Using cached thread pool
		//With cached thread pool, new threads are created as needed. 
		
		ExecutorService executor2 = Executors.newCachedThreadPool();
		executor2.execute(new SayWhatever("Shhhhhh"));
		executor2.execute(new SayWhatever("wow"));
		executor2.execute(new SayWhatever("ummm"));
		executor2.execute(hello);
	}

}


