package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.MainFrame;

public class Screen2 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3686722450399729350L;
	MainFrame frame;
	
	public Screen2(MainFrame frame) {
		this.frame = frame;
		frame.getScreens();
		setBackground(Color.RED);
		setVisible(true);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(100);
		layout.setVgap(10);
		setLayout(layout);
		
		JButton centerBtn = new JButton("Center");
		JButton lineStart = new JButton("Line Start");
		
		add(centerBtn,BorderLayout.CENTER);
		add(lineStart,BorderLayout.LINE_START); 
		add(new JButton("Line End"),BorderLayout.LINE_END);
		add(new JButton("East"),BorderLayout.EAST);   
		add(new JButton("West"),BorderLayout.WEST); 
		add(new JButton("North"),BorderLayout.NORTH); 
		add(new JButton("South"),BorderLayout.SOUTH); 
		
		centerBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frame.add(frame.getScreens().get(1));
				frame.pack();
			}
		});
	}

}
