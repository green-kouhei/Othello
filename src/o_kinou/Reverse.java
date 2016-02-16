package o_kinou;

public class Reverse {
	public int[][] reverse(int[][] s) {

		return s;
	}

}

class To_reverse {

	public static int reverse(int[][] z) {

		// // 白ターンと仮定
		// int t = 0;
		// // 置いた場所セット
		// t = z[Set.gy][Set.gx];
		// Hanteiメゾットちょっと変えたやつ(全部のマス見なくていいため)動かす

		switch (z[Set.gy][Set.gx]) {

		case (1):// 置いた駒が１（白）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {
					switch (z[c1][c2]) {
					case (0):
						break;
					case (1):
						continue;
					case (2):
						// ひっくり返す処理
						break;
					case (3):
						break;
					}
				}
			}
			break;

		case (2):// 置いた駒が2（黒）の場合
			break;
		}
		// ターンエンド！

		return 0;
	}

}
