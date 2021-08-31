import java.util.Vector;
import bean.Biodata;
import bean.School;
import bean.Student;
import bean.Address;
import bean.Parent;
import bean.UTeMStudent;
import bean.Department;
import bean.Subject;

public class MyMain
{	
	public static void main(String[] args)
	{
		Address addressShahrul = new Address(4, "Jalan Bukit Beruang Uthama", 75450, "Melakka", 1234567);
		Biodata biodataShahrul = new Biodata();
		UTeMStudent shahrulStudent = new UTeMStudent();
		Department departmentShahrul = new Department();
 
		biodataShahrul.setName("Amin");
		biodataShahrul.setHome_address(addressShahrul);
		
		shahrulStudent.setFaculty("FTMK");
		shahrulStudent.setYearOfStudy(2);
		shahrulStudent.setBiodata(biodataShahrul);
		
		departmentShahrul.setDepartment(3);
		
		Vector<Subject> subjects = new Vector<Subject>();
		
		Subject oop = new Subject();
		oop.setSubjectCode("BITP 3113");
		oop.setSubjectName("Object Oriented Programming");
		oop.setTypeSubject("Programming");
		
		Subject php = new Subject();
		php.setSubjectCode("BITU 2913");
		php.setSubjectName("Workshop 1");
		php.setTypeSubject("Programming");
		
		Subject calc = new Subject();
		calc.setSubjectCode("BITI 2233");
		calc.setSubjectName("Statistic and Probability");
		calc.setTypeSubject("Mathmatics");
		
		Subject logic = new Subject();
		logic.setSubjectCode("BITI 2113");
		logic.setSubjectName("Logic Programming");
		logic.setTypeSubject("Programming");
		
		Subject dcom = new Subject();
		dcom.setSubjectCode("BITS1313");
		dcom.setSubjectName("Data Communication and Networking");
		dcom.setTypeSubject("Networking");
		
		subjects.add(oop);
		subjects.add(php);
		subjects.add(calc);
		subjects.add(logic);
		subjects.add(dcom);
		shahrulStudent.setSubjects(subjects);
		
		System.out.print("\nName: "+biodataShahrul.getName()+"\n");
		System.out.print("Faculty: "+shahrulStudent.getFaculty()+"\n");
		System.out.print("Year Of Study: "+shahrulStudent.getYearOfStudy()+"\n");
		System.out.print("Department: "+departmentShahrul.getDepartment()+"\n");
		System.out.print("Home Address: "+addressShahrul.getNumber()+","+addressShahrul.getRoad()+","+addressShahrul.getPoscode()+","+addressShahrul.getState()+"\n");
		System.out.print("Tel Number: "+addressShahrul.getNo_tel()+"\n");
		System.out.print("Courses in current semester: \n");
		
		for(Subject s : shahrulStudent.getSubjects())
		{
			System.out.print("Subject Name: " + s.getSubjectName() + "\n");
			System.out.print("Subject Code: " + s.getSubjectCode() + "\n");
			System.out.print("Subject Type: " + s.getTypeSubject() + "\n\n");
		}
		
		
	}
}