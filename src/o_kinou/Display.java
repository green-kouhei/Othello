package o_kinou;

public class Display {
	public static String BLACK = "● ", WHITE = "○ ", Put = "◎ ", emptiness = "□ ";
	public static String[] NumberM = { "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 " };
	public static String[] NumberE = { "△ ", " a ", " b ", " c ", " d ", " e ", " f ", " g ", " h " };

	public void display(int[][] s)// 全体表示
	{

		for (int i = 0; i < 9; i++) {
			System.out.print(NumberE[i]);
		}
		System.out.println();
		for (int a = 0; a < 8; a++) {
			for (int b = 0; b < 8; b++) {
				System.out.print(" ");
				if (b == 0) {
					System.out.print(NumberM[a]);
					System.out.print(" ");
				}
				switch (s[a][b]) {
				case (0):
					System.out.print(emptiness);
					break;
				case (1):
					System.out.print(WHITE);
					break;
				case (2):
					System.out.print(BLACK);
					break;
				case (3):
					System.out.print(Put);
					break;
				}

			}
			System.out.println("");
		}
		System.out.println("");

	}
}
