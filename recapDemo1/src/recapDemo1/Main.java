package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 46;
		int number2 = 234234;
		int number3 = 454353454;
		
		int numberMax;
		
		if(number1 > number2) {
			numberMax = number1;
		}
		else if(number3 > number1) {
			numberMax = number3;
		}
		else {
			numberMax = number2;
		}
		
		System.out.println(numberMax);
	}

}
