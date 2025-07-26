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
		if(!(obj instanceof MyString)) return false;

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

	public MyString substring(int offset)
	{
		if(offse==0) return new MyString(arr);
		return substring(offset,arr.length);
	}

	public MyString substring(int begin,int end)
	{
		if(start>end || start<0 || end<0 || end>arr.length)
			throw new MyStringIndexOutOfBoundsException("Range [ "+begin+" , "+end+") out of bounds for length "+arr.length);
		char[] ch= new char[end-begin];
		for(int i=0;i<ch.length;i++)
			ch[i]=arr[begin++];
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
			newArr[i]=(i<arr.length) ? arr[i] : str.charAt(j++);
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
		return this.toLowerCase().equals(str.toLowerCase());
		// if(str.length()!= arr.length) return false;
		// for(int i=0;i<arr.length;i++) 
		// {
		// 	if(arr[i]!= str.charAt(i))
		// 	{
		// 		if((arr[i]<str.charAt(i)) && (arr[i]+32 != str.charAt(i))) return false;
		// 		else if((arr[i]>str.charAt(i)) && (arr[i] != str.charAt(i)+32)) return false;
		// 	}
		// }
		// return true;
	}

	public boolean startsWith(MyString prefix)
	{
		return startsWith(prefix, 0);
	}

	public boolean startsWith(MyString prefix,int offset)
	{
		if(prefix.length()>arr.length || prefix.length()> (arr.length-offset) || offset <0 || offset >=arr.length) return false;
		for(int i=0;i<prefix.length();i++) 
			if(arr[offset++]!=prefix.charAt(i)) return false;
		return true;
	}

	public boolean endsWith(MyString suffix)
	{
		if(suffix.length()>arr.length) return false;
		for(int i=arr.length-suffix.length(),j=0;i<arr.length; i++,j++)
			if(arr[i]!=suffix.charAt(j)) return false;
		return true;
	}

	public boolean contains(MyString str)
	{
		for(int i=0;i<arr.length- str.length();i++)
		{
			if(startsWith(str,i)) return true;
		}
		return false;
	}

	public MyString trim()
	{
		int left=0,right=0; 
		boolean flag1=false, flag2=false;

		for (int i=0,j=arr.length-1; i<arr.length ;i++,j-- ) 
		{
			if(arr[i]==' ' && !flag1) left++;
			else flag1=true;

			if(arr[j]==' '&& !flag2) right++;
			else flag2=true;

		}
		return substring(left,(arr.length)-right);
		// boolean flag=false;
		// String newStr = "";
		// outerLoop:
		// for(int i=0,j=0;i<arr.length;i++)
		// {
		// 	if(arr[i]!=32)
		// 	{
		// 		newStr+=arr[i];
		// 		flag= true;
		// 	}
		// 	else if(arr[i]==32 && flag)
		// 		newStr+=arr[i];

		// 	for(int k=i+1;k<arr.length;k++)
		// 	{
		// 		if(arr[k]!=32) break;
		// 		else if(k==arr.length-1) break outerLoop;
		// 	}	
		// } 
		// return new MyString(newStr);
	}

	public MyString[] split(MyString regex)
	{
		int count=0;
		for (int i=0;i<arr.length ;i++ ) 
			if(arr[i]==regex.charAt(0)) count++;
		MyString[] newArr= new MyString[count+1];
		int index=0;

		MyString str= new MyString();
		for(char ele : arr)
		{
			if(ele!=' ')
				str=str.concat(new MyString(ele +""));
			else{
				newArr[index++]=str;
				str=new MyString();
			}
		}	
		newArr[indx]=str;
		return newArr;
	}

	public MyString replaceFirst(MyString searchStr, MyString repStr)
	{
		MyString[] newArr= new MyString(arr).split(new MyString(" "));
		MyString op= new MyString();
		boolean flag=false;
		int indx=0;
		for(MyString ele : newArr)
		{	
			if(ele.equals(searchStr) && !flag)
			{
				newArr[indx]=repStr;
				flag= true;
			} 
			op=op.concat(new MyString(newArr[indx++]+" "));
		}
		return op.trim();
	}

	public MyString replaceAll(MyString searchStr, MyString repStr)
	{
		MyString[] newArr= new MyString(arr).split(new MyString(" "));
		MyString op= new MyString();
		int indx=0;
		for(MyString ele : newArr)
		{	
			if(ele.equals(searchStr)) newArr[indx]=repStr;
				op=op.concat(new MyString(newArr[indx++]+" "));
		}
		return op.trim();
	}

}
class MyStringDriver
{
	public static void main(String[] args) {
		char [] arr= {'a','b','c','d'};
		String str= new String("     Hello my name is Sakshi       ");
		System.out.println(str.trim().length());

		MyString s= new MyString("Hello my name is Sakshi       ");
		System.out.println(s.trim().length());
		System.out.println(s.startsWith(new MyString("hello"),s.length()-3));
	}
}