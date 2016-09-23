package panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen1 extends JPanel {
	
	public Screen1() {
		setBackground(Color.GREEN);
		setSize(300,300);
		setVisible(true);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(30);
		layout.setVgap(30);
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
