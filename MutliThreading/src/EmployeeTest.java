import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTask task1 = new EmployeeTask();
		WelcomeTask task2 = new WelcomeTask();
		
		// Using a thread pool helps to reuse threads. The executor methods manages the execution of tasks for us. 
		//fixed thread pool runs tasks consecutively
		ExecutorService exec = Executors.newFixedThreadPool(1);
		//cached thread pool runs all tasks concurrently.
		//ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(task1);
		exec.execute(task2);
		
		//Option 1: shown below is creating a thread for each task. Unmanageable when the tasks are too many.
		//Alternative is option two shown above which is using a thread pool. 
		//Thread thread1 = new Thread(task1);
		//Thread thread2 = new Thread(task2);
		
		//thread1.start();
		//thread2.start();		
		
	}
	
	
}
