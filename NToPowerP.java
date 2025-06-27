//to find n to the power of p
import java.util.Scanner;
class NToPowerP
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num= sc.nextInt();
		System.out.println("Enter the Power:");
		int pow= sc.nextInt();
		int result=1;
		while(pow>=1)
		{
			result*=num;
			pow--;
		}
		System.out.println("Result:"+result);
	}
}