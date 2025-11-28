import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TotalCalculation {
	public static void main(String[] args) {
		final double tax = 0.053;
		double subTotal = 0.0;
		try (Scanner fileIn = new Scanner(new File("items.txt"))){
			while(fileIn.hasNextDouble()) {
				subTotal += fileIn.nextDouble();
			}
		}catch(FileNotFoundException e) {
			System.err.println("Error: items.txt file not found");
			return;
		}
		double taxAmount = subTotal * tax;
		double Total = subTotal + taxAmount;
		try(PrintWriter fileOut = new PrintWriter(new File("total.txt"))){
			fileOut.printf("Sub-Total: $%.2f%n", subTotal);
			fileOut.printf("Sales Tax: $%.2f%n", taxAmount);
			fileOut.printf("Total: $%.2f%n", Total);
			System.out.println("Calculation results written to total.txt");
		}catch(FileNotFoundException e) {
			System.err.println("Error creating total.txt file");
		}
	}
}