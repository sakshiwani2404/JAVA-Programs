//to take 3 different int and print it in ascending order
import java.util.Scanner;
class AscendingOrder
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a= sc.nextInt();
		System.out.println("Enter Second Number:");
		int b= sc.nextInt();
		System.out.println("Enter Third Number:");
		int c= sc.nextInt();

		int big=a>b?a:b;
		big=big>c?big:c;

		int small=a<b?a:b;
		small=small<c?small:c;

		int mid=(a+b+c)-(big+small);//only way to find middle number without sorting
		System.out.println("Smallest: "+small +" Middle :"+ mid+" Biggest :" + big);
	}
}