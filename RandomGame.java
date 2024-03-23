package df;

import java.awt.Dimension;

import javax.swing.JFrame;

public class RandomGame {
	
	JFrame frame = new JFrame();
	
	CPanel panel;
	
	public RandomGame() {
		panel = new CPanel();
	}
	
	public static void main(String[] stringArrayForNoReasonPleaseIgnoreThankYouSoMuch) {
		
		RandomGame rg = new RandomGame();
		
		rg.init();
		
	}
	
	public void init() {
		
		frame.add(panel);
		panel.setPreferredSize(new Dimension(1000,1000));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
	}
}
