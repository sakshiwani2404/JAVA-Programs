class SmallestEleOfArray
{
	public static void main(String[] args) {
		int[] arr={10,99,89,59,61,24,35,50,28,241,561,654,846};
		int min= Integer.MAX_VALUE;
		for(int ele:arr)
			min=min>ele?ele:min;
			System.out.println(min);
	}
}