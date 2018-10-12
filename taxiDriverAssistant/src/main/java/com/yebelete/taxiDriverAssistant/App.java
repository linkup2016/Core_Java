package com.yebelete.taxiDriverAssistant;
/**
 * This program assists cab drivers manage their daily business 
 *by keeping a record of their finance, cabs history and overall
 *activity
 */
public class App {
	
	public static void main( String[] args )    {    
    
    	Report.printReport(Form.getSalesData(), Form.getExpenseData(), Form.getCabInfo());
    }
}
