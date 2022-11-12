import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int x = 2;
        int y = 10;
        int dizi[][];
        dizi = new int[x][y];
        System.out.println("Dizinin sayilarini giriniz : ");
        for (int i = 0 ; i < x ; i++){
            for (int j = 0 ; j < y ; j++){
                System.out.println(i+","+j +" Degeriniz giriniz : ");
                int val = key.nextInt();
                dizi[i][j] = val;
                System.out.println("\n");
            }
            System.out.println();
        }


        for (int a = 0 ; a < x ; a++){
            for (int b= 0 ; b < y ; b++){
                System.out.print(dizi[a][b]+"\t");
            }
            System.out.println("\n");
        }
    }
}