class PatternMock
{
	/* 1
		3  2
		6	5	4
		10 9 8 7
		15 14 13 12 11
		*/
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			int a=2*i+i;
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
		
	}
	

}