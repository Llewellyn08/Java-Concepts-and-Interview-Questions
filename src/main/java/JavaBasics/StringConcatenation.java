package JavaBasics;

import java.util.function.DoubleToIntFunction;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		//+ sign is concatenation operator
		// println: print on a new line
		// print: to print with no line break
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		
		System.out.println(x+y+c+d);
		
		System.out.println("HelloWorld");
		
		System.out.println("the value of a is: " + a);
		
		System.out.println("the addition of a and b is:" + (a+b));
		
		// ln means line new: to create new line
		System.out.print("Hello Testing");
		System.out.println("Hello Selenium");
		
		
	}

}
