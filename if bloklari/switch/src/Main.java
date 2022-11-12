import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        boolean calisma = true;
    while (calisma) {
        int grade;

        char gradeout;
        System.out.println("-----------------İslemler-------------------");
        System.out.println("1   --> Notu girme");
        System.out.println("2   --> Hangi notun hangi harfe denk geldigini hesaplama");
        System.out.println("9   --> Cikis yap");
        System.out.println("Yapmak istediginiz islemi seciniz : ");

        int secim = key.nextInt();

        switch (secim) {
            case 1:

                System.out.println("Enter your grade(0-100) : ");
                grade = key.nextInt();
                System.out.println("Notunuz : " + grade);
                break;
            case 2:
                System.out.println("Enter your grade(0-100) : ");
                grade = key.nextInt();

                if (grade >= 60 && grade <= 80) {
                    gradeout = 'B';
                    System.out.println(gradeout + " Basarili!!");
                } else if (grade >= 40 && grade <= 60) {
                    gradeout = 'C';
                    System.out.println(gradeout + " Gectiniz!!");

                } else if (grade >= 20 && grade <= 40) {
                    gradeout = 'D';
                    System.out.println(gradeout + " Kaldiniz!!");
                } else if (grade >= 0 && grade <= 20) {
                    gradeout = 'E';
                    System.out.println(gradeout + " Basarisiz!!");
                } else {
                    gradeout = 'A';
                    System.out.println(gradeout + " Mukemmel!!");
                }
                break;
            case 9:
                calisma = false;
            default:
                System.out.println("Lutfen gecerli bir islem giriniz!!");
        }
    }
    }
}