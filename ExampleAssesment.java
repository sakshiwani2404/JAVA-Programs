import java.util.*;
class ExampleAssesment
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int chap=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		int[] arr=new int[98];
		for(int i=0;i<arr.length;i++)
			arr[i]=i%chap;
		//System.out.println(Arrays.toString(arr));
		System.out.println(countMissingChap(arr,chap,start,end));

	}
	public static int countMissingChap(int[] arr,int chap,int start,int end)
	{
		int count=0;
		for(int i=0;i<chap;i++)
		{
			for(int k=start;k<=end;k++)
			{
				if(arr[k]==i)
				{
					count++;
					break;
				}
			}
		}
		return count;
	}

}