package JavaBasics;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);

		// Print first n odd numbers
		
		 System.out.println("Enter the number of odd numbers required"); 
		 int n = sc.nextInt(); 
		 for(int i=0; i<n; i++) { 
			 System.out.println(2*i+1); 
		 }

		// Print first natural numbers in descending order
		System.out.println("Enter the natural numbers required");
		int n2 = sc.nextInt();
		for (int i = n2; i >= 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}
}
