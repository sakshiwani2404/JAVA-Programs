import java.util.Arrays;
class BubbleSortRecurssion
{
	public static void main(String[] args) {
		int[] arr= {30,50,60,20,40,10};
		ascendingBubbleSort(0,arr);
		System.out.println(Arrays.toString(arr));
		descendingBubbleSort(0,arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void ascendingBubbleSort(int start, int[] arr)
	{
		if(start>=arr.length-1) return;
		findMin(start,start+1,arr );
		
		ascendingBubbleSort(++start,arr);
	}
	public static void findMin(int i,int j, int [] arr)
	{
		if(arr[i]>arr[j])
			arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
		if(j==arr.length-1)
			return ;	
		findMin(i,++j,  arr);
	}

	public static void descendingBubbleSort(int start, int[] arr)
	{
		if(start>=arr.length-1) return;
		
		findMax(start,start+1, arr );
		
		descendingBubbleSort(++start,arr);
	}
	public static void findMax(int i,int j, int [] arr)
	{
		if(arr[i]<arr[j])
			arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
		if(j==arr.length-1)
			return ;	
		findMax(i,++j, arr);
	}
	
}