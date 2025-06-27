import java.util.Arrays;
class ArrayMerging
{
	public static void main(String[] args) {
		int[]a={10,20,30,40,50};
		int [] b={60,70,80};
		int[]c= new int[a.length + b.length];
		for (int i=0 ;i<c.length ; i++) 
		{
			if(i<a.length) c[i]=a[i];
			else c[i]=b[i-a.length];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}
}