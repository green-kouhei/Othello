package o_main;

import o_kinou.*;

public class Hairetu_test {
	// 初期設定
//	public static String BLACK = "● ", WHITE = "○ ", Put = "◎ ", emptiness = "□ ";
	public static int black_count = 2, white_count = 2, mass_count = 60, black = 2, white = 1, turn_count = 1, pass = 0;
//	public static String[] NumberM = { "1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 " };
//	public static String[] NumberE = { "△ ", " a ", " b ", " c ", " d ", " e ", " f ", " g ", " h " };

	public static void main(String[] args) {
		//インスタンス化
		Hantei h = new Hantei();
		Set s = new Set();
		Reverse r = new Reverse();
		display d = new display();
		int[][] Othello = new int[8][8];

		// 初期設定ー空マス設定
		for (int a = 0; a < 8; a++) {
			for (int b = 0; b < 8; b++) {
				Othello[a][b] = 0;
			}
		}

		// 初期設定ー初期配置
		Othello[3][4] = black;
		Othello[4][3] = black;
		Othello[3][3] = white;
		Othello[4][4] = white;
		// Othello[4][3] = ;
		d.display(Othello);

		// ゲーム開始
		for (; mass_count != 0;) {
			if (turn_count == 1) {
				turn_count = 2;
			} else {
				turn_count = 1;
			}
			System.out.format("%sのターン",turn_count == black ? "黒" : "白");
			System.out.println();
			Othello = h.hantei(Othello, turn_count);
			d.display(Othello);
			if (pass == 1) {
				pass = 0;
				continue;
			}
			Othello = s.set(Othello, turn_count);
			Othello = r.reverse(Othello);
			d.display(Othello);
			mass_count--;
		}
		System.out.println("ゲーム終了！！");
	}

//	public static void display(int[][] s)// 全体表示
//	{
//		for (int i = 0; i < 9; i++) {
//			System.out.print(NumberE[i]);
//		}
//		System.out.println();
//		for (int a = 0; a < 8; a++) {
//			for (int b = 0; b < 8; b++) {
//				System.out.print(" ");
//				if (b == 0) {
//					System.out.print(NumberM[a]);
//					System.out.print(" ");
//				}
//				switch (s[a][b]) {
//				case (0):
//					System.out.print(emptiness);
//					break;
//				case (1):
//					System.out.print(WHITE);
//					break;
//				case (2):
//					System.out.print(BLACK);
//					break;
//				case (3):
//					System.out.print(Put);
//					break;
//				}
//				// System.out.print(s[a][b]);
//			}
//			System.out.println("");
//		}
//		System.out.println("");
//
//	}
}