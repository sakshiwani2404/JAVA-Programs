class ProdEle
{
	public static void main(String[] args) {
		int [] arr= new int[10];
		for(int i=0;i<arr.length;i++)
			arr[i]=i+1;
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			prod*=arr[i];
			System.out.println(prod);
		}
		System.out.println(prod);
	}
}