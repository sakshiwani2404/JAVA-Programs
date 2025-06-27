import java.util.Arrays;
class ThreeDtoOneDArray
{
	public static void main(String[] args) {
		int [][][] arr={{{10,20},{30}},{{40,50,60}},{{70,80},{90,100}}};
		int size=0;
		for (int[][] a :arr ) 
		{
			for (int[] a1 : a )
			{
				size+=a1.length;	
			}
		}
		int [] result= new int[size];
		int indx=0;
	
		for (int[][] a :arr ) 
		{
			for (int[] a1 : a )
			{
				for(int ele : a1) result[indx++]=ele;	
			}
		}
		System.out.println(Arrays.toString(result));
	}
}