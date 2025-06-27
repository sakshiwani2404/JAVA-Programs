import java.util.Scanner;
class Perimeter
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Radius For Evaluating The Perimeter Of That Circle:");
		float r= sc.nextFloat();
		float perimeter= 2*3.14f*r;
		System.out.println("Perimeter : "+perimeter);


	}
}