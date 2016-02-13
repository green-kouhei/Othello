package o_kinou;

import java.util.Scanner;

public class Set {
	public int[][] set(int[][] s,int collar){
		Scanner sin = new Scanner(System.in);
		for(;;){
			System.out.println("置く場所を指定してください");
			int y = sin.nextInt();
			int x = sin.nextInt();
			if(s[y][x] == 3){
				s[y][x] = collar;
				break;
			}
			else{
				System.out.println("ここには置けません");
			}
		}
		for(int y = 0;y<8;y++){
			for(int x = 0;x < 8;x++){
				if(s[y][x] == 3){
					s[y][x] = 0;
				}
			}
		}
		return s;
	}
}
