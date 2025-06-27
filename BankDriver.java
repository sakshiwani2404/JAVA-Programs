import java.util.Scanner;
import java.util.ArrayList;
class BankDriver
{
	static Customer cust;
	static ArrayList<String> statement= new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for( ; ; )
		{
			System.out.println();
			System.out.println("                           *****WELCOME*****");
			System.out.println("                            State Bank Of India ");
			System.out.println();
			System.out.println("1. Existing User");
			System.out.println("2. New Account");
			System.out.println();
			System.out.println("Enter an Option : ");
			int opt= sc.nextInt();
			System.out.println();
			switch(opt)
			{
				case 1: login(sc);break;
				case 2: createAccount(sc);break;
				default:System.out.println("INVALID OPTION");break;
			}
		}
	}
	public static void login(Scanner sc)
	{
		if(cust==null)
		{
			System.out.println("Create Your Account First ");
			return ;
		}
		System.out.println("                   LOGIN");
		System.out.println();

		for(int i=3;i>=1;i--)
		{
			System.out.print("Phone :");
			long userPhone= sc.nextLong();
			System.out.print("Pin : ");
			int userPin=sc.nextInt();
			if(userPin== cust.getPin())
			{
				homePage(sc);
			}
			else{
				System.out.println("INVALID PIN");
				System.out.println("Attempts Left : "+(i-1));
			}
		}
		System.out.println("YOUR ACCOUNT IS BLOCKED  FOR  48 Hours ");
		System.exit(0);
	}
	public static void createAccount(Scanner sc){
		System.out.println("                         CREATE  ACCOUNT");
		System.out.println();
		sc.nextLine();
		System.out.print("Name : ");
		String name=sc.nextLine();
		System.out.print("Email : ");
		String email=sc.next();
		sc.nextLine();
		System.out.print("Address : ");
		String address=sc.nextLine();
		System.out.print("Contact : ");
		long contact = sc.nextLong();
		System.out.print("Adhar Number : ");
		long adhar = sc.nextLong();
		System.out.print("Pan Number : ");
		String pan=sc.next();
		System.out.print("Deposit Amount : ");
		double amount = sc.nextDouble();
		statement.add(" Deposit : "+amount+" Account Creation ");
		System.out.println("Pin : ");
		int pin= sc.nextInt();

		cust= new Customer(name,address,email,contact, adhar,pan,amount,pin );
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");

	}
	public static void homePage(Scanner sc)
	{
		for( ;  ; )
		{
			System.out.println();
			System.out.println("                                          HOME PAGE ");
			System.out.println();
			System.out.println("1. Deposit Amount ");
			System.out.println("2. Withdraw Amount ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Statement ");
			System.out.println("5. Edit Profile");
			System.out.println("6. Logout ");
			System.out.println();
			System.out.println("Enter an option : ");
			int opt= sc.nextInt();
			System.out.println();
			switch(opt)
			{
				case 1: depositAmount(sc);break;
				case 2: withdrawAmount(sc);break;
				case 3: checkBalance(sc);break;
				case 4: statement();break;
				case 5: editProfile(sc);break;
				case 6: System.out.println(" Thank You ! Visit Again ");System.exit(0);
				default:System.out.println("Invalid Option");
			}
		}
	}
	public static void depositAmount(Scanner sc)
	{
		System.out.println("                DEPOSIT");
		System.out.println();
		System.out.print("Amount : ");
		double depAmt=sc.nextDouble();
		cust.setBalance(depAmt+cust.getBalance());
		System.out.println("Amount Deposited Successfully");
		statement.add("Deposit : "+depAmt);
	}
	public static void withdrawAmount(Scanner sc)
	{
		System.out.println("                  WITHDRAW ");
		System.out.println();
		System.out.println("Enter Amount : ");
		double wAmt= sc.nextDouble();

		System.out.print("Enter Your Pin : ");
		int userPin=sc.nextInt();
		if(userPin==cust.getPin())
		{
			if(wAmt<=cust.getBalance())
			{
				double newBal=cust.getBalance()-wAmt;
				cust.setBalance(newBal);
				System.out.println("Amount Debited");
				statement.add("Withdraw : "+wAmt);
			}
			else {
				System.out.println("INSUFFICIENT BALANCE");
			}
		}
		else
			System.out.println("INVALID PIN");
	}
	public static void checkBalance(Scanner sc)
	{
		System.out.println("                               Check Balance ");
		System.out.println();
		System.out.println(" Enter Your Pin : ");
		int userPin=sc.nextInt();

		if(userPin==cust.getPin())
		{
			System.out.println("Your Balance is : "+ cust.getBalance());
		}
		else {
			System.out.println("INVALID PIN");
		}
	}
	public static void statement()
	{
		System.out.println("                    YOUR BANK STATEMENT ");
		System.out.println();
		for(String str: statement)
		{
			System.out.println(str);
		}
		System.out.println(" ");
		System.out.println("Avail Balance : "+cust.getBalance());
	}
	public static void editProfile(Scanner sc)
	{
		System.out.println("                            EDIT PROFILE ");
		System.out.println();
		System.out.println("1. Change Name ");
		System.out.println("2. Change Address");
		System.out.println("3. Change Email");
		System.out.println("4. Change Contact No. ");
		System.out.println("5. Change Pin ");
		System.out.println();
		System.out.print("Enter the Option : ");
		int opt=sc.nextInt();
		switch(opt)
		{
			case 1:
				{
					System.out.println("Enter Your Pin : ");
					int userPin=sc.nextInt();
					if(userPin==cust.getPin())
					{
						sc.nextLine();
						System.out.println("Enter New Name : ");
						
						String newName= sc.nextLine();
						cust.setName(newName);
						System.out.println("Name Updated to "+ cust.getName()+" Successfully");
					}
					else {
						System.out.println("INVALID PIN");
					}
				}break;
			case 2:
				{
					System.out.println("Enter Your Pin : ");
					int userPin=sc.nextInt();
					if(userPin==cust.getPin())
					{
						System.out.println("Enter New Address : ");
						sc.nextLine();
						String newAdd= sc.nextLine();
						cust.setAddress(newAdd);
						System.out.println("Address Updated to "+ cust.getAddress()+" Successfully");
					}
					else {
						System.out.println("INVALID PIN");
					}
				}break;
			case 3: 
				{
					System.out.println("Enter Your Pin : ");
					int userPin=sc.nextInt();
					if(userPin==cust.getPin())
					{
						System.out.println("Enter New Email : ");
						sc.nextLine();
						String newEmail= sc.next();
						cust.setEmail(newEmail);
						System.out.println("Email Updated to "+ cust.getEmail()+" Successfully");
					}
					else {
						System.out.println("INVALID PIN");
					}
				}break;
			case 4:{

					System.out.println("Enter Your Pin : ");
					int userPin=sc.nextInt();
					if(userPin==cust.getPin())
					{
						System.out.println("Enter New Contact : ");
						long newContact= sc.nextLong();
						cust.setContact(newContact);
						System.out.println("Contact No Updated to "+ cust.getContact()+" Successfully");
					}
					else {
						System.out.println("INVALID PIN");
					}
				}break;
			case 5:
				{
					System.out.println("Enter Your Pin : ");
					int userPin=sc.nextInt();
					if(userPin==cust.getPin())
					{
						System.out.println("Enter New Pin : ");
						int newPin= sc.nextInt();
						cust.setPin(newPin);
						System.out.println("Pin Updated to "+ newPin+"  Successfully");
					}
					else {
						System.out.println("INVALID PIN");
					}
				}break;
			default:System.out.println("INVALID OPTION");break;
		}
		System.out.println();
	}
}