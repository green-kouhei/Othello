package o_frame;

import javax.swing.*;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class GridBagLayoutTest1 extends JFrame {

	public static void main(String[] args) {

		GridBagLayoutTest1 frame = new GridBagLayoutTest1();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 閉じたら終了
		frame.setBounds(1000, 10, 300, 200);// （表示する座標_横、表示する座標_縦、ウィンドウ大きさ_横、ウィンドウ大きさ_縦）
		frame.setTitle("タイトル");// タイトル
		frame.setVisible(true);// 可視or不可視
	}

	GridBagLayoutTest1() {
		GridBagLayout layout = new GridBagLayout();
		JPanel p = new JPanel();
		p.setLayout(layout);

		GridBagConstraints gbc = new GridBagConstraints();

		JButton button1 = new JButton("Google");//ここから１

		gbc.gridx = 0;
		gbc.gridy = 0;
		layout.setConstraints(button1, gbc);//ここまで１

		JButton button2 = new JButton("Yahoo!");//ここから２
		button2.setFont(new Font("Arial", Font.BOLD, 30));//文字設定(,フォント,大きさ)

		gbc.gridx = 1;
		gbc.gridy = 0;
		layout.setConstraints(button2, gbc);//ここまで２

		JButton button3 = new JButton("MSN");//ここから３

		gbc.gridx = 0;
		gbc.gridy = 1;
		layout.setConstraints(button3, gbc);//ここまで３

		//ボタン数
		p.add(button1);
		p.add(button2);
		p.add(button3);

		getContentPane().add(p, BorderLayout.CENTER);
	}
}