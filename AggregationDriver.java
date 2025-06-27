class University
{
	String name;
	String address;
	String estYear;
	String dean;
	int colleges;
	int code;

	University(String name, String address, String estYear, String dean , int colleges, int code)
	{
		super();
		this.name=name;
		this.address=address;
		this.estYear=estYear;
		this.dean=dean;
		this.colleges=colleges;
		this.code=code;
	}
	void displayUniversity()
	{
		System.out.println("University Info : ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Established Year : "+estYear);
		System.out.println("Dean : "+dean);
		System.out.println("No. of Colleges : "+colleges);
		System.out.println("Code : "+code);
	}
}
class College
{
	String name;
	String address;
	String principal;
	int students;
	int staffs;
	String grade;
	int code;
	int departments;

	College(String name, String address, String principal, int students, int staffs, String grade, int code, int departments)
	{
		super();
		this.name=name;
		this.address=address;
		this.principal=principal;
		this.students= students;
		this.staffs= staffs;
		this.grade= grade;
		this.code= code;
		this.departments=departments;
	}
	void displayCollege()
	{
		System.out.println();
		System.out.println("College Info : ");
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Principal : "+principal);
		System.out.println("Students : "+students);
		System.out.println("Staffs : "+staffs);
		System.out.println("Grade : "+grade);
		System.out.println("Code : "+ code);
		System.out.println("Departments : "+departments);
	}
}
class Department
{
	String name;
	String hod;
	String staff; 
	int students;

	Department(String name, String hod,String staff, int students)
	{
		super();
		this.name=name;
		this.hod=hod;
		this.staff=staff;
		this.students=students;
	}
	void displayDepartment()
	{
		System.out.println();
		System.out.println("Department Info :");
		System.out.println("Name : "+name);
		System.out.println("HOD : "+hod);
		System.out.println("Staff : "+staff);
		System.out.println("Students : "+students);

	}
}
class AggregationDriver
{
	public static void main(String[] args) {
		
	}
}