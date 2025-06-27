class MinRepeatingEleArray
{
	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,5,6,7};
		boolean[] b=new boolean[arr.length];
		int mcnt=Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
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
			if(cnt<mcnt) 
			{
				mcnt=cnt ;
				min=arr[i];
			}
		}
		System.out.println(min +" is repeating "+ mcnt +" times");
	}
}