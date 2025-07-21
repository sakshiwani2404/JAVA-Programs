import java.util.Arrays;
class CombinationsArray
{
	public static void main(String[] args) {
		int[] arr={10,20,30,40};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					int[][] a= new int[2][2];
					a[0][0]=arr[i];
					a[0][1]=i;
					a[1][0]=arr[j];
					a[1][1]=j;
					System.out.println(Arrays.deepToString(a));
				}
				
			}
			System.out.println();
		}
	}
}