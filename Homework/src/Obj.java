import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Obj 
{
	public static void table_Obj() 
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("                                             Object()  � ��� ������:                                                ");
		JLabel label2 = new JLabel("protected Object clone() - ������� � ���������� ����� ����� �������                                 ");
		JLabel label3 = new JLabel("protected void finalize() - ���������� ��������� ������ ����� ��� ������ ������ �� ������              ");
		JLabel label4 = new JLabel("Class getClass() - ���������� ����� �� ����� ����������                                                ");
		JLabel label5 = new JLabel("int hashCode() - ���������� hash ��� ��� �������                                  			         ");
		JLabel label6 = new JLabel("void notify() - ������������ ��������� �����, ������� ������� �� ��������� ��������                 ");
		JLabel label7 = new JLabel("void	notifyAll() - ������������ ��� ������, ������� ������� �� ��������� ��������                ");
		JLabel label8 = new JLabel("String toString() - ���������� ��������� ������������� �������						                 ");
		JLabel label9 = new JLabel("void	wait() - ��������� �������� ������ ���� ������ ����� �� ������� notify() ��� notifyAll ����� ��� ����� �������");
		JLabel label10 = new JLabel("void wait(long timeout) - ��������� �������� ������ �� ����� ��� ���� ������ ����� �� ������� notify() ��� notifyAll ����� ��� ����� �������");
		JLabel label11 = new JLabel("void	wait(long timeout, int nanos) - ��������� �������� ������ �� ����� ��� ���� ������ ����� �� ������� notify() ��� notifyAll ����� ��� ����� �������");
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(label8);
		panel.add(label9);
		panel.add(label10);
		panel.add(label11);
		frame.setTitle("���������� � Object");
		frame.setBounds(100, 100, 900, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
