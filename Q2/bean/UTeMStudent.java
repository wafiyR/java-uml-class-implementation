package bean;
import java.util.Vector;

public class UTeMStudent extends Student
{
	public String faculty;
	public int year_of_study;
	public Department department;
	public Vector subjects;
	
	public UTeMStudent()
	{
		super();
	}
	
	public void setFaculty(String faculty)
	{
		this.faculty = faculty;
	}
	
	public void setYearOfStudy(int year_of_study)
	{
		this.year_of_study = year_of_study;
	}
	
	public void setDepartment(Department department)
	{
		this.department = department;
	}
	
	public void setSubjects(Vector<Subject> subjects)
	{
		this.subjects = subjects;
	}
	
	public String getFaculty()
	{
		return faculty;
	}
	
	public int getYearOfStudy()
	{
		return year_of_study;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	public Vector<Subject> getSubjects()
	{
		return subjects;
	}
}