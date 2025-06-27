interface A
{
	default void m1()
		{
			System.out.println("interface A");
		}
}
interface B
{
	default void m1()
		{
			System.out.println("interface B");
		}
}
interface C extends A,B
{

}
class Child implements C{

}
class InterfaceExample
{
	public static void main(String[] args) 
	{
		Child c= new Child();
		c.m1();	
	}
}