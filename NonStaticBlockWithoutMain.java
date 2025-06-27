class NonStaticBlockWithoutMain
{
	static NonStaticBlockWithoutMain obj = new NonStaticBlockWithoutMain();
	{
		System.out.println("Non-Static Block ");
		System.out.println(obj);
		m1();
		System.exit(0); 
	}
	public void m1()
	{
		System.out.println("Static Method ");
		System.out.println(obj);
	}
}