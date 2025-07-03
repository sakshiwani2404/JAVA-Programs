class DemoExample
{
	@SuppressWarnings("removal")
	@Override
	public void finalize() throws Throwable
	{
		System.out.println("finalize starts");
		System.out.println("object destroyed");
		System.out.println(10/0);
		super.finalize();
		System.out.println("finalize ends ");
	}
	public static void main(String[] args) {
		System.out.println("main");
		DemoExample obj= new DemoExample();
		obj=null;
		System.gc();
		System.out.println("mainends");
	}
}