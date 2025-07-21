import java.util.*;

class RotateArray
{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
		System.out.println("Before : "+Arrays.toString(arr));
		System.out.println();
		outerLoop:
		for(; ;)
		{
			
			System.out.println(" 1. Clock Wise Rotation ");
			System.out.println(" 2. Anti Clock Wise Rotation ");
			System.out.print("Enter the Choice of Rotation :  ");
			int op= new Scanner(System.in).nextInt();
			System.out.println();
			System.out.print("Enter the no of rotations :  ");
			int rotation=new Scanner(System.in).nextInt();
			System.out.println();
			
			
			switch(op)
			{
			case 1:
				clockwiseRotation(arr,rotation);
				break;
			case 2: 
				antiClockwiseRotation(arr,rotation);
				break;
			default:
				System.out.println("Invalid Option ");
				break outerLoop;
			}
	
			System.out.println("After : "+Arrays.toString(arr));
			System.out.println();
		}
	}
	
	public static void clockwiseRotation(int[] arr, int rotation)
	{
		for (int i=1;i<=rotation; i++) 
		{
			int temp=arr[0];
			for(int j =1;j<arr.length;j++)
				arr[j-1]=arr[j];
			arr[arr.length-1]=temp;
		}
	}
	public static void antiClockwiseRotation(int[] arr, int rotation)
	{
		for (int i=1;i<=rotation; i++) 
		{
			int temp=arr[arr.length-1];
			for(int j =arr.length-1;j>0;j--)
				arr[j]=arr[j-1];
			arr[0]=temp;
		}
	}
}