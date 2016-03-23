package formative.view;

import formative.controller.*;
import java.awt.Color;
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
		inputField = new JTextField("type here");
		infoLabel = new JLabel("Enter a number followed by a letter. Use M, C, or I for letters .........");
		displayArea = new JTextArea();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
