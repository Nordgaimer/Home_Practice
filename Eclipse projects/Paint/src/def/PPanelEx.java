package def;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PPanelEx extends JPanel implements MouseListener, MouseMotionListener
{
	private int x = 0;
	private int y = 0;

	Color cc = Color.red;


	public PPanelEx()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setLayout(null);
		JButton bcolor = new JButton("Choose Color");
		bcolor.setBounds(10, 10, 120, 20);
		add(bcolor);
		bcolor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				cc = JColorChooser.showDialog(PPanelEx.this, "Color Choose", cc);
			}
		});
		JButton openButton = new JButton("Open");
		openButton.setBounds(50, 50, 120, 20);
		add(openButton);
		final JFileChooser fc = new JFileChooser();
		openButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal = fc.showOpenDialog(PPanelEx.this);
			}});


		JButton saveButton = new JButton("Save");
		saveButton.setBounds(90	, 90, 120, 20);
		add(saveButton);
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int returnVal = fc.showSaveDialog(PPanelEx.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = fc.getSelectedFile();
	                //This is where a real application would save the file.
	                log.append("Saving: " + file.getName() + "." + newline);
	            }
			}});
	}



	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();	
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		Graphics2D g = (Graphics2D) this.getGraphics();
		g.setColor(cc);
		g.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();	
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
}
