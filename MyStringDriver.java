import java.util.Arrays;
class MyStringIndexOutOfBoundsException extends RuntimeException
{
	public MyStringIndexOutOfBoundsException(String message)
	{
		super(message);
	}
}
class MyString
{
	char[] arr;
	public MyString()
	{
		super();
		arr= new char[0];
	}

	public MyString(String str)
	{
		super();
		arr= new char[str.length()];
		for(int i=0;i<str.length();i++)
			arr[i]=str.charAt(i);
	}

	public MyString(StringBuffer sb)
	{
		this(sb.toString());
	}

	public MyString(StringBuilder sb)
	{
		this(sb.toString());
	}

	public MyString(char [] arr)
	{
		this(arr,0,arr.length);		
	}
	public MyString(char[] arr ,int start, int count)
	{
		super();
		if((start+count)>arr.length)
			throw new MyStringIndexOutOfBoundsException(" Range ["+ start +","+start +"+" +count+") out of bounds for length "+arr.length);
		this.arr= new char[count];
		for(int i=start,j=0;i<(start+count);i++)
			this.arr[j++]=arr[i];
	}

	@Override
	public String toString()
	{
		String str="";
		for(char ele : arr) str+=ele;
		return str;
	}

	public int length()
	{
		return arr.length;
	}

	public char charAt(int index)
	{
		if(index<0|| index >= arr.length)
			throw new MyStringIndexOutOfBoundsException("Index "+index +" out of bounds for length "+arr.length);
		return arr[index];
	}

	public int codePointAt(int index)
	{
		if(index<0 || index >= arr.length)
			throw new MyStringIndexOutOfBoundsException("Index "+index +" out of bounds for length "+arr.length);
		return (int)arr[index];
	}

	public int codePointBefore(int index)
	{
		return codePointAt(index-1);
	}

	public int codePointCount(int start, int end)
	{
		
		if(start > end || start<0 || end<0 || start>=arr.length || end>= arr.length)
			throw new IndexOutOfBoundsException("Range ["+start +","+end +" ) out of bounds for length "+arr.length);
		return end-start;
	}

	@Override
	public boolean equals(Object obj)
	{
		MyString str= (MyString) obj;
		if(arr.length != str.length()) return false;
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=str.charAt(i)) return false;
		return true;
	}

	public int indexOf(int ch)
	{
		return indexOf(ch,0); 
	}

	public int indexOf(int ch, int start)
	{
		if(start<0 ) start=0;
		for(int i=start;i<arr.length;i++)
			if(arr[i]==ch) return i;
		return -1;
	}

	public int lastIndexOf(int ch)
	{
		int lastindex=-1;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==ch && lastindex< i) lastindex= i;
		return lastindex;
	}

	public MyString substring(int begin)
	{
		return substring(begin,arr.length);
	}

	public MyString substring(int begin,int end)
	{
		char[] ch= new char[end-begin];
		for(int i=begin;i<end;i++)
			ch[i]=arr[i];
		return new MyString(ch);
	}

	public MyString replace(char old, char newc)
	{
		char[] newArr= new char[arr.length];
		for(int i=0;i<arr.length;i++)
			newArr[i]=(arr[i]!=old) ?  arr[i] : newc ;
		return new MyString(newArr);
	}

	public char[] toCharArray()
	{
		char[] ch= new char[arr.length];
		for(int i=0;i<arr.length;i++)
			ch[i]=arr[i];
		return ch;
	}

	public MyString concat(MyString str)
	{
		char[] newArr= new char[arr.length+str.length()];
		for(int i=0,j=0;i<newArr.length;i++)
			newArr[i]=(i<arr.length) ? arr[i] : str.charAt(j);
		return new MyString(newArr);
	}

	public MyString toUpperCase(String str)
	{
		char[] ch= new char[str.length()];
		for(int i=0;i<ch.length;i++)
			ch[i]=(str.charAt(i)>=97 && str.charAt(i)<=122) ? (char)(str.charAt(i)-32) : str.charAt(i);
		return new MyString(ch);
	}

	public MyString toLowerCase(String str)
	{
		char[] ch= new char[str.length()];
		for(int i=0;i<ch.length;i++)
			ch[i]= (str.charAt(i)>=65 && str.charAt(i)<=90) ? (char)(str.charAt(i)+32) : str.charAt(i) ;
		return new MyString(ch);
	}

	public boolean contentEquals(StringBuffer sb)
	{
		MyString s1= new MyString(sb);
		return this.equals(s1);
	}

	public boolean equalsIgnoreCase(String str)
	{
		if(str.length()!= arr.length) return false;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!= str.charAt(i))
			{
				if((arr[i]<str.charAt(i)) && (arr[i]+32 != str.charAt(i))) return false;
				else if((arr[i]>str.charAt(i)) && (arr[i] != str.charAt(i)+32)) return false;
			}
		}
		return true;
	}

	public boolean startsWith(MyString prefix)
	{
		return startsWith(prefix, 0);
	}

	public boolean startsWith(MyString prefix,int offset)
	{
		if(prefix.length()>arr.length || offset >= arr.length) return false;
		for(int i=offset,j=0;i<prefix.length();i++) 
			if(arr[i]!=prefix.charAt(j++)) return false;
		return true;
	}

	public boolean endsWith(MyString suffix)
	{
		if(suffix.length()>arr.length) return false;
		for(int i=arr.length-suffix.length(),j=0;i<arr.length; i++)
			if(arr[i]!=suffix.charAt(j++)) return false;
		return true;
	}

}
class MyStringDriver
{
	public static void main(String[] args) {
		char [] arr= {'a','b','c','d'};
		String str= new String(arr);
		//System.out.println(str.endsWith("abcd"));
		MyString s= new MyString(arr);
		//System.out.println(s.endsWith("abcd"));
		//System.out.println(s.equalsIgnoreCase("Abcd"));
	}
}