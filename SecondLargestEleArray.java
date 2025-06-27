class SecondLargestEleArray
{
	public static void main(String[] args) {
		int[]arr={10,99,89,59,61,24,35,50,28,241,561,654,846};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		for(int ele : arr)
		{
			smax= ele>max ? max: (ele>smax? ele: smax);
			max=ele>max?ele:max;
		}
		System.out.println(smax);
	}
}