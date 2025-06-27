import java.util.Scanner;
class DateValidation
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Year :");
		int yy= sc.nextInt();
		if(yy>=1)
		{
			System.out.println("Enter Month :");
			int mm= sc.nextInt();
			if(mm>=1 && mm<=12)
			{
				System.out.println("Enter Day :");
				int dd= sc.nextInt();
				if(dd>=1 && dd<=31)
				{
					if(mm==4||mm==6||mm==9||mm==11)
					{
						if(dd<=30)
							System.out.println(" Valid Date ");
						else
							System.out.println("Enter Valid Date ");
					}
					else if(mm==2 && (yy%4==0 && yy%100!=0 || yy%400==0))
					{
						if(dd<=29)
							System.out.println(" Valid Date ");
						else
							System.out.println("Enter Valid Date ");
					}
					else if(mm==2 && !(yy%4==0 && yy%100!=0 || yy%400==0))
					{
						if(dd<=28)
							System.out.println(" Valid Date ");
						else
							System.out.println("Enter Valid Date ");
					}	

				}
				else
					System.out.println("Enter Valid Date ");
			}
			else
				System.out.println("Enter Valid Month");
		}
		else
			System.out.println("Enter Valid Year");
		
	}
}