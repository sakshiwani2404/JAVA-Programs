import java.util.Scanner;
class DevelopersProgram
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int expected_load= sc.nextInt();
		int n= sc.nextInt();
		int [] server= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i);
			server[i]=sc.nextInt();
		}
		System.out.println(getMinServers(expected_load,server));
	}
	public static int getMinServers(int e, int[] server)
	{
		int minCnt=Integer.MAX_VALUE;
		for(int i=0;i<server.length;i++)
		{
			int sum=0,count=0;
			for(int j=i;j<server.length;j++)
			{

				count++;
				sum+=server[j];

				if(sum>= e) 
				{
					if(count<minCnt)
					{
						minCnt=count;
						break;
					}
				}
			}
			
		}
		return minCnt;
	}
}