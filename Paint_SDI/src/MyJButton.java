import java.awt.Color;

import javax.swing.JButton;


public class MyJButton extends JButton
{
	public MyJButton(int x, int y,int width, int height,String text) 
	{
		setBounds(x, y, width, height);
		setText(text);
		setBackground(new Color(9664));
		setVisible(true);
		
	}
}
