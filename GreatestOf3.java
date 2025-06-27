import java.util.Scanner;
class GreatestOf3
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1= sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2= sc.nextInt();
		System.out.println("Enter Third Number :");
		int num3= sc.nextInt();
		int big=num1;
		big=num2>num1? num2:num1;
		big=num3>big?num3:big;
		System.out.println("Greatest Number From the Given 3 Numbers is:"+big);
	}
}
