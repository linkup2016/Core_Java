package com.yebelete.taxiDriverAssistant;

import java.util.Scanner;

public class Form {
	
	private static int shift, cabNumber, rating;		
	private static double cashSales, voucherSales, creditCardSales, otherRevenue, mileage, gas;
	private static String comment;	
	public static double leaseFee;
	
	static Scanner read = new Scanner(System.in);      
    
    public static Sales getSalesData() {    	
        System.out.println("Please enter voucher sales amount: ");
        voucherSales = read.nextDouble();
        System.out.println("Please enter credit card sales amount: ");
        creditCardSales = read.nextDouble();
        System.out.println("Please enter cash sales amount: ");
        cashSales = read.nextDouble();
        System.out.println("Please enter other revenue amount: ");
        otherRevenue = read.nextDouble();        
        Sales sale = new Sales(voucherSales,creditCardSales, cashSales, otherRevenue);
        
        return sale;
    }
    public static Expenses getExpenseData() {    	
    	System.out.println("Please enter gas expense amount: ");
        gas = read.nextDouble();
        Lease leaseRate = new Lease();
        shift = leaseRate.selectShift();
        leaseFee = leaseRate.getLeasingRates(shift);
        Expenses expense = new Expenses(gas, leaseFee); 
        
        return expense;
    } 
    public static Cab getCabInfo() { 	    	
    	System.out.println("What is the cab number?: ");
        cabNumber = read.nextInt();
        System.out.println("Please the last mileage: ");
        mileage = read.nextDouble();
        System.out.println("How do you rate this cab out of 5?: ");
        rating = read.nextInt();
        System.out.println("Do you have any comment on this cab?: ");
        read.nextLine();// added this line prevent Scanner close out before reading the last input
        comment = read.nextLine();
        Cab cab = new Cab(cabNumber, mileage, rating, comment);
        
        read.close();
        return cab;
    }
}
