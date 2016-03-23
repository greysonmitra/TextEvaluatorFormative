package formative.model;

import java.util.ArrayList; 

public class Majors
{
	private ArrayList<String> mathList;
	private ArrayList<String> compSciList;
	private ArrayList<String> infoTechList;
	
	
	public Majors()
	{
		this.mathList = new ArrayList<String>();
		this.compSciList = new ArrayList<String>();
		
		buildMathList();
		buildCompSciList();
		buildInfoTechList();
	}
	
	private void buildMathList()
	{
		this.mathList.add("M1");
		this.mathList.add("M2");
		this.mathList.add("M3");
		this.mathList.add("M4");
	}
	
	private void buildCompSciList()
	{
		this.compSciList.add("C1");
		this.compSciList.add("C2");
		this.compSciList.add("C3");
		this.compSciList.add("C4");
	}
	
	private void buildInfoTechList()
	{
		this.infoTechList.add("I1");
		this.infoTechList.add("I2");
		this.infoTechList.add("I3");
		this.infoTechList.add("I4");
	}
	
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		
			if(0==0)
			{
				hasContent = true;
			}
				
		return hasContent;
	}
	
	
	public boolean mathMajorChecker(String currentInput) //Checks the mathMajor arrayList for the input entered by the user. If it matches one of the four options, then it works.
	{
		boolean hasMath = false;
		
		for(String math:mathList)
		{
			if (currentInput.toLowerCase().equals("M1")||currentInput.equals("M2")||currentInput.equals("M3")||currentInput.equals("M4"))
			{
				hasMath = true;
			}
		}
		return hasMath;
	}
	
	public boolean compSciMajorChecker(String currentInput) //Like mathMajor, but checks the computer science list.
	{
		boolean hasComp = false;
		
		for(String comp:compSciList)
		{
			if (currentInput.toLowerCase().equals("C1")||currentInput.equals("C2")||currentInput.equals("C3")||currentInput.equals("C4"))
			{
				hasComp = true;
			}
		}
		return hasComp;
	}
	
	public boolean infoTechMajorChecker(String currentInput) //Like the other checkers, but for information technology majors.
	{
		boolean hasInfo = false;
		
		for(String info:infoTechList)
		{
			if (currentInput.equals("I1")||currentInput.equals("I2")||currentInput.equals("I3")||currentInput.equals("I4"))
			{
				hasInfo = true;
			}
		}
		return hasInfo;
	}
	
	public String processInput(String currentInput)
	{
		String nextTopic = "HI";
		int randomTopic = (int) (Math.random() * 5); //Generates random number between 0 through 4.
			
			
		switch (randomTopic)
		{
		case 0:
			if(mathMajorChecker(currentInput))
			{
				nextTopic = "Your major is math and you are in ___ year";
			}
			break;
		case 1:
			if(compSciMajorChecker(currentInput))
			{
				nextTopic = "Your major is computer science and you are in ___ year";
			}
			break;
		case 2:
			if(infoTechMajorChecker(currentInput))
			{
				nextTopic = "Your major is information technology and your are in ___ year";
			}
			break;
		case 3:
			nextTopic = "Anything else?!";
			break;
		default:
			break;
			}
			return nextTopic;
	}
}
