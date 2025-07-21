import java.util.*;
class IBMAssesmentCode
{
	public static void main(String[] args) {
		solve(new int[][] {{11,20},{9,19}});
	}
	public static void solve(int [][] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(findNonRepeatingDgts(arr[i]));
	}
	public static int findNonRepeatingDgts(int [] a1)
	{
		int count=0;
		for (int i=a1[0];i<=a1[1];i++ ) 
			if(isDistinct(i)) count++;
		return count;
	}
	public static boolean isDistinct(int num)
	{
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(int j=num;j!=0;j/=10)
				if(j%10==i) cnt++;
			if(cnt>1) return false;
		}
		return true;
	}
}