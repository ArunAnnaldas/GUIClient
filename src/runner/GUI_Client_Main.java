package runner;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//Socket Object is present in this package
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI_Client_Main {

	public static JTextField jtf;
	public static JTextArea jta;
	public static PrintWriter pw;
	public static Socket soc;
	public static BufferedReader kin;
	public static String str1;

	public static void main(String[] args) throws Exception, IOException {

		System.out.println("Client signing ON");

		soc = new Socket("127.0.0.1", 9081);
		System.out.println("Client says connection established");
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);
		kin = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		 * for(int i = 0 ; i < 5 ; i ++) { System.out.println("Hello " + i );
		 * pw.println("Hello " + i); } pw.println("end");
		 */

		/*
		 * BufferedReader kin = new BufferedReader(new
		 * InputStreamReader(System.in)); String str = kin.readLine();
		 * while(!str.equals("end")) { pw.println(str); str = kin.readLine(); }
		 * pw.println("end");
		 */

		JFrame j1 = new JFrame("GUIClient");
		jta = new JTextArea();
		j1.add(BorderLayout.CENTER, jta);

		JPanel jp = new JPanel();
		jtf = new JTextField(10);
		JButton jb = new JButton("Send");
		
		jp.add(jtf);
		jp.add(jb);
		j1.add(BorderLayout.SOUTH, jp);

		L1 l = new L1();
		jb.addActionListener(l);

		j1.setSize(500, 500);
		j1.setVisible(true);
		
		
		str1 = kin.readLine();
		while(!str1.equals("end"))
		{
			str1 = kin.readLine();
			if(str1.equals("end"))
			{
				System.out.println("Client signing OFF");
				System.exit(0);
			}
		}
		
		
		
		
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		System.out.println("Client signing OFF");
	}
}
