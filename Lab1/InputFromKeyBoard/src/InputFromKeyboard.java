import java.util.Scanner;
public class InputFromKeyboard {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String strName = scan.nextLine();
		System.out.println("How old are you?");
		int iAge = scan.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = scan.nextDouble();
		
		scan.close();
		
		System.out.println("You are "+ strName + ", "+ iAge + "years old. Your height is " + dHeight + "m.");
	}

}
