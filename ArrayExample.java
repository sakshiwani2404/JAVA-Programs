class ArrayExample
{
	public static void main(String[] args) {
		String[]arr= {"apple","banana","apple","cherry"};
		boolean[] b= new boolean[arr.length];
		int max=Integer.MIN_VALUE;
		String m="";
		for(int i=0;i<arr.length;i++)
		{
			if(b[i]) continue;
			int cnt=0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[i].equals(arr[j]) )&& !b[j])
				{
					cnt++;
					b[j]=true;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				m=arr[i];
			} 
		}
		System.out.println(m + " is repeating  : "+max +" times ");
	}
}