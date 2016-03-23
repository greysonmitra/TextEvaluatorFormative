package formative.view;

import javax.swing.*;
import formative.controller.*;

public class MajorsFrame extends JFrame
{
	private MajorsController baseController;
	private MajorsPanel basePanel;
	
	
	public MajorsFrame(MajorsController baseController)
	{
		this.baseController = baseController;
		basePanel = new MajorsPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 
		this.setSize(500,400); 			
		this.setTitle("Class Evaluator");
		this.setResizable(false);       
		this.setVisible(true);		    
	} 
	
	public MajorsController getBaseController()
	{
		return baseController;
	}
}
