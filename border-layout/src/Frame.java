import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setSize(300,300);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		panel.setLayout(layout);
		
		JButton centerBtn = new JButton("Center");
		JButton lineStart = new JButton("Line Start");
		  
		panel.add(centerBtn,BorderLayout.CENTER);
		panel.add(lineStart,BorderLayout.LINE_START); 
		panel.add(new JButton("Line End"),BorderLayout.LINE_END);
		panel.add(new JButton("East"),BorderLayout.EAST);   
		panel.add(new JButton("West"),BorderLayout.WEST); 
		panel.add(new JButton("North"),BorderLayout.NORTH); 
		panel.add(new JButton("South"),BorderLayout.SOUTH); 
		
		this.add(panel);
		
		centerBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerBtn.setBackground(Color.ORANGE);
			}
		});
		
		lineStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				remove(panel);
				layout.setVgap(30);
				add(panel);
				
			}
		});

	}
	
}
