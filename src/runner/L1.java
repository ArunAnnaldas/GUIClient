package runner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			String str1 = GUI_Client_Main.jtf.getText();
			GUI_Client_Main.jta.append("Client : " + str1 + "\n");
			GUI_Client_Main.jtf.setText("");
			GUI_Client_Main.pw.println(str1);
			
		} catch (Exception e1) {
			System.out.println("Exception Printed");
		}
	}

}
