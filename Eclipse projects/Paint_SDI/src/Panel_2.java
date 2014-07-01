import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_2 extends JPanel
{
	public Panel_2()
	{
		setSize(800, 100);
		setBackground(new Color(0));
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		MyJButton btn_save = new MyJButton(5,5,50,50,"Save");
		MyJButton btn_open = new MyJButton(5,5,50,50,"Open");
		MyJButton btn_color = new MyJButton(5,5,50,50,"Color");
		MyJButton btn_incr_line = new MyJButton(5,5,50,50,"+1");
		MyJButton btn_decr_line = new MyJButton(5,5,50,50,"-1");
		add(btn_save);
		add(btn_open);
		add(btn_color);
		add(btn_incr_line);
		add(btn_decr_line);
	}
}