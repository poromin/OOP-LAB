package EquationSolver;

import java.util.Scanner;

public class SystemOf1stDegreeEquation {
	
	public static void main (String[] args) {
		
		System.out.println("ax1 + bx2 = c\ndx1 + ex2 = f");
		System.out.println("Enter a, b, c, d, e, f:");
		
		 Scanner scan = new Scanner(System.in);
		 
		 double a = scan.nextDouble();
		 double b = scan.nextDouble();
		 double c = scan.nextDouble();
		 double d = scan.nextDouble();
		 double e = scan.nextDouble();
		 double f = scan.nextDouble();
		 
		 scan.close();
		 
		 if (a/d == b/e && b/e == c/f) {
			 System.out.println("Equation has an infinite set of solutions!");
			 return;
		 }
		 try {
			 double x1 = (c*e - b*f)/(a*e - b*d);
			 System.out.printf("x1 = %f%n", x1);
			 double x2 = (a*f - d*c)/(a*e - d*b);
			 System.out.printf("x2 = %f%n", x2);
		 }
		 catch (Exception error) {
			 System.out.println("No solution!");
			 return;
		 }

	}
}