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
	private JLabel infoLabel;			//These labels give info to the user on using the program/GUI.
	private JLabel infoLabel2;
	private JLabel infoLabel3;
	private JTextArea displayArea;

	
	public MajorsPanel(MajorsController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		submitButton = new JButton("Submit");
		inputField = new JTextField(20);
		infoLabel = new JLabel("Enter a number followed by a letter. Use M, C, or I for Mathematics majors, Computer Science majors, and Information Technology majors respectively.");
		infoLabel2 = new JLabel("Enter a number next to the letter; either 1, 2, 3, or 4 for freshman, sophpomore, junior, or senior year respectively.");
		infoLabel3 = new JLabel("Then, submit your string (Ex: C3).");
		displayArea = new JTextArea(10,20);
		
		

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(submitButton);
		this.add(inputField);
		this.add(displayArea);
		this.add(infoLabel);
		this.add(infoLabel2);
		this.add(infoLabel3);
		inputField.setToolTipText("Type here");
		displayArea.setEnabled(false);
		this.setPreferredSize(new Dimension(1000, 500));
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 36, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayArea, 219, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, 471, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel2, 275, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -17, SpringLayout.NORTH, infoLabel2);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel3, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, infoLabel3, -6, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -150, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 5, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel2, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 10, SpringLayout.WEST, this);

	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{	
				
					
				String userText = inputField.getText(); 	//Gets the text
				displayArea.append("\nUser: " + userText); 	//Puts the text and adds a "User" identifier.
				inputField.setText(""); 					//Deletes the response after it has been inputed. 
				String response = baseController.userToSystem(userText); 	//Prepares a response.
				displayArea.append("\nSystem: " + response); 		//Prints the response witha a "System" identifier.
			}	
		});
	}
	
	public String grabText(String displayText)
	{
		String returnedText = "";
		
		returnedText = inputField.getText() + ""; 
		
		return returnedText;
	}
}
