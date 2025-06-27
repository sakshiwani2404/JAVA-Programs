class University
{
	private String name;
	private int code;
	private int colleges;
	private String course;
	private String director;
	private String add;
	private long contact;
	private String email;

	University(String name, int code, int colleges ,String course , String director, String add, long contact, String email)
	{
		super();
		this.name=name;
		this.code=code;
		this.colleges=colleges;
		this.course=course;
		this.director=director;
		this.add=add;
		this.contact=contact;
		this.email=email;

	}
	public void displayUniversity()
	{
		System.out.println("University Details : ");
		System.out.println("Name : "+name);
		System.out.println("Code : "+code);
		System.out.println("Colleges Affiliated : "+colleges);
		System.out.println("Courses Offered : "+course);
		System.out.println("Director : "+director);
		System.out.println("Address : "+add);
		System.out.println("Contact : "+contact);
		System.out.println("Email : "+email);
	}

}
class College extends University
{
	private String name;
	private int code;
	private String add;
	private String grade;
	private String principal;
	private String email;
	private long contact;
	private int students;
	private int depart;
	
	College(String name, int code,String add,String grade,String principal,String email,long contact, int students, int depart)
	{
		super();
		this.name=name;
		this.code=code;
		this.add=add;
		this.grade=grade;
		this.principal=principal;
		this.contact=contact;
		this.email=email;
		this.depart=depart;
		this.students=students;

	}
	public void displayCollege()
	{
		System.out.println("College Details : ");
		System.out.println("Name : "+name);
		System.out.println("Code : "+code);
		System.out.println("Address : "+add);
		System.out.println("Contact : "+contact);
		System.out.println("Email : "+email);
		System.out.println("Grade : "+grade);
		System.out.println("Principal : "+principal);
		System.out.println("No. of Departments  : "+depart);
		System.out.println("No. of Students  : "+students);

	}

}
class Department extends College
{
	String name; 
	String hod;
	int staff;
	int students;

	Department(String name, String hod, int staff, int students)
	{
		super();
		this.name=name;
		this.hod=hod;
		this.staff=staff;
		this.students=students;
	}
	public void displayDepartment()
	{
		System.out.println("Department Details : ");
		System.out.println("Name : "+name);
		System.out.println("HOD : "+hod);
		System.out.println("No. of Staff : "+staff);
		System.out.println("No. of Students : "+students);
	}

}
class Professor extends Department
{
	String name;
	String designation;
	String education;
	long contact;
	String subject;
	Professor(String name, String designation, String education, long contact, String subject)
	{
		super();
		this.name=name;
		this.designation=designation;
		this.education=education;
		this.contact=contact;
		this.subject=subject;
	}
	public void displayProfessor()
	{
		System.out.println("Professor Details : ");
		System.out.println("Name : "+name);
		System.out.println("Designation : "+designation);
		System.out.println("Education : "+education);
		System.out.println("Contact : "+contact);
		
		System.out.println("Subject Speciality : "+subject);
	}

}
class Education
{

}
class Address
{

}

class MultiLevelInheritance
{
	public static void main(String[] args) 
	{
		University uni=new University();

	}
}