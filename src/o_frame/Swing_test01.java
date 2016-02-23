package o_frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

class OFrame extends JFrame {

	OFrame(String title) {
		setTitle(title);// タイトル
		setSize(200, 160);// フレームサイズ
		setLocationRelativeTo(null);// フレームを中央に持ってくる
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ウィンドウを閉じるとプログラム終了
		// setVisible(true);//フレームが最初非表示の為表示する
		
		//setLayout(new FlowLayout());//よくわからない。複数部品配置に必要？ 記述で自動レイアウト無効になる
		
		JButton bt1 = new JButton("自爆"); //ボタン
		bt1.setPreferredSize(new Dimension(	100, 40));//サイズ

		
		JPanel pn1 = new JPanel();//パネル
		pn1.setPreferredSize(new Dimension(50, 100));
		pn1.setBackground(Color.green);//色
		
		
		add(bt1,BorderLayout.NORTH);//ボタン配置,自動レイアウト.センター
	//	add(pn1);
//		Container contentPane = getContentPane();//昔の書き方
//		contentPane.add(pn1);
	}
}

public class Swing_test01 extends JFrame  {
	public static void main(String[] args) {
		OFrame f = new OFrame("オセロ");
		f.setVisible(true);
		
	}
}