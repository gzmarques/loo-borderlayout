package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import panels.Screen1;
import panels.Screen2;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5151041547543472432L;
	public JPanel currentPanel;
	public ArrayList<JPanel> screens;

	public MainFrame() {
		screens = new ArrayList<JPanel>();
		Dimension d = new Dimension(800, 600);
		
		setMinimumSize(d);
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
		panel.setMinimumSize(d);
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
		
		screens.add(panel);
		screens.add(new Screen1());
		screens.add(new Screen2(this));
		
		
		currentPanel = panel;
		this.add(panel);
		pack();
		
		centerBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centerBtn.setBackground(Color.ORANGE);
			}
		});
		
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				currentPanel.setVisible(false);
				remove(currentPanel);
				currentPanel = screens.get(1);
				add(currentPanel);
				setMinimumSize(new Dimension(100, 100));
				pack();
				
			}
		});
		
		lineStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				currentPanel.setVisible(false);
				remove(currentPanel);
				currentPanel = screens.get(2);
				add(currentPanel);
				setMinimumSize(new Dimension(1000, 300));
				pack();
			}
		});

	}
	
	public JPanel getCurrentPanel() {
		return this.currentPanel;
	}
	
	public ArrayList<JPanel> getScreens() {
		return this.screens;
	}
	
}
