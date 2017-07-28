package InvoiceApplication;

import java.util.Scanner;

public class InvoiceApplication {

	//input this support the code and all it to run smoothly 
    @SuppressWarnings("unused")
	private static String cout;
	@SuppressWarnings("unused")
	private static double totalCost;

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        // inputing double,strings,int variable

        double taxRate;
        double total = 0.00;
        totalCost = 0.00;
        double tax = 0.00;
        double cost = 0.00;
        int counter = 0;
        cout = "y";

        // scanner initiation 
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the tax rate");
        taxRate = keyboard.nextDouble();

        //do while loop so it can do a full run through before choosing which code to run first

        Object cont = null;
        do {
            // using counter to allow the code to run without breaking each loop
            // using if/else statement to give code a choice   
            counter++;
            System.out.println("Enter the cost of product" + counter);
            cost = keyboard.nextDouble();

            if (cost == 0)
                cont = "n";
// using keyboard.next statement to buffer all of the input searching for the line to skip if no line separators are present.
            keyboard.nextLine();
            tax = tax + (0.01 * taxRate * cost);
            total = total + cost;

        } while (!cont.equals("n"));
        System.out.println("Your bill amount is "  + total + "\nYour tax is" + (total + tax) );   

    }

}

