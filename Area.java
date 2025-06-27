import java.util.Scanner;
class Area
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Radius For Evaluating The Area Of That Circle:");
		float r= sc.nextFloat();
		float area= 3.14f*r*r;
		System.out.println("Area of Circle : "+area);


	}
}