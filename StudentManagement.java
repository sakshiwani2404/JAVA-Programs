

import java.util.ArrayList;
import java.util.Scanner;

class StudentManagement
{
	static Student student;
	static ArrayList<Mock>ListMock=new ArrayList<Mock>();

	public static void start()
	{
		Scanner scanner=new Scanner(System.in);
		for(;;)
		{
			System.out.println();
			System.out.println("WELCOME");
			System.out.println();
			System.out.println("1. Student");
			System.out.println("2. HR");
			System.out.println();
			System.out.print("Enter an option : ");
			int option=scanner.nextInt();
			switch(option)
			{
			case 1:
				{
					studentHomePage();
					break;
				}
			case 2:
				{
					hrHomePage();
					break;
				}
			default:
				System.out.println("Inavlid option : ");
			}
		}
	}

	private static void hrHomePage()
	{
		if(student==null)
		{
			System.out.println("Student data is not present");
		}
		for(;;)
		{
			System.out.println("HR MODULE ");
			System.out.println();
			System.out.println("1. View all students");
			System.out.println("2. Mock ratings");
			System.out.println("3. Requirements");
			System.out.println("4. Logout");
			System.out.println();
			System.out.println("Enter an option : ");
			int opt=new Scanner(System.in).nextInt();
			switch(opt)
			{
			case 1:
				{
					viewAllStudent();
					break;
				}
			case 2:
				{
					mockRating();
					break;
				}
			case 3:
				{
					requirement();
					break;
				}
			case 4:
				{
					return;
				}
			default:
				System.out.println("Inavlid Option ");
			}


		}
	}

	private static void requirement()
	{
		System.out.println("REQUREMENT MODULE ");
		//implementing soon
	}
	private static void mockRating()
	{
		for(;;)
		{
			System.out.println("Mock Module ");
			System.out.println();
			System.out.println("1. Add mock");
			System.out.println("2. view all mock");
			System.out.println("3. Exit");
			System.out.print("Enter an option : ");
			int opt=new Scanner(System.in).nextInt();
			switch(opt)
			{
			case 1:
				{
					addMock();
					break;
				}
			case 2:
				{
					viewAllMock();
					break;
				}
			case 3:
				{
					return;
				}
			default:
				System.out.println("Inavlid option ");
			}
		}
	}
	private static void viewAllMock()
	{
		System.out.println();
		System.out.println("All Mock ");
		for(Mock ele : ListMock)
		{
			ele.displayMock();
		}
	}
	private static void addMock()
	{
		System.out.println();
		System.out.println("Add mock module :");
		System.out.println();
		System.out.print("Date :");
		String date=new Scanner(System.in).next();
		System.out.print("Trainer name :");
		String trainerName=new Scanner(System.in).next();
		System.out.print("Subject :");
		String sub=new Scanner(System.in).next();
		System.out.print("Rating :");
		String rating=new Scanner(System.in).next();
		Mock mock=new Mock(trainerName,sub,date,rating);
		ListMock.add(mock);

	}
	private static void viewAllStudent()
	{
		student.displayStudent();
	}
	private static void studentHomePage()
	{
		for(;;)
		{
			System.out.println();
			System.out.println("Student Module");
			System.out.println();
			System.out.println("1.Create Profile");
			System.out.println("2.Profile");
			System.out.println("3.Mock ratings");
			System.out.println("4.Requirement");
			System.out.println("5.Logout");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt=new Scanner(System.in).nextInt();
			switch(opt)
			{
			case 1:
				{
					createProfile();
					break;
				}
			case 2:
				{
					viewProfile();
					break;
				}
			case 3:
				{
					viewMockRating();
					break;
				}
			case 4:
				{
					viewRequirement();
					break;
				}
			case 5:
				{
					return;
				}
			default:
				System.out.println("Invalid option ");
			}

		}
	}
	private static void viewRequirement()
	{
		System.out.println("implementing soon");
	}
	private static void viewMockRating()
	{
		if(student==null)
		{
			System.out.println("Create your account first");
			return;
		}
		System.out.println("All mock ratings");
		for(Mock ele : ListMock)
		{
			ele.displayMock();
		}
	}
	private static void viewProfile()
	{
		if(student==null)
		{
			System.out.println("Create your account first ");
			return;
		}
		System.out.println("Student Profile Module");
		System.out.println();
		student.displayStudent();

		System.out.println();
		System.out.print("Do you want to edit something ? ");
		@SuppressWarnings("resource")
		String resp=new Scanner(System.in).next();
		if(resp.equalsIgnoreCase("YES"))
		{
			editStudentProfile();
		}
	}

	private static void editStudentProfile()
	{
		for(;;)
		{
			System.out.println();
			System.out.println("Edit Student Info :");
			System.out.println("1. Name ");
			System.out.println("2. Email id ");
			System.out.println("3. Contact no");
			System.out.println("4. Address");
			System.out.println("5. Change pin");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Enter an option : ");
			System.out.println();
			int opt=new Scanner(System.in).nextInt();
			switch(opt)
			{
			case 1:
				{
					System.out.print("New Name :");
					String newName=new Scanner(System.in).nextLine();
					System.out.println("Pin : ");
					int userPin=new Scanner(System.in).nextInt();
					if(userPin==student.getPin())
					{
						student.setName(newName);
					}
					else
					{
						System.out.println("Inavlid pin");
					}
					break;
				}
				case 2:
				{
					System.out.print("New Email :");
					String newEmail=new Scanner(System.in).nextLine();
					System.out.println("Pin : ");
					int userPin=new Scanner(System.in).nextInt();
					if(userPin==student.getPin())
					{
						student.setEmail(newEmail);
					}
					else
					{
						System.out.println("Inavlid pin");
					}
					break;
				}
				case 3:
				{
					System.out.print("New contact :");
					long newContact=new Scanner(System.in).nextLong();
					System.out.println("Pin : ");
					int userPin=new Scanner(System.in).nextInt();
					if(userPin==student.getPin())
					{
						student.setContact(newContact);
					}
					else
					{
						System.out.println("Inavlid pin");
					}
					break;
				}
				case 4:
				{
					System.out.print("New Address:");
					String newAddress=new Scanner(System.in).nextLine();
					System.out.println("Pin : ");
					int userPin=new Scanner(System.in).nextInt();
					if(userPin==student.getPin())
					{
						student.setName(newAddress);
					}
					else
					{
						System.out.println("Inavlid pin");
					}
					break;
				}
				case 5:
				{
					System.out.print("New Pin :");
					int newPin=new Scanner(System.in).nextInt();
					System.out.println("Pin : ");
					int userPin=new Scanner(System.in).nextInt();
					if(userPin==student.getPin())
					{
						student.setPin(newPin);
					}
					else
					{
						System.out.println("Inavlid pin");
					}
					break;
				}
				case 6:
				{
					System.out.println();
					return;
				}
			}
		}
	}

	private static void createProfile()
	{
		System.out.println("Create profile module : ");
		System.out.println();
		System.out.println("Pin : ");
		int pin=new Scanner(System.in).nextInt();
		System.out.println("Name : ");
		String name=new Scanner(System.in).nextLine();
		System.out.println("Email : ");
		String email=new Scanner(System.in).next();
		System.out.println("Contact : ");
		long contact=new Scanner(System.in).nextLong();
		System.out.println("Address : ");
		String address=new Scanner(System.in).nextLine();

		student=new Student(pin,name,email,contact,address);
	}
}



class Student
{
	static int sid=123456;
	private String id;
	private String name;
	private String email;
	private int pin;
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getId()
	{
		return id;
	}

	private long contact;
	private String address;
	private ArrayList<Education>listEdu=new ArrayList<>();
	private ArrayList<Mock>listMock=new ArrayList<>();
	private ArrayList<Requirement>listReq=new ArrayList<>();

	public Student(int pin,String name,String email,long contact,String address)
	{
		super();
		this.id="QSP"+sid++;
		this.pin=pin;
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.address=address;
		this.listEdu=addEducationDetails();
	}

	public int getPin()
	{
		return pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public long getContact()
	{
		return contact;
	}
	public void setContact(long contact)
	{
		this.contact=contact;
	}
	public String getAddress()
	{
		return address;
	}

	private ArrayList<Education>addEducationDetails()
	{
		ArrayList<Education>list=new ArrayList<Education>();
		for(;;)
		{
			System.out.println();
			System.out.println("Add Educational Details : ");
			System.out.print("Course : ");
			String course=new Scanner(System.in).nextLine();
			System.out.print("Yop : ");
			int yop=new Scanner(System.in).nextInt();
			System.out.print("University : ");
			String uni=new Scanner(System.in).nextLine();
			System.out.print("Marks : ");
			double marks=new Scanner(System.in).nextDouble();
			System.out.println();
			Education edu=new Education(course,yop,uni,marks);
			list.add(edu);
			System.out.println("Educational Details For : "+course+"Submitted");
			System.out.println();

			System.out.print("Do you want to add more edu info ?");
			@SuppressWarnings("resource")
			String resp=new Scanner(System.in).next();
			if(resp.equalsIgnoreCase("YES"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		return list;
	}

	public void displayStudent()
	{
		System.out.println();
		System.out.println("Student info : ");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Contact : "+contact);
		System.out.println("Address : "+address);
		displayAllEducationalDetails();
	}
	public void displayAllEducationalDetails()
	{
		for (Education ele:listEdu)
		{
			ele.displayEducation();
		}
	}
}
  class Requirement
{
	
	//implementing soon
}

 class Mock
{
	private String trainerName;
	private String sub;
	private String date;
	private String rating;

	public Mock(String trainerName,String sub,String date,String rating)
	{
		super();
		this.trainerName=trainerName;
		this.sub=sub;
		this.date=date;
		this.rating=rating;
	}

	public String getTrainerName()
	{
		return trainerName;
	}

	public void setTrainerName(String trainerName)
	{
		this.trainerName=trainerName;
	}
	public String getSub()
	{
		return sub;
	}
	public void displayMock()
	{
		System.out.println("implementing");
	}
}

 class Education
 {
 	private String course;
 	private int yop;
 	private String uni;
 	private double marks;

 	public Education(String course,int yop,String uni,double marks)
 	{
 		super();
 		this.course=course;
 		this.yop=yop;
 		this.uni=uni;
 		this.marks=marks;
 	}

 	public void displayEducation()
 	{
 		System.out.println();
 		System.out.println("EDucational Details : ");
 		System.out.println("Course : "+course);
 		System.out.println("YOP : "+yop);
 		System.out.println("University : "+uni);
 		System.out.println("Marks : "+marks);
 	}
 }

 public class Driver
{
	public static void main(String[] args) 
	{
		StudentManagement.start();
	}
}