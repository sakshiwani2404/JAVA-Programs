import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		if((num/2)*2==num)
			System.out.println(num+" is  a Even Number");
		else
			System.out.println(num+" is Odd Number");
	}
}