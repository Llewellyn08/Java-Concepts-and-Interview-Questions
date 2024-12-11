package JavaBasics;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of natural numbers required");
		int n = sc.nextInt();
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while (i <= n);
		sc.close();
	}
}
