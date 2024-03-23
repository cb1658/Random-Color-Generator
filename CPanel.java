package df;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

public class CPanel extends JPanel implements ActionListener, KeyListener{

	
	private int a;
	private int b;
	private int c;
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
		a = new Random().nextInt(255);
		b = new Random().nextInt(255);
		c = new Random().nextInt(255);
		
		
		
		
		//draw(getGraphics());
		
		
	}

	public void draw(Graphics g) {
		g.setColor(new Color(a,b,c));
		g.fillRect(0,0,1000,1000);
		
		if((a+b+c)/3 > 150 || (a+b+c)>370) {
			g.setColor(Color.BLACK);
		}
		else {
			g.setColor(Color.WHITE);
		}

		g.drawString("("+a+","+b+","+c+")", 10 , 20);
		g.drawString("Brightness Level:" + (a+b+c)/3, 10, 40);
		
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g){
		draw(g);
	}
	
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
