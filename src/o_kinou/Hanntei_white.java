package o_kinou;

public class Hanntei_white {
	public int[][] henkan(int[][] s){
		for(int x = 0;x<8;x++){
			for(int y = 0;y < 8;y++){
				switch (s[x][y]) {
				case (1):
					loop1:
					for(int a = -1;a<=1;a++){
						for(int b = -1;b<=1;b++){
							if(s[x+a][y+b] == 2){
							x = x+a; y = y+b;
								for(;;){
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
