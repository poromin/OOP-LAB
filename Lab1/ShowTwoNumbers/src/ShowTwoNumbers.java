import java.util.*;
public class ShowTwoNumbers {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		double a = scan.nextDouble();
		System.out.println("Enter second number:");
		double b = scan.nextDouble();
		
		scan.close();
		
		System.out.printf("sum: %f%n", a+b);
		System.out.printf("difference %f%n", Math.abs(a-b));
		System.out.printf("product: %f%n", a*b);
		
		if (b!=0) {
			System.out.printf("quotient: %f%n", a/b);
		}
		else {
			System.out.println("cannot divide by zero");
		}
		
	}

}
