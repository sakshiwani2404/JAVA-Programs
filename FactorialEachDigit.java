import java.util.Scanner;
class FactorialEachDigit
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= sc.nextInt();
		int i=1;
		
		while(num!=0)
		{
			int r=num%10;
			int factorial=1;
			for(int j=1;j<=r;j++)
				factorial*=j;
			System.out.println("Factorial Of "+r+"is: "+factorial);
			num/=10;

		}
	}
}