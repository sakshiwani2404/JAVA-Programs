import java.util.Scanner;
class TCSExample
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] rgb= new int[3];
		for(int i=0;i<rgb.length;i++)
			rgb[i]=sc.nextInt();
		int count=findCount(rgb);

		if(rgb[0]>=3&&rgb[1]>=3 && rgb[2]>=3)
			count+=3;
		else
		{
			if(rgb[0]>1 && rgb[1]>1)
			{
				count++;
				rgb[0]--;
				rgb[1]--;
			}
			if(rgb[1]>1 && rgb[2]>1)
			{
				count++;
				rgb[1]--;
				rgb[2]--;
			}
			if(rgb[0]>1 && rgb[2]>1)
			{
				count++;
				rgb[0]--;
				rgb[2]--;
			}
		}
		System.out.println(count);
	}
	public static int findCount(int[] rgb)
	{
		int cnt=0;
		for(int i=0;i<rgb.length;i++)
			if(rgb[i]>0) cnt++;
		return cnt;
	}
}