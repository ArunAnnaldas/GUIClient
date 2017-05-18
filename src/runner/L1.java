package runner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class L1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			GUI_Client_Main.str1 = GUI_Client_Main.jtf.getText();
			GUI_Client_Main.jta.append(GUI_Client_Main.str1 + "\n");
			GUI_Client_Main.jtf.setText("");
			GUI_Client_Main.pw.println(GUI_Client_Main.str1);
			
			if(GUI_Client_Main.str1.equals("end"))
			{
				System.out.println("Client signing OFF");
				System.exit(0);
			}
			
		} catch (Exception e1) {
			System.out.println("Exception Printed");
		}
	}

}
