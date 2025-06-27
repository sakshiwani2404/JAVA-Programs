import java.util.Scanner;
class CountEvenOddDigit
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= sc.nextInt();
		int ce=0;
		int co=0;
		while(num!=0)
		{
			int r=num%10;
			if(r%2==0)
				ce++;
			else
				co++;
			num/=10;
		}
		System.out.println("Count of Even Digits From Given Number is:"+ce);
		System.out.println("Count of Odd Digits From Given Number is:"+co);
	}
}
