import java.util.Scanner;
class ArrayExample2
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Stocks : ");
		int stocks= sc.nextInt();
		int [] arr= new int[stocks];
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter the price of "+(i+1)+"th stock ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the k value for which to find Stock price : ");
		int k= sc.nextInt();
		bubbleSort(arr);
		System.out.println(arr[k-1]);
	}
	public static void bubbleSort(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]);
			}
		}
	}
}