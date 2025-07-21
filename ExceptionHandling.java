class ExceptionHandling
{
	public static void main(String[] args) {
		try{
			System.out.println("try hello");
			System.out.println(10/0);
			System.out.println("java");
		}
		catch(ArithmeticException ae){
			System.out.println("ae");
		}
		catch(NullPointerException npe)
		{
			System.out.println("npe");
		}
	}
}