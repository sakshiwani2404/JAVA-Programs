import java.util.Scanner;
class LenzeCode
{
	public static void main(String[] args) 
	{
		System.out.println("Enter The Number with 0's :");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(updateto5(num));
	}
	public static int updateto5(int num)
	{
		int a=0;
		for(int i= num;i!=0;i/=10)
		{
			a=a*10+((i%10==0)?5:(i%10));
		}
		return reverse(a);
	}
	public static int reverse(int a)
	{
		int reverse1=0;
		for(int i=a;i!=0;i/=10)
		{
			reverse1=reverse1*10+(i%10);
		}
		return reverse1;

	}
	
}