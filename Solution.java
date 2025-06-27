import java.util.Scanner;
class Solution
{
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
             if (rev > (Integer.MAX_VALUE / 10) || (rev == Integer.MAX_VALUE / 10 && (num%10) > 7)) 
                return 0;
            
            if (rev < (Integer.MIN_VALUE / 10) || (rev == Integer.MIN_VALUE / 10 && (num%10) < -8)) 
                return 0; 
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
        
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        if(num>=-2147483638 && num<=2147483647)
            rev=reverse(num);
        
        System.out.println(rev);
    }
}