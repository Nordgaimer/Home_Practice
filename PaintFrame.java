import javax.swing.JFrame;


public class PaintFrame extends JFrame 
{
	public PaintFrame()
	{
		super("New Painter App");
		setBounds(200, 150, 500, 300);
		setContentPane( new PaintPanel() );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}	