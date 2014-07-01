import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Main
{
	public static String temp = "";
	public static String input;
	public static int a=-1;
	public static int b=-1;
	public static char op;

	public static void main(String[] args) 
	{
	MyJButton button1 = new MyJButton("1",50,50);
	MyJButton button2 = new MyJButton("2",50,50);
	MyJButton button3 = new MyJButton("3",50,50);
	MyJButton button4 = new MyJButton("4",50,50);
	MyJButton button5 = new MyJButton("5",50,50);
	MyJButton button6 = new MyJButton("6",50,50);
	MyJButton button7 = new MyJButton("7",50,50);
	MyJButton button8 = new MyJButton("8",50,50);
	MyJButton button9 = new MyJButton("9",50,50);
	MyJButton button0 = new MyJButton("0",50,50);
	MyJButton button_plus = new MyJButton("+",50,50);
	MyJButton button_minus = new MyJButton("-",50,50);
	MyJButton button_multiply = new MyJButton("*",50,50);
	MyJButton button_divide = new MyJButton("/",50,50);
	MyJButton button_result = new MyJButton("=",50,50);
	MyJButton button_refresh = new MyJButton("C",50,50);
	MyJFrame frame = new MyJFrame("Calc",300,300);
	MyJPanel panel1 = new MyJPanel(10,10,200,50);
	MyJPanel panel2 = new MyJPanel(10,70,150,300);
	MyJPanel panel3 = new MyJPanel(210,70,50,300);
	final MyJText display = new MyJText(15,100,50);

	frame.add(panel1);
	frame.add(panel2);
	frame.add(panel3);

	panel1.add(display);
	panel2.add(button1);
	panel2.add(button2);
	panel2.add(button3);
	panel2.add(button4);
	panel2.add(button5);
	panel2.add(button6);
	panel2.add(button7);
	panel2.add(button8);
	panel2.add(button9);
	panel2.add(button0);
	panel3.add(button_plus);
	panel3.add(button_minus);
	panel3.add(button_multiply);
	panel3.add(button_divide);
	panel3.add(button_result);
	panel3.add(button_refresh);

	ActionListener action = new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			temp=e.getActionCommand();		
			display.setText(temp);
			input=temp;

			if (a==-1)
			{
				a=Integer.parseInt(input);
			}
			else
			{
				b=Integer.parseInt(input);
			}
		}	
	};

	button1.addActionListener(action);
	button2.addActionListener(action);
	button3.addActionListener(action);
	button4.addActionListener(action);
	button5.addActionListener(action);
	button6.addActionListener(action);
	button7.addActionListener(action);
	button8.addActionListener(action);
	button9.addActionListener(action);
	button0.addActionListener(action);

	ActionListener command = new ActionListener()
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			temp=e.getActionCommand();			
			switch (temp) 
			{
			case "+": op='+';
			break;
			case "-": op='-';
			break;
			case "/": op='/';
			break;
			case "*": op='*';
			break;
			}
		}	
	};
	button_plus.addActionListener(command);
	button_minus.addActionListener(command);
	button_divide.addActionListener(command);
	button_multiply.addActionListener(command);
	button_result.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()instanceof JButton)
			{

				String result=String.valueOf(Math.calc(a, b, op));
				display.setText(result);
				a=-1;
				b=-1;
				temp="";
			}
		}
	});

	button_refresh.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()instanceof JButton)
			{
				a=-1;
				b=-1;
				temp="";
				display.setText("");
			}


		}
	});
}


}



