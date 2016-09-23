package panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Screen2 extends JPanel {
	
	Frame frame;
	
	public Screen2(Frame frame) {
		this.frame = frame;
		frame.setSize(800,600);
		setBackground(Color.RED);
		setSize(700,600);
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
				frame.add(new Screen1());
				frame.pack();
			}
		});
	}

}
