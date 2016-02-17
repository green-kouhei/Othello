package o_kinou;

import java.util.ArrayList;

public class Reverse {
	public int[][] reverse(int[][] s) {

		return s;
	}

}

class To_reverse {

	public static int[][] reverse(int[][] z) {

		/*
		 * 白ターンと仮定 int t = 0; 置いた場所セット t = z[Set.gy][Set.gx];
		 * Hanteiメゾットちょっと変えたやつ(全部のマス見なくていいため)動かす
		 */

		ArrayList<Integer> ay, ax;
		ay = new ArrayList<Integer>();
		ax = new ArrayList<Integer>();
		int flag = 0, count = 0;

		switch (z[Set.gy][Set.gx]) {// 置いた駒は何色？

		case (1):// 置いた駒が１（白）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る

				check:
					for(;;){
						switch (z[c1][c2]) {
						case (0):
							break;
						case (3):
							break;
						case (1):
							if (flag == 1) {
								// ひっくり返す処理
								for(int i =0;i<=ay.size();i++){
									z[ay.get(i)][ax.get(i)]=1;
								}
								z[c1][c2]=1;
							}
							break;
						case (2):
							ay.add(Set.gy);
							ax.add(Set.gx);
							flag = 1;
							count += 1;
							//さらに横確認
							//🈁
							continue check;
						}

						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();
				}
			}
			break;

		case (2):// 置いた駒が2（黒）の場合
			break;
		}

		// ターンエンド！

		return z;
	}

}
