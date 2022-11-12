import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter a number1 : ");
        int number1 = keyboard.nextInt();
        System.out.println("Please, enter a number2 : ");
        int number2 = keyboard.nextInt();
        System.out.println("Please, enter a number3 : ");
        int number3 = keyboard.nextInt();

       int bigNumber = number3;

        if(bigNumber < number2 ){
            bigNumber = number2;
        }
        else if(bigNumber < number1){
            bigNumber = number1;
        }
        else {
            bigNumber = number3;
        }

        System.out.println("Big number is : " + bigNumber);
    }
}