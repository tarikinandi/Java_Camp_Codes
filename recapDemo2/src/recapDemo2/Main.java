package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {1.2 , 4.5 , 32.21 , 41.421 , 12.5322321 , 1.8};
		double total = 0;
		double max = myList[0];
		
		for(double number : myList) {
		
			if(number > max) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Sum = " +total);
		System.out.println("Largest number = " + max);
		
	}

}
