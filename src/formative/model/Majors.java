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
			if (currentInput.equalsIgnoreCase("M1")||currentInput.equalsIgnoreCase("M2")||currentInput.equalsIgnoreCase("M3")||currentInput.equalsIgnoreCase("M4"))
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
			if (currentInput.equalsIgnoreCase("C1")||currentInput.equalsIgnoreCase("C2")||currentInput.equalsIgnoreCase("C3")||currentInput.equalsIgnoreCase("C4"))
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
			if (currentInput.equalsIgnoreCase("I1")||currentInput.equalsIgnoreCase("I2")||currentInput.equalsIgnoreCase("I3")||currentInput.equalsIgnoreCase("I4"))
			{
				hasInfo = true;
			}
		}
		return hasInfo;
	}
	
	public String processInput(String currentInput)
	{
		String nextTopic = "";
		String major = "";
		int Year = Integer.parseInt(currentInput.substring(1, 2)); 
		
		if(mathMajorChecker(currentInput))
		{
			major = "You are a math major";
		}	
		else if(compSciMajorChecker(currentInput))
		{
			major = "You are a computer science major";
		}
		else if(infoTechMajorChecker(currentInput))
		{
			major = "You are a information technology major";
		}
			
		switch (Year)
		{
		case 0:
			nextTopic = "and you are in freshman year";
			
			break;
		case 1:
			nextTopic = "and you are in sophomore year";
			
			break;
		case 2:
			nextTopic = "and you are in junior year";
			
			break;
		case 3:
			nextTopic = "and you are in senior year";
			break;
		default:
			break;
			}
		
		
			return major + nextTopic;
	}
	
	public ArrayList<String> getMathList()
	{
		return mathList;
	}
	
	public ArrayList<String> getCompSciList()
	{
		return compSciList;
	}
	
	public ArrayList<String> getInfoTechList()
	{
		return infoTechList;
	}
}
