import java.util.Arrays;
class ZeroShifting
{
	public static void main(String[] args) {
		int[] arr={0,0,1};

		for(int i=0,j=arr.length-1;i<j; )
		{
			if(arr[i]==0)
			{
				for(int k=i; k<j;k++)
					arr[k]=arr[k+1];
				arr[j--]=0;
			}
			if(arr[i]!=0)
				i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}