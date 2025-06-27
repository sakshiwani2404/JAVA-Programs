import java.util.Scanner;
class Example5
{
	public static void findClosestLess(int n,int m)
	{
		for(int i=n;i>=1;i--)
		{
			if(i%m==0)
			{
				System.out.println(i);
				return count;
			}
			count++;

		}
	}
	public static void findClosestMore(int n,int m)
	{
		for(int i=n;i>=1;i--)
		{
			if(i%m==0)
			{
				System.out.println(i);
				return count;
			}
			count++;

		}
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int m= sc.nextInt();
	int count1=findClosestLess(n,m);
	
	
}
}