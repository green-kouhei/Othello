package o_kinou;

import java.util.ArrayList;

class everse {
	public int[][] reverse(int[][] s) {

		return s;
	}

}

public class Reverse {
	ArrayList<Integer> ay = new ArrayList<Integer>();
	ArrayList<Integer> ax = new ArrayList<Integer>();

	public int[][] reverse(int[][] z) {

		int flag = 0, p1 = 0, p2 = 0;

		switch (z[Set.gy][Set.gx]) {// 置いた駒は何色？

		case (1):// 置いた駒が１（白）の場合
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (Set.gy == 0 && c1 == -1 || Set.gy == 7 && c1 == 1 || Set.gx == 0 && c2 == -1
							|| Set.gx == 7 && c2 == 1) {
						continue;
					}
					p1 = Set.gy + c1;
					p2 = Set.gx + c2;

					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;

							case (1):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {

										z[ay.get(i)][ax.get(i)] = 1;
									}

								}
								break;
							case (2):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;
								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
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
			for (int c1 = -1; c1 <= 1; c1++) {
				for (int c2 = -1; c2 <= 1; c2++) {// セットされた駒の周りを見る
					if (Set.gy == 0 && c1 == -1 || Set.gy == 7 && c1 == 1 || Set.gx == 0 && c2 == -1
							|| Set.gx == 7 && c2 == 1) {
						continue;
					}
					p1 = Set.gy + c1;
					p2 = Set.gx + c2;

					check: for (int t = 0;; t++) {
						try {
							switch (z[p1][p2]) {
							case (0):
								break;

							case (2):
								if (flag == 1) {
									// ひっくり返す処理
									for (int i = 0; i < ay.size(); i++) {

										z[ay.get(i)][ax.get(i)] = 2;
									}

								}
								break;
							case (1):
								ay.add(t, p1);
								ax.add(t, p2);
								flag = 1;

								// さらに横確認
								p1 += c1;
								p2 += c2;
								continue check;
							}
						} catch (java.lang.ArrayIndexOutOfBoundsException e) {
							break;
						}

						break;
					}
					flag = 0;
					ay.clear();
					ax.clear();

				}
			}
			break;
		}

		// ターンエンド！
		System.out.println("ターンエンド！");
		return z;
	}

}
