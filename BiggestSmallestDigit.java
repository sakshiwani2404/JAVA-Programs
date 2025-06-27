import java.util.Scanner;
class BiggestSmallestDigit
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= sc.nextInt();
		int big=num%10;
		int small=num%10;
		while(num!=0)
		{
			int r=num%10;
			if(r>big)
				big=r;
			if(r<small)
				small=r;
			num/=10;
		}
		System.out.println("Biggest Digit From the Given Number is :"+big);
		System.out.println("Smallest Digit From the Given Number is :"+small);
	}
}
