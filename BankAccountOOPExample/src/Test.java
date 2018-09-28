
import java.util.Date;

//Testing Account class
public class Test {

	public static void main(String[] args) {

		double BeginingBalance = 1000;
		int id = 1122;		
		double interestRate = 0.015;
		double currentBalance;
		Date transactionDate;

		Account acct = new Account(id, BeginingBalance);
		acct.setAnnualInterestRate(interestRate);
		acct.deposit(30, "Pay Aug 01");
		acct.withdraw(5, "Processing fee Aug 01");
		acct.deposit(40, "Pay Aug 02");
		acct.withdraw(5, "Processing fee Aug 02");
		acct.deposit(50, "Pay Aug 01");
		acct.withdraw(5, "Processing fee Aug 03");

		id = acct.getId();
		currentBalance = acct.getBalance();
		transactionDate = acct.getDateCreated();

		System.out.println("**** Balance Report *****");
		System.out.println("");
		System.out.println("Customer Id " + id);
		System.out.println("Transaction Date " + transactionDate.toString());
		System.out.println("Begining Balance " + BeginingBalance);
		System.out.println("Recent Activity ");
		System.out.println(" ");
		System.out.println("Date					Type		Description			Amt			Balance ");
		for(Transaction i: acct.getActivity()) {
			System.out.print(i.getTransactionDate()+"         	"+ i.getType() + "      "+ i.getDescription()+"     		"+
		i.getAmount()+"      "+ i.getBalance());
			System.out.println(" ");
		}
		System.out.println("Current Balance is: " + currentBalance);

		/*// Testing the Savings Account
		SavingsAccount savAcc = new SavingsAccount();
		savAcc.setBalance(1000);
		savAcc.withdraw(1500);

		// Testing the Checking Account
		CheckingAccount checkAcct = new CheckingAccount();
		checkAcct.setBalance(1200);
		checkAcct.withdraw(1300);
		checkAcct.getBalance();

		// Using an ArrayList to store objects
		ArrayList<Object> obj = new ArrayList<>();
		obj.add(acct);
		obj.add(savAcc);
		obj.add(checkAcct);
		
		for(Object i: obj) {
			System.out.println(i.toString());
		}*/
	}
}
