import java.util.Scanner;
class ShopkeeperSales
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of Items :");
		int n =sc.nextInt();
		System.out.println("Enter the Initial Amount : ");
		int k= sc.nextInt();
		int [] cost= new int[n];
		int[] sell = new int[n];
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter the Cost Price of "+(i+1)+"th item ");
			cost[i]=sc.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter the Selling Price of "+(i+1)+"th item ");
			sell[i]=sc.nextInt();
		}
		int[] prof= new int[cost.length];
		for(int i =0;i<n;i++)
			prof[i]=sell[i]-cost[i];

		System.out.println(findProfit(k,cost,sell,prof));
	}
	public static int findProfit(int k,int[] cost, int[] sell,int [] prof)
	{
		int sum=0,profit=0;

		for(int i : cost)
			sum+=i;
		for (int ele :prof )
				profit+=ele;

		return k+profit;
	}
	
}