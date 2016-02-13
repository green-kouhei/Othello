package o_kinou;

import java.util.Scanner;

public class Set {
	public static int gx;
	public static int gy;
	public int[][] set(int[][] s,int collar){
		Scanner sin = new Scanner(System.in);
		Change g = new Change();
		for(;;){
			System.out.println("置く場所を指定してください");
			System.out.println("0～7までとa～h");
			int y = sin.nextInt();
			if(y < 0 || y > 7){
				System.out.println("範囲外です");
				continue;
			}
			String s1 = sin.next();
			int x = g.change(s1);
			if(x < 0 || x > 7){
				System.out.println("範囲外です");
				continue;
			}
			if(s[y][x] == 3){
				s[y][x] = collar;
				gx = x;
				gy = y;
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

class Change{
	int change(String v){
		switch(v){
		case "a":
			return 1;
		case "b":
			return 2;
		case "c":
			return 3;
		case "d":
			return 4;
		case "e":
			return 5;
		case "f":
			return 6;
		case "g":
			return 7;
		case "h":
			return 8;
		default:
			return 0;
		}
	}

}
