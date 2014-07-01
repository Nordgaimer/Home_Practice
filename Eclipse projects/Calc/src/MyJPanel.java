import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyJPanel extends JPanel 
{
	public MyJPanel( int x, int y,int width, int height)
	{
		super.setLayout(new FlowLayout(FlowLayout.CENTER));
		super.setBounds(x, y, width, height);
	}
}