import java.util.*;
class IBMAssesmentCode
{
	public static void main(String[] args) {
		solve(new int[][] {{11,20},{9,19}});
	}
	public static void solve(int [][] arr)
	{
		//int[] cnt=new int[arr.length];
		for(int i=0;i<arr.length;i++)
			System.out.println(findNonRepeatingDgts(arr[i]));
	}
	public static int findNonRepeatingDgts(int [] a1)
	{
		int cnt=0;
		for (int i=a1[0];i<=a1[1];i++ ) 
		{
			for(int j=0;j<=9;j++)
			{
				int cnt=0;
				for(int l=i;l!=0;l/=10)
				{
				
				}
			}
		}
		return cnt;
	}
}