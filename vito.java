import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            int t=in.nextInt();
            int a[]=new int[t];
            for(int i=0;i<t;i++)
            {
                a[i]=in.nextInt();
            }
            int p=Integer.MAX_VALUE;
            for(int y=0;y<t;y++)
            {
               int d=0;
                for(int u=y+1;u<t;u++)
                {
                d+=Math.abs(a[u]-a[y]);
                }
                 p=Math.min(d,p);
            }
           
            System.out.println(p);
        }
    }
}
