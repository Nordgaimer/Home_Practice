import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;




public class PaintMain 
{
	public static void main(String[] args) 
	{
		PaintFrame frame = new PaintFrame("Paint");
		frame.setLayout(new BoxLa());
	 
		
		Panel_1 panel_file = new Panel_1();
		Panel_2 panel_toolbar = new Panel_2();
		Panel_3 panel_paint = new Panel_3();
		Panel_4 panel_status = new Panel_4();
		
	
		JLabel label = new JLabel("Status info");
		
		
		frame.add(panel_file);
		panel_file.setLayout(panel_file,BorderLayout.CENTER);
		frame.add(panel_toolbar);
		frame.add(panel_paint);
		frame.add(panel_status);
	}
}
