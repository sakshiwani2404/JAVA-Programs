class EvenOddUsingArrays
{
	public static void main(String[] args) {
		System.out.print("Enter a Number to be Checked Even Or Odd : ");
		int n=new java.util.Scanner(System.in).nextInt();
		String[] res={"Even", "Odd"};
		System.out.println(res[n%2]);

	}
}