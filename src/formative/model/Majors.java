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
	
	
	public boolean mathMajorChecker(String currentInput)
	{
		boolean hasMath = false;
		
		for(String math:mathList)
		{
			if (currentInput.toLowerCase().equals(math.toLowerCase()))
			{
				hasMath = true;
			}
		}
		return hasMath;
	}
	
	public boolean compSciMajorChecker(String currentInput)
	{
		boolean hasComp = false;
		
		for(String comp:compSciList)
		{
			if (currentInput.toLowerCase().equals(comp.toLowerCase()))
			{
				hasComp = true;
			}
		}
		return hasComp;
	}
	
	public boolean infoTechMajorChecker(String currentInput)
	{
		boolean hasInfo = false;
		
		for(String info:infoTechList)
		{
			if (currentInput.toLowerCase().equals(info.toLowerCase()))
			{
				hasInfo = true;
			}
		}
		return hasInfo;
	}
	
	public String processInput(String currentInput)
	{
		String nextTopic = "HI";
		int randomTopic = (int) (Math.random() * 5); //Generates a random number between 0 and 4.
			
			
		switch (randomTopic)
		{
		case 0:
			if(mathMajorChecker(currentInput))
			{
				nextTopic = "Quite the interesting meme sir. What else would you like to chat about?";
			}
			break;
		case 1:
			if(compSciMajorChecker(currentInput))
			{
				nextTopic = "Quite the widely debated political topic you have there. Would you like to continue talking about politics?";
			}
			break;
		case 2:
			if(infoTechMajorChecker(currentInput))
			{
				nextTopic = "Cool. What other musical things do you want to talk about?";
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
