abstract class Parent
{
	abstract void m1();
	abstract void m2();
}
abstract class ChildA extends Parent
{
	void m1()
	{
		System.out.println("m1() implemented by ChildA");
	}

}
abstract class ChildB extends Parent
{
	void m1()
	{
		System.out.println("m1() implemented by ChildB");
	}
	void m2()
	{
		System.out.println("m2() implemented by ChildB");
	}
	abstract void m3();
}
class GrandChildA extends ChildA
{
	void m2()
	{
		System.out.println("m2() implemented by GrandChildA");
	}

}
class GrandChildB extends ChildB
{
	void m3()
	{
		System.out.println("m3() implemented by GrandChildB");
	}

}
abstract class GrandChildC extends ChildB
{

}
class ExampleA extends GrandChildC
{
	void m3()
	{
		System.out.println("m3() implemented by ExampleA");
	}

}
class AbstractionExample
{
	public static void main(String[] args) 
	{
		Parent obj = new GrandChildA();
		obj.m1();
		obj.m2();
		ChildB obj1= new GrandChildB();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		ChildB obj2= new ExampleA();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}