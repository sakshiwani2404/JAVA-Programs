import java.util.Arrays;
class Employee
{
	int eid;
	String name;
	double sal;
	String dept;
	Employee(){
		super();
	}
	Employee(int eid, String name, double sal, String dept)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		this.dept=dept;
	}
	@Override
	public String toString(){
		return "Employee : [Employee Id: "+eid+" Employee Name : "+name +" Employee Salary : "+sal+" Department : "+dept+"]";
	}
}
class EmployeeLinearSearch
{
	public static void main(String[] args)
	{
		Employee[] e= new Employee[6];
		e[0]= new Employee(2404,"Sakshi",55000,"Developer");
		e[1]= new Employee(2910,"Ramesh",40000,"Tester");
		e[2]= new Employee(2400,"Suresh",50000,"Back End Developer");
		e[3]= new Employee(2104,"Ganesh",60000,"Front End Developer");
		e[4]= new Employee(2504,"Rakesh",65000,"Software Developer");
		e[5]= new Employee(2244,"Rajesh",55000,"Trainee");
		int key=2404;
		int indx=linearSearch(e, key);
		if(indx!=-1) System.out.println(e[indx]);
		else System.out.println("Employee with "+key+" Employee id is not Present");
		
	}
	public static int linearSearch(Employee[]  emp, int key)
	{
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].eid==key) return i;
		}
		return -1;
	}
}