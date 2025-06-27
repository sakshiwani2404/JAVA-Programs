import java.util.Scanner;
public class Code1 {
    // public static long largestPrime(long n)
    // {
    //     long max=0;
    //     for(int i =2;i<=n;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             if(isPrime(i))
    //             {
    //                 if(max<i)
    //                     max=i;
    //             }
    //         }
    //     } 
    //     return max;
    
    // }
    public static boolean isPrime(long n)
    {
        if(n<2)
            return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            long n = in.nextLong();
           largestPrime(n);
        }
    }
    public static void largestPrime(long n)
    {
        for(long i=n; ;i-- )
        {
            if(isPrime(i) && (n%i==0))
            {
                System.out.println(i);
                return;
            }
        }
    }
}
