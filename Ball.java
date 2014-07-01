import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Ball extends JPanel 
{

	int dx = 3;
	int dy = 5;
	public Ball(int x, int y)
	{
		setBounds(x-15, y-15, 30, 30);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		Graphics2D gr = (Graphics2D) g;
		gr.drawOval(1, 1, 28, 28);
	}
	public void Move()
	{
		JPanel p = (JPanel)getParent();
		int w = p.getWidth();
		int h = p.getHeight();
		int x = getX();
		int y = getY();
		if(x <= 0 || x > w)
			dx = -dx;
		if(y <= 0 || y > h)
			dy = -dy;
		this.setLocation(x+dx, y+dy);
	}
}
