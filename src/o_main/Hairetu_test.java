package o_main;

public class Hairetu_test {

	public static void main(String[] args) {
		// 初期設定
		String[][] Othello = new String[8][8];
		int[][] O_processing = new int[8][8];
		String BLACK = "●", WHITE = "○", Put = "*", emptiness = "・";
		int black = 2, white = 2, mass = 60;

		// 初期設定ー空マス設定
		for (int a = 0; a < 8; a++) {
			for (int b = 0; b < 8; b++) {
				Othello[a][b] = emptiness;
			}
		}

		// 初期設定ー初期配置
		Othello[3][3] = BLACK;
		Othello[4][4] = BLACK;
		Othello[3][4] = WHITE;
		Othello[4][3] = WHITE;

		// 全体表示
		for (int a = 0; a < 8; a++) {
			for (int b = 0; b < 8; b++) {
				System.out.print(Othello[a][b]);
			}
			System.out.println("");
		}
		
	}
}