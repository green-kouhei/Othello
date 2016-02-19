package o_kinou;

import o_main.Hairetu_test;

public class Hantei {
	public int[][] hantei(int[][] s, int collar) {
		int count = 0;
		// 配列の中身を確認するループ
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (s[y][x] != collar) {
					continue;
				}

				// s[x][y]の中身が黒か白か空白かの判定
				switch (s[y][x]) {
				case (1):

					// 駒の周りを確認するループ
					for (int a = -1; a <= 1; a++) {
						for (int b = -1; b <= 1; b++) {

							// もし周りに黒があったらどこまで続いているか調べる
							if (y == 0 && a == -1 || y == 7 && a == 1 || x == 0 && b == -1 || x == 7 && b == 1) {
								continue;
							}
							if (s[y + a][x + b] == 2) {
								int y2 = y + a;
								int x2 = x + b;
								loop: for (;;) {
									if (x2 + b < 0 || x2 + b > 7 || y2 + a < 0 || y2 + a > 7) { // ここで外枠の判定
										break;
									}
									if (s[y2 + a][x2 + b] == 2) { // もし黒ならさらに次のもすを調べる
										y2 += a;
										x2 += b;
										continue loop;
									} else if (s[y2 + a][x2 + b] == 1) { // もし白なら隣のマスに判定を移動
										break;
									} else if (s[y2 + a][x2 + b] == 0) { // もし空白なら印をつける
										s[y2 + a][x2 + b] = 3;
										count++;
										break;
									}
									break;
								}
							}
						}
					}
					break;

				case (2):
					for (int a = -1; a <= 1; a++) {
						for (int b = -1; b <= 1; b++) {
							if (y == 0 && a == -1 || y == 7 && a == 1 || x == 0 && b == -1 || x == 7 && b == 1) {
								continue;
							}
							if (s[y + a][x + b] == 1) {
								int y2 = y + a;
								int x2 = x + b;
								loop: for (;;) {
									if (x2 + b < 0 || x2 + b > 7 || y2 + a < 0 || y2 + a > 7) {
										break;
									}
									if (s[y2 + a][x2 + b] == 1) {
										y2 += a;
										x2 += b;
										continue loop;
									} else if (s[y2 + a][x2 + b] == 2) {
										break;
									} else if (s[y2 + a][x2 + b] == 0) {
										s[y2 + a][x2 + b] = 3;
										count++;
										break;
									}
									break;
								}
							}
						}
					}
					break;

				default:
					break;
				}
			}
		}
		if (count == 0) { // もし置ける場所がなかったらpassに１を
			Hairetu_test.pass = 1;
		}
		return s;
	}
}
