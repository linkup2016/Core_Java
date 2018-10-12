package com.yebelete.taxiDriverAssistant;

import java.util.Date;

public class Sales {
	Date transactionDate;
	private double voucherSalesAmt = 0;
	private double creditCardSalesAmount = 0;
	private double cashSalesAmt = 0;
	private double otherRevenueAmount = 0;
	
	public Sales() {
		
	}
	public Sales(double voucherSalesAmt, double creditCareSalesAmount, double cashSalesAmt, 
			double otherRevenueAmount) {
		this.voucherSalesAmt = voucherSalesAmt;
		this.creditCardSalesAmount = creditCareSalesAmount;
		this.cashSalesAmt = cashSalesAmt;
		this.otherRevenueAmount = otherRevenueAmount;
	}
	public Date getTransactionDate() {
		transactionDate = new Date();
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getVoucherSalesAmt() {
		return voucherSalesAmt;
	}
	public void setVoucherSalesAmt(double voucherSalesAmt) {
		this.voucherSalesAmt = voucherSalesAmt;
	}
	public double getCreditCardSalesAmount() {
		return creditCardSalesAmount;
	}
	public void setCreditCareSalesAmount(double creditCareSalesAmount) {
		this.creditCardSalesAmount = creditCareSalesAmount;
	}
	public double getCashSalesAmt() {
		return cashSalesAmt;
	}
	public void setCashSalesAmt(double cashSalesAmt) {
		this.cashSalesAmt = cashSalesAmt;
	}
	public double getOtherRevenueAmount() {
		return otherRevenueAmount;
	}
	public void setOtherRevenueAmount(double otherRevenueAmount) {
		this.otherRevenueAmount = otherRevenueAmount;
	}
	
	public double calculateTotalSales() {
		double totalSales;
		totalSales = voucherSalesAmt + creditCardSalesAmount + cashSalesAmt + otherRevenueAmount;
		return totalSales;
	}
}

