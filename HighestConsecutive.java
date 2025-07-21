import java.util.*;
class HighestConsecutive
{
	public static void main(String[] args) {
		int[] arr={1,1,0,0,0,1,1,1,1,0,0};
		System.out.println(Arrays.toString(arr));
		System.out.println(solve(arr));
	}
	public static int solve(int[] arr)
	{
		int max=0;
		int count=0;
		for (int i : arr ) 
		{
			if(i==1)
			{
				count++;
				if(count>max)
					max=count;
			}
			else 
				count=0;
		}
		return max;
	}
}