class ReverseWordsInString
{
	public static void main(String[] args) {
		String str="I Love India";
		String[] arr= str.split(" ");
		String op="";
		for(String ele : arr)
			op+=reverse(ele)+" ";
		System.out.println(str);
		System.out.println(op.trim());
	}
	public static String reverse(String str)
	{
		String op="";
		for(int i=0,j=str.length()-1;i<str.length();i++)
		{
			op+=str.charAt(j--);
		}
		return op;
	}
}