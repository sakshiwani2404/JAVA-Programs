class ReverseSpecialString
{
	public static void main(String[] args) {
		String str= new String("Ni@te_sh$");
		String s=new String("@_");
		System.out.println(reverse(str));
		System.out.println(reverse(s));
	}
	public static String reverse(String str)
	{
		char[] newChar= new char[str.length()];
		for(int i=0,j=str.length()-1;i<newChar.length;i++)
		{
			if(str.charAt(i)=='@' || str.charAt(i)=='_' || str.charAt(i)=='$')
				newChar[i]=str.charAt(i);
			else 
			{
				if(str.charAt(j)=='@' || str.charAt(j)=='_' || str.charAt(j)=='$')
				{
					j--;
				}	
				newChar[i]=str.charAt(j--);
			}
		}
		
		return new String(newChar);
	}
}