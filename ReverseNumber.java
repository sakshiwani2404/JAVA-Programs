//to reverse a number
import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to be Reversed:");
		int num= sc.nextInt();
		int rev=0;
		while(num!=0)
		{
			int r = num%10;
			rev=rev*10+r;
			num/=10;
		}
		System.out.println("Reversed Number:"+rev);
	}
}