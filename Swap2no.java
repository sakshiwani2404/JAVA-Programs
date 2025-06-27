import java.util.Scanner;
class Swap2no
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers To be Swapped:");
		System.out.print("Enter First Number :");
		int n1= sc.nextInt();
		System.out.print("Enter Second Number :");
		int n2= sc.nextInt();
		System.out.println("Before  Swapping :");
		System.out.println("Num1 :"+n1);
		System.out.println("Num2 :"+n2);
		n2= n1+n2-(n1=n2);
		System.out.println("After  Swapping :");
		System.out.println("Num1 :"+n1);
		System.out.println("Num2 :"+n2);


	}
}