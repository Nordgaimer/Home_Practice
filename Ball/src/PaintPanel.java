//package painter;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.Timer;


public class PaintPanel extends JPanel implements MouseListener
{
	public PaintPanel()
	{
		setLayout(null);
	    addMouseListener(this);
	    Timer timer = new Timer(10, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Component[] cc = PaintPanel.this.getComponents();
				for (int i = 0; i < cc.length; i++) 
				{
					Ball b = (Ball) cc[i];
					b.Move();
					repaint();
				}
			}
		});
	    timer.start();
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		add( new Ball(e.getX(), e.getY()) );
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
}




 

