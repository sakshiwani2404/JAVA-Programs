class LinearSearchRecurssion
{
	public static void main(String[] args) {
		int[] arr= new int[20];
		for(int i=0;i<arr.length;i++)
			arr[i]=i+1;
		int key=15;
		System.out.println(linearSearch(arr,key,0));
	}
	public static int linearSearch(int[] arr, int key,int i)
	{
		if(i==arr.length) return -1;
		if(arr[i]==key) return i;
		return linearSearch(arr,key,++i);

	}
}