package o_kinou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Set {
	// public void re(){
	// //int Y = 0, X = 0;//To_reverse用変数
	// }

	public int[][] set(int[][] s, int collar) {
		int gx = 0, gy = 0;// To_reverse用変数
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SuffixCorrection sc = new SuffixCorrection();
		for (;;) {
			System.out.println("置く場所を指定してください");
			System.out.println("Y軸１～８");
			int y = 0;
			try{
				String buf = br.readLine();
				y = Integer.parseInt(buf);
			} catch (IOException e) {
				e.printStackTrace();
			}catch( java.lang.NumberFormatException e1){
				System.out.println("使用できない文字です");
				continue;
			}
			y = sc.SC(y);
			if (y < 0 || y > 7) {
				System.out.println("範囲外です");
				continue;
			}
			System.out.println("X軸a～h");
			String Suffix = null;
			try{
				Suffix = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}catch( java.lang.NumberFormatException e1){
				System.out.println("使用できない文字です");
				continue;
			}
			int x = sc.SC(Suffix);
			if (x < 0 || x > 7) {
				System.out.println("範囲外です");
				continue;
			}
			if (s[y][x] == 3) {
				s[y][x] = collar;
				gx = x;
				gy = y;
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

class SuffixCorrection{
	public int SC(int i){
		return --i;
	}
	public int SC(String s){
		switch(s){
		case "a":
			return 0;
		case "b":
			return 1;
		case "c":
			return 2;
		case "d":
			return 3;
		case "e":
			return 4;
		case "f":
			return 5;
		case "g":
			return 6;
		case "h":
			return 7;
			default:
				return -1;
		}
	}
}
