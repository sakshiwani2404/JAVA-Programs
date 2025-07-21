import java.util.Arrays;
class SelectionSortRecursion
{
	public static void main(String[] args) {
		int[] arr= {30,50,60,20,40,10};
		ascendingSelectionSort(0,arr.length-1,arr);
		System.out.println(Arrays.toString(arr));
		descendingSelectionSort(0,arr.length-1,arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void ascendingSelectionSort(int start, int end , int[] arr)
	{
		if(start>=end) return;
		int min=start;
		min=findMin(start+1, arr.length-1 , arr ,min );
		arr[min]=arr[start]+arr[min]-(arr[start]=arr[min]);
		ascendingSelectionSort(++start,arr.length-1,arr);
	}
	public static int findMin(int start, int end, int [] arr, int min)
	{
		if(arr[min]>arr[start])
			min=start;
		if(start==end)
			return min;	
		return findMin(++start, end, arr, min);
	}

	public static void descendingSelectionSort(int start, int end , int[] arr)
	{
		if(start>=end) return;
		int max=start;
		max=findMax(start+1, arr.length-1 , arr ,max );
		arr[max]=arr[start]+arr[max]-(arr[start]=arr[max]);
		descendingSelectionSort(++start,arr.length-1,arr);
	}
	public static int findMax(int start, int end, int [] arr, int max)
	{
		if(arr[max]<arr[start])
			max=start;
		if(start==end)
			return max;	
		return findMax(++start, end, arr, max);
	}


}