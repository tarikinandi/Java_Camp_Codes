import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int number = key.nextInt();
        int sayac = 0;

        for (int i = 2 ; i < number ; i++){
            if (number % i == 0)
            {
                sayac++;
            }

            }
        if (number==1){
            System.out.println("1 Asal sayi degildir!");
        }
        else if (sayac == 0){
            System.out.println(number+" Asal bir sayidir!");
        }

        else {
            System.out.println(number+" Asal sayi degildir!");
        }



    }
}