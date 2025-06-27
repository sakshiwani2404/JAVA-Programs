import java.util.Scanner;
class Solution1
 {
    public static boolean isPalindrome(int x) 
    {
        int rev=0;
        for(int i=x;i!=0;i/=10)
            rev= rev*10+i%10;
            
        if(x==rev)
            return true;
        else 
            return false;
    }
    public static void main(String[]args)
    {
        int num=new Scanner(System.in).nextInt();
        boolean pal= isPalindrome(num);
        System.out.println(pal);
    }
}