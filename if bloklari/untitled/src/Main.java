import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter a number :");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println("Entered number : " + number);

        if (number < 20){
            System.out.println("Number is small than 20");
        } else if (number > 20) {
            System.out.println("Number is big than 20");
        }
        else{
            System.out.println("Number is 20");
        }
    }
}