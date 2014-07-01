import java.awt.Dimension;
import javax.swing.JFrame;

public class MyJFrame extends JFrame
{
	public MyJFrame(String title,int width, int heigth) 
	{
		super.setLayout(null);
		super.setTitle(title);
		super.setSize(width,heigth);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLocationRelativeTo(null);
		super.setMinimumSize(new Dimension(300,300));
	}
}