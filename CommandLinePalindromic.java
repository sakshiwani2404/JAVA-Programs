class CommandLinePalindromic
{
	public static void main(String[] args)
	{
		for (String s : args ) 
		{
			int ele= Integer.parseInt(s);
			if(isPalindrome(ele))
				System.out.println(ele);
		}
		
	}
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		for(int i=num;i!=0;i/=10)
			rev=rev*10+i%10;
		return rev==num;
	}
}