import java.util.Scanner;
class MinimumPossibleCost
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(minimizeCost(arr));
	}
	public static int minimizeCost(int[] arr)
	{
		int minCost=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			int[] dup= new int[arr.length];
			for(int k=0;k<dup.length;k++)
				dup[k]=arr[k];
			int cost=0;
			for(int j=0;j<arr.length;j++)
			{
				if(dup[j]==0) continue;
				if(dup[i]!=dup[j])
				{
					System.out.println(dup[j]);
					dup[i]+=dup[j];cost+=dup[i];
					dup[j]=0;
				}
			}
			if(cost<minCost)
				minCost=cost;

		}
		return minCost;
	}
}