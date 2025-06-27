//print 1-100 A-Z a-z
class LoopsExample
{
	public static void main(String[] args) {
		for (int i=1;i<=100;i++)
			System.out.print(i+" ");
		System.out.println();
		for(char ch='A'; ch<='Z';ch++)
			System.out.print(ch+" ");
		System.out.println();
		for(char ch='a'; ch<='z';ch++)
			System.out.print(ch+" ");


	}
}