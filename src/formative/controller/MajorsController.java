package formative.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import formative.model.*;
import formative.view.*;

public class MajorsController
{
	private MajorsFrame baseFrame;
	private Majors myMajors;
	
	
	public MajorsController()
	{
		baseFrame = new MajorsFrame(this);
		myMajors = new Majors();
	}
	
	public void start()
	{
		
	}
	
	public String userToSystem(String userText)
	{
		String response = "";

		response = myMajors.processInput(userText);
			
		return response;
	}
	
	public MajorsFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public Majors getMyMajors()
	{
		return myMajors;
	}
}
