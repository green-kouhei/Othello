package o_kinou;

public class Hantei {
	public int[][] hantei(int[][] s){
//		配列の中身を確認するループ
		for(int x = 0;x<8;x++){
			for(int y = 0;y < 8;y++){

//				s[x][y]の中身が黒か白か空白かの判定
				switch (s[x][y]) {
				case (1):

//					駒の周りを確認するループ
					for(int a = -1;a<=1;a++){
						for(int b = -1;b<=1;b++){

//							もし周りに黒があったらどこまで続いているか調べる
							if(s[x+a][y+b] == 2){
								int x2 = x+a; int y2 = y+b;
								loop:
								for(;;){
									if(x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7)       //ここで外枠の判定
										break;
									if(s[x2+a][y2+b] == 2){                        //もし黒ならさらに次のもすを調べる
										x2 += a; y2 += b;
									continue loop;
									}
									else if(s[x2+a][y2+b] == 1){                   //もし白なら隣のマスに判定を移動
										break;
									}
									else if(s[x2+a][y2+b] == 0){                   //もし空白なら印をつける
										s[x2+a][y2+b] = 3;
										break;
									}
									break;
								}
							}
						}

					}
					break;

				case (2):
					for(int a = -1;a<=1;a++){
						for(int b = -1;b<=1;b++){
							if(s[x+a][y+b] == 1){
								int x2 = x+a; int y2 = y+b;
								loop:
								for(;;){
									if(x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7)
										break;
									if(s[x2+a][y2+b] == 1){
										x2 += a; y2 += b;
									continue loop;
									}
									else if(s[x2+a][y2+b] == 2){
										break;
									}
									else if(s[x2+a][y2+b] == 0){
										s[x2+a][y2+b] = 3;
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
		return s;
	}
}
