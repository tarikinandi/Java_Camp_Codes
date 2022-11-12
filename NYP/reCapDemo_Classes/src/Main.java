public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem1 = new DortIslem();
       int sonuc1 = dortIslem1.Toplama(10 , 16);
       int sonuc2 = dortIslem1.Cikarma(24 , 52);
       int sonuc3 = dortIslem1.Carpma(5 ,7);
       double sonuc4 = dortIslem1.Bolme( 134 , 533);

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }

}