import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5151041547543472432L;

	public Frame() {
		setSize(800, 600);
		setLayout(new BorderLayout());
		setVisible(true);
		//setdefault encerra a execução do sistema quando fechada a tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem open = new JMenuItem("Open");
		file.add(open);
		menuBar.add(file);
		add(menuBar, BorderLayout.SOUTH);
	}
	
}
