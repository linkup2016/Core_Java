package com.yebelete.taxiDriverAssistant;

import java.util.Scanner;

public class Lease {

	Scanner input = new Scanner(System.in);
	int selectedShift;

	public int selectShift() {
		System.out.println("Please select: ");
		System.out.println("1 for Day Shift: ");		
		System.out.println("2 for Weekend Shift: ");		
		System.out.println("3 for 24 hours Shift: ");		
		System.out.println("4 for Night Shift: ");		
		System.out.println("5 for Sunday Night Shift: ");		
		System.out.println("6 for Holiday Night Shift: ");		
		System.out.println("7 for Weekly Shift: ");		
		System.out.println("8 for Owner Operator: ");		
		System.out.println("9 for Holiday Day Shift: ");
		selectedShift = input.nextInt();
		
		return selectedShift;
	}

	public double getLeasingRates(int leasePick) {
		switch (leasePick) {
		case 1:
		case 2:
		case 3:
			return 88.00;
		case 4:
			return 60.00;
		case 5:
		case 6:
			return 44.00;
		case 7:
			return 650.00;
		case 8:
			return 444.00;
		case 9:
			return 65.00;
		default:
			System.out.println("Shift not recognized. Please select your shift again: ");
			break;
		}
		return 0;
	}

	/*
	 * private static final double DAY_SHIFT = 88.00; private static final double
	 * NIGHT_SHIFT = 60.00; private static final double WEEKEND_SHIFT = 88.00;
	 * private static final double OVERCAB_SHIFT = 88.00; private static final
	 * double SUNDAY_NIGHT_SHIFT = 44.00; private static final double WEEKLY_SHIFT =
	 * 650.00; private static final double OWNER_OPERATOR = 444.00; private static
	 * final double HOLIDAY_DAY_SHIFT = 65.00; private static final double
	 * HOLIDAY_NIGHT_SHIFT = 44.00;
	 */

}
