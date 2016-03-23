package formative.view;

import formative.controller.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

public class MajorsPanel extends JPanel
{
	private MajorsController baseController;
	private JButton submitButton;
	private JTextField inputField;
	private SpringLayout baseLayout;
	private JLabel infoLabel;
	private JTextArea displayArea;

	
	public MajorsPanel(MajorsController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		submitButton = new JButton("Submit");
		inputField = new JTextField();
		infoLabel = new JLabel("Enter a number followed by a letter. Use M, C, or I for letters .........");
		displayArea = new JTextArea();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(submitButton);
		this.add(inputField);
		this.add(infoLabel);
		inputField.setToolTipText("Type here");
		displayArea.setEnabled(false);
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{	
				
					
				String userText = inputField.getText(); 
				displayArea.append("\nUser: " + userText); 
				inputField.setText(""); 
				String response = baseController.userToSystem(userText); 
				displayArea.append("\nSystem: " + response); 
			}	
		});
	}
}
