package bean;

public class Subject
{
	public String subjectCode;
	public String subjectName;
	public String typeSubject;
	
	public Subject()
	{
	}
	
	public void setSubjectCode(String subjectCode)
	{
		this.subjectCode = subjectCode;
	}
	
	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
	}
	
	public void setTypeSubject(String typeSubject)
	{
		this.typeSubject = typeSubject;
	}
	
	public String getSubjectCode()
	{
		return subjectCode;
	}
	
	public String getSubjectName()
	{
		return subjectName;
	}
	
	public String getTypeSubject()
	{
		return typeSubject;
	}
	
}