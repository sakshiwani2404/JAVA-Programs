//write a java program to take 3 no from user and find last digits of all no's then find the avg of all the last digits
import java.util.Scanner;
class Avgof3Rem
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Three Integer Numbers To Find Average of there Remainders :");
		System.out.print("Enter First Number :");
		int n1= sc.nextInt();
		System.out.print("Enter Second Number :");
		int n2= sc.nextInt();
		System.out.print("Enter Third Number:");
		int n3= sc.nextInt();
		int rem1=n1%10;
		System.out.println("Remainder of First Number:"+rem1);
		int rem2=n2%10;
		System.out.println("Remainder of Second Number:"+rem2);
		int rem3=n3%10;
		System.out.println("Remainder of Third Number:"+rem3);
		float avg= (rem1+rem2+rem3)/3;
		System.out.println("Average of Remainders of all 3 Nos. :"+avg);
	}
}