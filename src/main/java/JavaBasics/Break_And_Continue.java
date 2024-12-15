package JavaBasics;

public class Break_And_Continue {
	public static void main(String[] args) {
		// Break and continue using loops
		
		
		// BREAK
		//1. With for loop
		for(int i=0;i<5;i++) {
			System.out.print(i);
			System.out.println(" Java is great");
			if(i==2) {
				System.out.println("Ending the loop");
				break;
			}
		}
		
		//2. With While Loop
		int i1 = 0;
		while(i1<5) {
			System.out.print(i1);
			System.out.println(" Java is great");
			if(i1==2) {
				System.out.println("Ending the loop");
				break;
			}
			i1++;
		}
		System.out.println("Loop Ends here");
		
		//CONTINUE
		for(int i3=0;i3<5;i3++) {
			if(i3==2) {
				System.out.println("Skipping " + i3);
				continue;
			}
			System.out.print(i3);
			System.out.println(" Java is great");
		}
	}

}
