import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyJButton extends JButton
{
	public MyJButton(String title,int x,int y)
	{
		super.setText(title);
		setSize(x,y);
	}
}
