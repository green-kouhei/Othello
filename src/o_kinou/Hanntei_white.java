package o_kinou;

public class Hanntei_white {
	public int[][] henkan(int[][] s){
		for(int x = 0;x<8;x++){
			for(int y = 0;y < 8;y++){
				switch (s[x][y]) {
				case (1):
					for(int a = -1;a<=1;a++){
						for(int b = -1;b<=1;b++){
							if(s[x+a][y+b] == 2){
								loop:
								for(;;){
									x = x+a; y = y+b;
									if(s[x+a][y+b] == 2){
									continue loop;
									}
									else if(s[x+a][y+b] == 1){
										break;
									}
									else if(s[x+a][y+b] == 0){
										s[x+a][y+b] = 3;
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
