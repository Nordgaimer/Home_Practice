import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Panel_3 extends JPanel implements MouseListener, MouseMotionListener
{
	public Panel_3()
	{
		
		setSize(800, 600);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		addMouseListener(this);
		addMouseMotionListener(this);
			
	}

	
	private int x = 0;
	private int y = 0;

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics2D g = (Graphics2D) this.getGraphics();
		g.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();	
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();	
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}