package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] citys = new String[3][3];

		citys[0][0] = "Ýstanbul";
		citys[0][1] = "Kocaeli";
		citys[0][2] = "Bursa";
		citys[1][0] = "Ýzmir";
		citys[1][1] = "Aydýn";
		citys[1][2] = "Manisa";
		citys[2][0] = "Adýyaman";
		citys[2][1] = "Gaziantep";
		citys[2][2] = "Þanlýurfa";

		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------------------------------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(citys[i][j]);
			}
		}

	}

}
