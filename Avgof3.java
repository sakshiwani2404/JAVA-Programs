import java.util.Scanner;
class Avgof3
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Three Integer Numbers To Find Average:");
		System.out.print("Enter First Number :");
		int n1= sc.nextInt();
		System.out.print("Enter Second Number :");
		int n2= sc.nextInt();
		System.out.print("Enter Third Number:");
		int n3= sc.nextInt();
		int avg= (n1+n2+n3)/3;
		System.out.println("Average :"+avg);

	}
}