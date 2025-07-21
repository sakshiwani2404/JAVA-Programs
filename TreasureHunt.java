class TreasureHunt
{
	public static void main(String[] args) 
	{
		int [] arr={4,5,6,2,10};
		int sum=0;
		for(int i=1;i<arr.length;i+=2)
		{
			if(isPrime(arr[i]))
				sum+=arr[i];
		}
		System.out.println(sum);
	}
	public static boolean isPrime(int n)
	{
		if(n<2) return false;
		for(int i=2;i*i<=n;i++)
			if(n%i==0) return false;
		return true;
	}
}