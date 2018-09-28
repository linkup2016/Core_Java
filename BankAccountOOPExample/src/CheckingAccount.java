
public class CheckingAccount extends Account {
	
	private final double OVERDRAFT_FEE = 45.00;	
	// no mutator for overdraft fee because no need to change it. 
	public double getOverdraftFee() {
		return this.OVERDRAFT_FEE;
	}
	public void withdraw(double withdrawAmt) {
		double balance = getBalance();
		if(balance >= withdrawAmt) {
			 balance = balance - withdrawAmt;
			 System.out.println(balance);
		}else {
			 balance = balance - (withdrawAmt + OVERDRAFT_FEE);
			 System.out.println(balance);
		}
	}
}
