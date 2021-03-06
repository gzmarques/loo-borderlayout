package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen1 extends JPanel {
	
	public Screen1() {
		setBackground(Color.GREEN);
		setMinimumSize(new Dimension(1000, 300));
		setVisible(true);
		BorderLayout layout = new BorderLayout();
		layout.setHgap(30);
		layout.setVgap(30);
		setLayout(layout);
		
		JButton centerBtn = new JButton("Center");
		JButton lineStart = new JButton("Before Line Begins");
		
		add(centerBtn,BorderLayout.CENTER);
		add(lineStart,BorderLayout.BEFORE_LINE_BEGINS); 
		add(new JButton("Line End"),BorderLayout.AFTER_LINE_ENDS);
		add(new JButton("Before Line Begins"),BorderLayout.BEFORE_LINE_BEGINS);   
		add(new JButton("After Line Ends"),BorderLayout.AFTER_LINE_ENDS); 
		add(new JButton("Before First Line"),BorderLayout.BEFORE_FIRST_LINE); 
		add(new JButton("After Last Line"),BorderLayout.AFTER_LAST_LINE); 
	}

}
