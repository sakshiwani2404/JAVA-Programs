class FactEle
{
	public static void main(String[] args) {
		int [] arr= {15,20,25,30,35,40,45,50};
		for(int ele : arr)
			System.out.println(ele+ " !: " +findFact(ele));
	}
	public static long findFact(int ele)
	{
		long fact=1;
		for(int i=1;i<=ele;i++)
			fact*=i;
		return fact;
	}
}