import java.util.Scanner;
class CharArrayOperations
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str= sc.next();
		outerLoop:
		for(;;)
		{
			System.out.println("Enter an Option :");
			System.out.println("1. Find Frequency Of Char In A String ");
			System.out.println("2. Find 1st Non-Repeating Character in String ");
			System.out.println("3. Find the Highest Repeating Character in String ");
			System.out.println("4. Find the Least Repeating Character in String ");
			System.out.println("5. Remove all Duplicate Character from String");
			System.out.println("6. Find the Repeating Characters from String");
			int op= sc.nextInt();
			switch(op)
			{
			case 1: 
				findFrequency(str);
				break;
			case 2:
				firstNonRepeating(str);
				break;
			case 3:
				highestRepeating(str);
				break;
			case 4: 
				leastRepeating(str);
				break;
			case 5:
				removeDuplicates(str);
				break;
			case 6: 
				repeatingCharacters(str);
				break;
			default : 
				System.out.println("Invalid Option ");
				break outerLoop;
			}
		}
	}
	public static void findFrequency(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];

		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			System.out.println(c[i]+" : "+count );
		}
	}
	public static void firstNonRepeating(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];

		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count==1)
			{
				System.out.println(c[i]);break;
			}
		}
	}
	public static void highestRepeating(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];
		int max=0;
		char maxEle=' ';
		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count>max)
			{
				max=count;
				maxEle=c[i];
			}
		}
		System.out.println(maxEle +" occured in String for "+max +" times ");
	}
	public static void leastRepeating(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];
		int min=Integer.MAX_VALUE;
		char minEle=' ';
		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count<min)
			{
				min=count;
				minEle=c[i];
			}
		}
		System.out.println(minEle +" occured in String for "+min +" times ");
	}
	public static void removeDuplicates(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];

		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			System.out.print(c[i]+" " );
		}
	}
	public static void repeatingCharacters(String str)
	{
		char [] c= toCharArray(str);
		boolean[] b= new boolean[c.length];

		for(int i=0;i<c.length;i++)
		{
			if(b[i]) continue;
			int count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j]&& !b[j])
				{
					count++;
					b[j]=true;
				}
			}
			if(count >1)
				System.out.print(c[i]+"  ");
		}
	}
	public static char[] toCharArray(String str)
	{
		char[] arr=new char[str.length()];
		for(int i=0;i<arr.length;i++)
			arr[i]=str.charAt(i);
		return arr;
	}
}