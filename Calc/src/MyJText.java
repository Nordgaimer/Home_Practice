import java.awt.Dimension;
import javax.swing.JTextField;

public class MyJText extends JTextField
{
	public MyJText(int columns,int width, int height) 
	{
		super.setColumns(columns);
		super.setSize(width, height);
		setEditable(false);
		setFocusable(false);
		
	}
}
