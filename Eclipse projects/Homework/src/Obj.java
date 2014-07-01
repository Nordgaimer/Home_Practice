import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Obj 
{
	public static void table_Obj() 
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("                                             Object()  и его Методы:                                                ");
		JLabel label2 = new JLabel("protected Object clone() - Создает и возвращает копию этого объекта                                 ");
		JLabel label3 = new JLabel("protected void finalize() - Вызывается сборщиком мусора когда нет больше ссылок на объект              ");
		JLabel label4 = new JLabel("Class getClass() - Возвращает класс во время выполнения                                                ");
		JLabel label5 = new JLabel("int hashCode() - Возвращает hash код для объекта                                  			         ");
		JLabel label6 = new JLabel("void notify() - Возобновляет единичный поток, который ожидает на объектном мониторе                 ");
		JLabel label7 = new JLabel("void	notifyAll() - Возобновляет все потоки, которые ожидают на объектном мониторе                ");
		JLabel label8 = new JLabel("String toString() - Возвращает строковое представление объекта						                 ");
		JLabel label9 = new JLabel("void	wait() - Остановка текущего потока пока другой поток не вызовет notify() или notifyAll метод для этого объекта");
		JLabel label10 = new JLabel("void wait(long timeout) - Остановка текущего потока на время или пока другой поток не вызовет notify() или notifyAll метод для этого объекта");
		JLabel label11 = new JLabel("void	wait(long timeout, int nanos) - Остановка текущего потока на время или пока другой поток не вызовет notify() или notifyAll метод для этого объекта");
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
		frame.setTitle("Информация о Object");
		frame.setBounds(100, 100, 900, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
