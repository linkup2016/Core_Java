package com.yebelete.taxiDriverAssistant;

public class Expenses {
	private static final double BOND = 10;
	private static final double PROCESSING_FEE_RATE = 0.05;
	private double gas;
	private double leaseRate;
	
	public Expenses() {}
	
	public Expenses(double gas, double leaseRate) {
		this.gas = gas;
	}
	public double getLeaseRate() {
		return leaseRate;
	}
	public void setLeaseRate(double leaseRate) {	
		this.leaseRate = leaseRate;
	}

	public static double getBond() {
		return BOND;
	}

	public static double getProcessingFeeRate() {
		return PROCESSING_FEE_RATE;
	}

	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

	public double calculateProcessingFee(double creditSales, double voucherSales) {
		double fees;
		fees = (creditSales + voucherSales) * PROCESSING_FEE_RATE;
		return fees;
	}

	public double calculateTotalExpense() {
		double expenses;
		expenses = gas + BOND + leaseRate;// the lease amount has to come from the main method.
		return expenses;
	}
}
