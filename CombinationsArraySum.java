import java.util.*;
class TwoSum
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
		
		int[] op=new int[2][2];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]+arr[j]>max)
					{
						max=arr[i]+arr[j];
						int[][]op1={{arr[i],i},{arr[j],j}};
						op=op1;
					}
				}
				
			}
			System.out.println(Arrays.deepToString(op)+"     sum : "+max );
		}
	}
}