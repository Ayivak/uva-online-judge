import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=b.readLine()).equals("0 0"))
        {
            StringTokenizer st=new StringTokenizer(s);
            int m=Integer.parseInt(st.nextToken());
             int n=Integer.parseInt(st.nextToken());
             HashSet<String> a=new HashSet<>();
             for(int y=0;y<m;y++)
             a.add(b.readLine());
             int c=0;
             for(int u=0;u<n;u++)
             if(a.contains(b.readLine()))
             c++;
             System.out.println(c);
        }
    }
}