package EquationSolver;

import java.util.Scanner;

public class SecondDegreeEquationOneVariable {
	
	public static void main(String[] args) {
		
		System.out.println("ax^2 + bx + c = 0\nEnter a, b, c: (a#0)");
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		scan.close();
		
		if (a==0) {
			System.out.println("a = 0, enter again!");
			return;
		}
		double delta = b*b - 4*a*c;
		
		if (delta < 0) {
			System.out.println("No solution!");
		}
		else if (delta == 0) {
			double x = -b/(2*a);
			System.out.printf("There is one solution: x = %f%n", x);
		}
		else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.printf("There are two solution:%nx1 = %f%nx2 = %f%n", x1, x2);
		}
	}

}
