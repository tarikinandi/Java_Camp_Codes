package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A': 
			System.out.println("Perfect you passed");
			break;
		case 'B':
			System.out.println("Very good you passed");
			break;
		case 'C':
			System.out.println("Good you passed");
			break;
		case 'D':
			System.out.println("Conditional. Whether you pass or not will appear after all your grades.");
			break;
		case 'F':
			System.out.println("You failed the lesson");
			break;
		default:
			System.out.println("You entered an invalid grade.");
			
		}
	}

}
