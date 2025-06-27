import java.util.Arrays;
class ArraysExample
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4,5};
		System.out.println(arr);
		System.out.println("main() : "+Arrays.toString(arr));
		System.out.println();
		m1(arr);
		System.out.println();
		System.out.println(arr);
		System.out.println("main() : "+Arrays.toString(arr));
	}
	public static void m1(int[] arr)
	{
		System.out.println();
		arr[1]=10000;
		System.out.println(arr);
		System.out.println("m1() : "+Arrays.toString(arr));
	}
}
