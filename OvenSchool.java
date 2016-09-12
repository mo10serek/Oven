import java.util.Scanner;

/*
 * Created by: Michael Balcerzak
 * Created on: 12-Sep-2016
 * Created for: ICS4U
 * Daily Assignment – 1-04
 * This program ask the user to pick which item and how many and tells how long it will take to heat
*/

public class OvenSchool {

	public static void step1(double item, double order) 
	{
		
	}
	
	public static void main(String[] args) {
		// Create scanner object
        Scanner input = new Scanner(System.in);
		
		double item = 0;
		double order = 0;
		double steps = 1;
		
		
		//input
        System.out.println("pick any item by writing a number like 1 as sub, 2 as pizza, or 3 as soup: ");		
        int itemOrder = (int) input.nextDouble();
		
		if (itemOrder == 1) 
		{
			item = 60;
		}
		else if (itemOrder == 2)
		{
			item = 45;
			steps = steps + 1;
		}
		else if (itemOrder == 3)
		{
			item = 105;
			steps = steps + 1;
		}
		else 
		{
			System.out.println("invalid input");
			steps = steps + 1;
		}
		
		System.out.println("how many item you want bettween 1 to 3: ");		
		int NumberOfItems = (int) input.nextDouble();
        
		if (NumberOfItems == 1) 
		{
			order = item;
		}
		else if (NumberOfItems == 2)
		{
			order = item * 1.5;
		}
		else if (NumberOfItems == 3)
		{
			order = item * 2;
		}
		else 
		{
			System.out.println("invalid input");
		}
	
        
		order = order/60;
        System.out.println("It will run for: " + Double.toString(order) + " mins.");

		
	}

}
