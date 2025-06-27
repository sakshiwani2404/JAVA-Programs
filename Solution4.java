import java.util.*;
import java.io.*;

class Solution4
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prev=a;
            for(int j=0;j<n;j++)
            {
                int mul=1;
                for(int k=1;k<=j;k++){  
                    mul=mul*2;
                } 
                prev=prev+mul*b; 
                System.out.print(prev+" ");
                mul=1;
            }
            System.out.println();
        }
        
    }
}