//Write java program to find special 2 digit number    ex-59
import java.util.Scanner;
class Example
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 2 Digit Number :");
		int num= sc.nextInt();
		if (num>9 && num<100)
		{
			int num1=num%10;
			int num2=num/10;
			if(num1+num2+num1*num2==num)
				System.out.println(num+" is a Special 2 Digit Number");
			else
				System.out.println(num+" is not a Special 2 Digit Number");
		}
		else
			System.out.println(num+" is not a 2 Digit Number");
	}
}