
import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		int old=0;
		int newd=1;
		for(int i=1;i<=num;i++)
		{
			int n=i;
			int n1=i;
			int count=0;
			int result=0;

			while(n!=0)
			{
				n/=10;
				count++;
			}

			while(n1!=0)
			{
				int r= n1%10;
				int a=1;
				for(int j=1;j<=count;j++)
					a*=r;
				result+=a;
				n1 /=10;
			}
			
		for(int k=1;k<=10;k++)
		{
			if(k==count)
			{

				if(result==i)
				{
					newd=k;
					if(newd>old)
					{
						System.out.println(k+" digit");
						old= newd;
					}
					System.out.println(i);
				}
			}
		}
		
		}

	}
}