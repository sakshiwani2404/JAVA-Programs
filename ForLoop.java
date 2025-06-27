import java .util.Scanner;
class ForLoop {
    static Scanner sc= new Scanner(System.in);
    public static int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
                count++;
        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        int count=0;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                count++;
        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        int n= sc.nextInt();
        if(n<=5000000)
            System.out.println(countPrimes(n));

    }
}