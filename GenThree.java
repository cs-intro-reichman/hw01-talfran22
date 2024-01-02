/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
		int i = 0;
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int range = max - min;
		int num1 = (int)(Math.random() * range) + min;
		int num2 = (int)(Math.random() * range) + min;
		int num3 = (int)(Math.random() * range) + min;
		// #Feedback 1: give meaningfult names to variables
		// #Feedback 2: you can use the same variable twice, since anyway you need only the min of all 3 nums.
		int minOfAll = Math.min(num1, num2);
		minOfAll = Math.min(minOfAll, num3);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("The minimal generated number was " + minOfAll);
	}
}
