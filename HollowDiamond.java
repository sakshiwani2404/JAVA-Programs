import java.util.Scanner;
class HollowDiamond
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n+1;j<=i;j++)
				System.out.println("* ");
			//for(int j=5;j<=5-i)
		}
	}
}