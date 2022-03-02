package fr.whale.version02.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CustomPanel {
	JPanel customPanel = new JPanel();

	public JPanel newCustomPanel() { 
		JButton buttomCreateProject = new JButton();
		buttomCreateProject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				buttomCreateProject.setVisible(true);
			}
		});	     
		customPanel.add(buttomCreateProject);
		buttomCreateProject.setBounds(56, 215, 125, 23); 
		
		return customPanel;
	}
	
}
