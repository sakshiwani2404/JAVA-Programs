class BinarySearchRecurssion
{
	public static void main(String[] args) 
	{
		int[] arr=new int[10];
		for(int i=0,j=10;i<arr.length;i++,j+=10)
			arr[i]=j;
		int key=15;
		int pos= binarySearch(arr,key,0,arr.length-1);
		System.out.println(pos);
	}
	public static int binarySearch(int[] arr, int key, int start, int end)
	{
		int mid=(start+end)/2;
		if(key<arr[mid] && start<=mid-1)
			return binarySearch(arr,key,start,mid-1);
		else if(key>arr[mid] && mid+1<=end)
			return binarySearch(arr,key,mid+1,end);
		else if(start==end && key!=arr[mid])
			return -1;
		return mid;
	}
}