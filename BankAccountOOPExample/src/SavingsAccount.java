
public class SavingsAccount extends Account {
	
	public void withdraw(double withdrawAmt) {
		double balance = getBalance();
		if(balance >= withdrawAmt) {
			balance = balance - withdrawAmt;
		}else {
			System.out.println("Insufficent fund!!");
		}
	}
}
