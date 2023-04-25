package EquationSolver;

import java.util.Scanner;

public class FirstDegreeEquation {
	
	public static void main(String[] args) {
		
		System.out.println("ax + b = 0 \nEnter a, b:");
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		scan.close();
		
		if (a!=0) {
			System.out.printf("There is one solution: x = %f", b/a);		
		}
		else {
			System.out.println("There is no solution!");
		}
	}
	

}
