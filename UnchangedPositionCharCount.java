class UnchangedPositionCharCount
{
	public static void main(String[] args) {
		String str= new String("alphxxdida");
		System.out.println(solveCount(str));
	}
	public static int solveCount(String str)
	{
		String rev= reverse(str);
		int count=0;
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)==rev.charAt(i)) count++;
		return count;
	}
	public static String reverse(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
			s=str.charAt(i)+s;
		return s;
	}
}