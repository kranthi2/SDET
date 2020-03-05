package practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ScannerConcept {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter 1st Number: ");
		int a= ip.nextInt();
		System.out.println("Enter 2nd Number: ");
		int b= ip.nextInt();
		System.out.println("Sum of two numbers is "+(a+b));
		
		System.out.println("Enter Number:");
		double c=ip.nextDouble();
		System.out.println("Enter Number:");
		double d=ip.nextDouble();
		System.out.println("Sum of two numbers is "+(c+d));
		
		System.out.println("Enter 1st String:");
		String e=ip.next();
		System.out.println("Enter 2nd String:");
		String f=ip.next();
		System.out.println("The String is "+(e+" "+f));
	}

}
