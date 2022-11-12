public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
      /*  womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();*/

        GameCalculator[] gameCalculator = new GameCalculator[]{
                new KidsGameCalculator() , new ManGameCalculator(), new WomanGameCalculator()};

        for (GameCalculator gameCalculators : gameCalculator){
            gameCalculators.hesapla();
            gameCalculators.gameOver();
        }
    }
}