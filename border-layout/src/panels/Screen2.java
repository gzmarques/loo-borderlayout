package panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen2 extends JPanel {
	
	public Screen2() {
		setBackground(Color.RED);
		setSize(1000,600);
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
	}

}