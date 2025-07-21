import java.util.Arrays;
class Employee implements Comparable<Employee>
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
	@Override
	public int compareTo(Employee emp) // ascending sort by employee id
	{
		return this.eid-emp.eid;
	}
	//  @Override
	//  public int compareTo(Employee emp) //descending sort by employee id
	// {
	// 	return emp.eid-this.eid;
	// }
	// @Override
	// public int compareTo(Employee emp) // ascending sort by salary
	// {
	// 	return (int)(this.sal-emp.sal);
	// }
	// @Override
	// public int compareTo(Employee emp) // descending sort by salary
	// {
	// 	return (int)(emp.sal- this.sal);
	// }
	// @Override
	// public int compareTo(Employee emp) // ascending sort by name of employee
	// {
	// 	return this.name.compareTo(emp.name);
	// }
	// @Override
	// public int compareTo(Employee emp)// descending sort by name of Employee
	// {
	// 	return emp.name.compareTo(this.name);
	// }

}
class EmployeeManagementSystem
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
	
		for (Employee emp : e ) 
		{
			System.out.println(emp);
		}
		Arrays.sort(e);
		System.out.println();
		System.out.println();
		for (Employee emp : e ) 
		{
			System.out.println(emp);
		}
	}
}