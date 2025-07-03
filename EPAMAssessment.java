class EPAMAssessment
{
	public static void main(String[] args) {
		int[] arr={16,17,4,3,5,2};
		findLeader(arr,0);
		System.out.println();
		int[] arr2={5,4,3,2,1};
		findLeader(arr2,0);
		System.out.println();
	}
	public static void findLeader(int[] arr,int i )
	{
		int max=Integer.MIN_VALUE;
		int indx=0;
		for(int j=i;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				indx=j;
			}
		}
		System.out.print(max + " ");
		if(indx+1<arr.length)
			findLeader(arr,indx+1);
	}
}