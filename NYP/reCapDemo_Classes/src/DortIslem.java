public class DortIslem {
    public int Toplama(int sayi1 , int sayi2){
        return sayi1 + sayi2;
    }

    public int Cikarma(int sayi1 , int sayi2){
        if (sayi1 > sayi2){
            return sayi1 - sayi2;
        }
        else {
            return sayi2 - sayi1;
        }
    }

    public int Carpma(int sayi1 , int sayi2){
        return sayi1 * sayi2;
    }

    public double Bolme(double sayi1 , double sayi2){
        return sayi1 / sayi2;
    }
}
