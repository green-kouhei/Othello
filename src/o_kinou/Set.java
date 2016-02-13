package o_kinou;

import java.util.Scanner;

public class Set {
//	public void re(){
//	//int Y = 0, X = 0;//To_reverse用変数
//	}

	public int[][] set(int[][] s, int collar) {
		int Y = 0, X = 0;//To_reverse用変数
		Scanner sin = new Scanner(System.in);
		for (;;) {
			System.out.println("置く場所を指定してください");
			System.out.println("０～７までと０～７");
			int y = sin.nextInt();
			if (y < 0 || y > 7) {
				System.out.println("範囲外です");
				continue;
			} else {
				Y = y;
			}
			int x = sin.nextInt();
			if (x < 0 || x > 7) {
				System.out.println("範囲外です");
				continue;
			} else {
				X = x;
			}
			if (s[y][x] == 3) {
				s[y][x] = collar;
				break;
			} else {
				System.out.println("ここには置けません");
			}
		}
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (s[y][x] == 3) {
					s[y][x] = 0;
				}
			}
		}
		return s;
	}
}
