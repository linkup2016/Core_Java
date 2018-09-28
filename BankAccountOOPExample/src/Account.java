import java.util.ArrayList;
import java.util.Date;

public class Account {
	int id;
	private double balance;
	private double annualInterestRate;
	private double monthlyInterstRate;
	private ArrayList<Transaction> activity = new ArrayList<>();
	Date dateCreated;

	public ArrayList<Transaction> getActivity() {
		return activity;
	}

	public void setActivity(ArrayList<Transaction> activity) {
		this.activity = activity;
	}

	public Account() {

	}

	public double getMonthlyInterstRate() {
		return monthlyInterstRate;
	}

	public void setMonthlyInterstRate(double monthlyInterstRate) {
		this.monthlyInterstRate = monthlyInterstRate;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		dateCreated = new Date();
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		this.monthlyInterstRate = annualInterestRate / 12;
		return monthlyInterstRate;
	}

	public double getMonthlyInterest() {
		return balance * monthlyInterstRate;
	}

	public void withdraw(double withdrawAmt, String description) {
		balance = balance - withdrawAmt;
		Transaction WthTran = new Transaction('w', withdrawAmt, balance, description);
		activity.add(WthTran);
	}

	public void deposit(double depositAmt, String description) {
		balance = balance + depositAmt;
		Transaction DipTran = new Transaction('d', depositAmt, balance, description);
		activity.add(DipTran);

	}
}
