class DemoExample1
{
	public static void main(String[] args) throws InterruptedException {
		System.out.println("exe Starts");
		int ms=3000;
		System.out.println("main is going into sleeping state for "+ ms/1000+"sec");
		MyThread t1= new MyThread();
		t1.start();
		Thread.sleep(ms);
		System.out.println("main is out of sleeping state ");
		t1.interrupt();
		System.out.println("main exe ends ");
	}
}
class MyThread extends Thread{
	@Override
	public void run()
	{
		System.out.println("Thread Starts");
		try{
			Thread.sleep(7000);
		}
		catch(InterruptedException ie )
		{
			System.out.println("Interrupted exception handled");
		}
		System.out.println("Thread Ends");
	}
}