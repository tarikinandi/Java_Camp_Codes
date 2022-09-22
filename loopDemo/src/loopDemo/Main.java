package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		System.out.println("For loop started!");
		for(int i = 2 ; i < 75 ; i += 3) {
			System.out.println(i);
		}
		System.out.println("For loop ended!\n");
		
		//while
		System.out.println("While loop started!");
		int i = 0;
		
		while(i < 12) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop ended!\n");
		
		//do while
		System.out.println("Do-While loop started!");
		int j = 75;
		do {
			System.out.println(j);
			j--;
		} while (j > 15);
		System.out.println("Do-While loop ended\n");
	}

}
