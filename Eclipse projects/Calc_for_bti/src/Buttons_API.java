import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Nordman |  Date: 23.02.14 | Time: 12:56
 */
public class Buttons_API implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
       // JTextField txt = (JTextField) e.getSource();

        if (btn.getActionCommand().equals("Импорт в строку")) {
            System.out.println("Import");

        }
        if (btn.getActionCommand().equals("ОТВЕТ =")) {
            System.out.println(GUI.textField_input.getText());

        }


    }


}

