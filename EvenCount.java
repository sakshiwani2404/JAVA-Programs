//write a java program to take 4 int from the user and count how many even int are present then again find out 
//count is even or odd if count is even print good else print bad
import java.util.Scanner;
class EvenCount
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 4 Numbers to Find Even Count : ");
		System.out.print("Enter First Number: ");
		float n1= sc.nextFloat();
		System.out.print("Enter Second Number: ");
		float n2= sc.nextFloat();
		System.out.print("Enter Third Number: ");
		float n3= sc.nextFloat();
		System.out.print("Enter Fourth Number: ");
		float n4= sc.nextFloat();
		int count=0;
		if (n1%2==0)
		{
			System.out.println(n1+" is Even");
			count++;
		}
		if (n2%2==0)
		{
			System.out.println(n2+" is Even");
			count++;
		}
		if (n3%2==0)
		{
			System.out.println(n3+" is Even");
			count++;
		}
		if (n4%2==0)
		{
			System.out.println(n4+" is Even");
			count++;
		}

		System.out.println(count+" Numbers are Even Numbers from given 4 Numbers ");
		if (count%2==0)
			System.out.println("Good ");
		else
			System.out.println("Bad ");
	}
}