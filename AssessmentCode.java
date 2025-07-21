import java.util.*;
class AssessmentCode
{
	public static void main(String[] args) {
		String [] [] paragraphs={{"hello","world"},{"How","areYou","doing"},{"Please","look","and","align","to","the","center"}};
		int width=16;
		
		ArrayList<String> op=solve(paragraphs,width);
		for (String ele : op ) 
		{
			System.out.println(ele);	
		}
	}
	private static ArrayList<String> solve(String[][] paragraphs, int width)
	{
		ArrayList<String> l= new ArrayList<>();
		String[] a= conversion(paragraphs);
		int sum=0;
		l.add("\"******************\"");
		int k=0;
		String b="\"*";
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(sum<16 && sum+a[i].length()+1<16)
			{
				sum+=a[i].length()+1;
				s+=a[i]+" ";
			}

			else 
			{

				int diff= 16-sum;
				int c=0;

				if(diff%2==0)
				{
					for(int j=0;j<diff/2;j++)
						b+=" ";
					for(int j=0;j<sum;j++)
						b+=s.charAt(j);	
					for(int j=0;j<diff/2;j++)
						b+=" ";
					b+="*\"";
				}
			l.add(b);
			sum=0;
			}
		}
		l.add("\"******************\"");
		return l;
	}
	private static String[] conversion(String[][] paragraphs)
	{
		int size=0;
		for (String[] ele : paragraphs ) 
		{
			size+=ele.length;	
		}
		String[] a= new String[size];
		int j=0,k=0;
		for(int i=0;i<size;i++)
		{
			if(j<paragraphs[k].length)
				a[i]=paragraphs[k][j++];
			else
			{
				k++;j=0;i--;
			}
		}
		return a;
	}
}