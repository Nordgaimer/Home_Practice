package def;

import javax.swing.JFrame;


public class PaintFrame extends JFrame 
{
	public PaintFrame()
	{
		setBounds(300, 200, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add( new PPanelEx() );
		setVisible(true);
	}
}
