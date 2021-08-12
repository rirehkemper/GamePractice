package com.game.main;
import java.awt.Canvas;
import java.awt.Dimension;

//import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Window extends Canvas{

	//tip  cntrl + shift + o automatically imports libraries
	/**
	 * 
	 */
	private static final long serialVersionUID = -1478604005915452565L;

	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension( width, height));
		frame.setMaximumSize(new Dimension( width, height));
		frame.setMinimumSize(new Dimension( width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	//	JFrame jFrame = new JFrame();
	//	new JLabel(new ImageIcon("\"C:\\Users\\owner\\OneDrive\\Desktop\\practice game images\\Playing.png\"));
	//	JImageComponent ic = new JImageComponent(myImageGoesHere);
	//	imagePanel.add(ic);
	}
}
