import java.util.*;
class ThreeSum
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array to create : ");
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the "+(i+1)+" th Element : ");
			arr[i]=sc.nextInt();
		}
		
		int[][] op=new int[3][2];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(i!=j&& j!=k && k!=i)
					{
						if(arr[i]+arr[j]+arr[k]>max)
						{
							max=arr[i]+arr[j]+arr[k];
							int[][]op1={{arr[i],i},{arr[j],j},{arr[k],k}};
							op=op1;
						}
					}
				}
				
			}
		}
		System.out.println(Arrays.deepToString(op)+"     sum : "+max );
	}
}