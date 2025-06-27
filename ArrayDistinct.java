class ArrayDistinct
{
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,5,6,7};
		boolean[] b=new boolean[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			if(b[i]) continue;
			int cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&& !b[j])
				{
					cnt++;
					b[j]=true;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}