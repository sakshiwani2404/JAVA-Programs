import java.util.Scanner;
class AvgOfDigits
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= sc.nextInt();
		int sum=0;
		int count=0;
		while(num!=0)
		{
			int r=num%10;
			sum+=r;
			count++;
			num/=10;
		}
		int avg=sum/count;
		if(avg%2==0)
			System.out.println("Average of Digits Of Number is Even");
		else
			System.out.println("Average of Digits Of Number is Odd");
	}
}