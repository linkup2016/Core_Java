
public class SayWhatever implements Runnable{
	String message;
	public SayWhatever(String message) {
		this.message = message;
	}
	@Override
	public void run() {
		System.out.println(message);
		
	}
	
	

}
