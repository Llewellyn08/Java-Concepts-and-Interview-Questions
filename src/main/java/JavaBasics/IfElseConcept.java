package JavaBasics;

import java.util.Scanner;

public class IfElseConcept {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greater than b");
		}
		
		int c = 40;
		int d = 50;
		
		if (c==d) {
			System.out.println("c and d are equal");
		}else {
			System.out.println("c and d are not equal");
		}
		
		// Write a logic to find out the highest number
		
		int a1=400;
		int b1=500;
		int c1=300;
		
		//nested if else
		if (a1>b1 & a1>c1) { 
			System.out.println("a1 is the greatest");
		}else if (b1>c1) {
			System.out.println("b1 is the greatest");
		}else {
			System.out.println("c1 is the greatest");
		}
		
		// Else if concept
		int age;
		System.out.print("Enter your age: ");
		Scanner scanner = new Scanner(System.in);
		age = scanner.nextInt();
		/*
		 * if (age>56) { System.out.println("You are experienced"); }else if (age>46) {
		 * System.out.println("You are semi experienced"); }else if (age>36) {
		 * System.out.println("You are semi semi experienced"); }else {
		 * System.out.println("You are not experienced"); }
		 */
		
		
		// Switch Case Control
		switch(age) {
			case 18:
				System.out.println("You are going to be an adult");
				break;
			case 28:
				System.out.println("You are going to join a job");
				break;
			case 60:
				System.out.println("You are going to get retired");
				break;
			default:
				System.out.println("Enjoy your life");
		}
	}

}
