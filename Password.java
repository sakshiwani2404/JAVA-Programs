import java.util.Scanner;
class Password
{
	public static void main(String[] args) throws InterruptedException
	  {
		Scanner sc= new Scanner (System.in);
		int storedPin= 1234;
		int duration=5000;
		outerLoop:
		for(;;)
		{
			int attempt=3;
			do{
				System.out.println();
				System.out.println("Enter Your Pin:");
				int userPin= sc.nextInt();
				if(userPin==storedPin)
				{
					System.out.println("Phone Unlocked");
					break outerLoop;
				}
				else 
					System.out.println("Wrong Pin Entered");


				
				attempt--;
				System.out.println("Attempts Left:"+attempt);
			}while(attempt>=1);

			System.out.println();
			System.out.println("Phone is Been Locked For "+(duration/1000)+" Seconds");
			Thread.sleep(duration);
			duration*=2;
		}
	}
}