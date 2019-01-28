import java.io.*;
import java.util.*;
import java.util.LinkedList;
class Main
{
    public static void main(String args[]) throws IOException
    
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=b.readLine())!=null)
        {
            LinkedList<Character>a=new LinkedList<>();
            int p=0;
            for(char c : s.toCharArray())
            {
             if(c=='[')
             p=0;
             else if(c==']')
             p=a.size();
             else
               a.add(p++,c);
            }
        
            StringBuilder d=new StringBuilder();
            for(char c : a)
            d.append(c);
            System.out.println(d.toString());
    }
    }
}

