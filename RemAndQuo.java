import java.util.Scanner;
class RemAndQuo
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number To Find Remainder And Quotient of it :");
		int num= sc.nextInt();
		int rem=num%10;
		int quo=num/10;
		System.out.print("Number :"+num);
	}
}