import java.io.*;
import java.util.*;
import java.lang.*;
 class Main 
 {
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         int t=in.nextInt();
         for(int i=0;i<t;i++)
         {
             int a=in.nextInt();
             int b=in.nextInt();
             int c=in.nextInt();
             boolean f=false;
             for(int x=-100;x<=100;x++)
             {
                 for(int y=-100;y<=100;y++)
                 {
                     for(int z=-100;z<=100;z++)
                     {
                         if(z!=y && y!=x && x!=z && x*x+y*y+z*z==c && x*y*z==b && x+y+z==a &&!f)
                         {
                             System.out.println(x+" "+y+" "+z);
                             f=true;
                         }
                     }
                 }
             }
             if(!f)
             {
                 System.out.println("No solution.");
             }
         }
     }
 }
