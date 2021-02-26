import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MausPanel extends JPanel implements MouseListener,MouseMotionListener{
	
	Random rand = new Random();
	Crosshair c = new Crosshair();
	
	private int x,
				y;
	
	public MausPanel() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g) {
		
			for(int i = 0; i<5;i++) {
				
				double mrx = Math.random() * 500;
				double mry = Math.random() * 500;
				x = (int)mrx;
				y = (int)mry;
				
				g.fillRect(x, y, 30, 30);	

				}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// Maus folgen sobald sie im Fenster ist.
		x = e.getX();
		y = e.getY();
		c.setCrossX(x);
		c.setCrossY(y);
		repaint();
		System.out.println(x + " " + y);
	}
	
}


public class Ballon extends JFrame{

	public Ballon(String titel) {
		super(titel);
		setBounds(400,400,400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MausPanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ballon("Ballons schießen");
	}

}
