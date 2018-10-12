package com.yebelete.taxiDriverAssistant;

public class Report {	
	
	public static void printReport(Sales sale, Expenses expense, Cab cab) {
		System.out.println("****  SHIFT ACTIVITY REPORT  ****");
		System.out.println("Transaction Date " + sale.getTransactionDate().toString());
		System.out.println("");		
	
		System.out.println("Sales                   ");	
		System.out.println("Cash Sales                 " + sale.getCashSalesAmt());	
		System.out.println("Credit Card sales          " + sale.getCreditCardSalesAmount());	
		System.out.println("Voucher Sales              " + sale.getVoucherSalesAmt());	
		System.out.println("Total Sales                  " + sale.calculateTotalSales());	
		System.out.println("");				
	
		System.out.println("Expenses                   ");	
		System.out.println("Lease                      " + Form.leaseFee);//lease fee has been made public in the Form class.
		System.out.println("Bond                       " + Expenses.getBond());	
		System.out.println("Gas                        " + expense.getGas());	
		System.out.println("Processing Fee             " + expense.calculateProcessingFee(sale.getCreditCardSalesAmount(), sale.getVoucherSalesAmt()));	
		System.out.println("Total Expenses               " + expense.calculateTotalExpense());	
		System.out.println("");				
	
		System.out.println("                   ");	
		System.out.println("Profit/Loss                      " + (sale.calculateTotalSales() - expense.calculateTotalExpense()));	
		
		System.out.println("");
		System.out.println("");
		System.out.println("********    Cab Info     *******");
		System.out.println("");
		System.out.println("Cab used: Cab " + cab.getCabNumber());
		System.out.println("Last Mileage reported: " + cab.getLastMileage());
		System.out.println("Cab is rated " + cab.getRating() + " Stars");
		System.out.println("Comment on the cab: " + cab.getCabStatus());
		
	}
	
}
