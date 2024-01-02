public class AddTwo {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		// #Feedback: better to not do calculation in print commands
		int sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}
}
