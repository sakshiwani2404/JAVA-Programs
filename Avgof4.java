//write a java program to take 4 int from the user and find avg of first 2 no and second 2 no then again find the avg of results
import java.util.Scanner;
class Avgof4
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 4 Numbers to Find Avg of First 2 And then Second 2 and then Avg of Results : ");
		System.out.print("Enter First Number: ");
		float n1= sc.nextFloat();
		System.out.print("Enter Second Number: ");
		float n2= sc.nextFloat();
		System.out.print("Enter Third Number: ");
		float n3= sc.nextFloat();
		System.out.print("Enter Fourth Number: ");
		float n4= sc.nextFloat();
		float avg1= (n1+n2)/2;
		System.out.println("Average of First 2 Numbers: "+avg1);
		float avg2= (n3+n4)/2;
		System.out.println("Average of Second 2 Numbers: "+avg2);
		float result= (avg1+avg2)/2;
		System.out.println("Average of Average First 2 Numbers And Average Of Second Two Numbers: "+ result);
	}
}