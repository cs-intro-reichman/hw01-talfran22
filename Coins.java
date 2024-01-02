/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int money = Integer.parseInt(args[0]);
		// #Feedback: better to not do calculation in print commands
		int quarters = money / 25;
		int cents = money % 25;
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}
