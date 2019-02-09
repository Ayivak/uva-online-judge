import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main 
{

public static void main(String args[])throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    br.readLine();
    for(int i=0;i<t;i++)
    {
         Map<String,Integer> map =new TreeMap<>();
        String s;
        int c=0;
        while((s=br.readLine())!=null)
        {
            if(s.equals(""))
            {
                break;
            }
            if(map.containsKey(s))
            {
                int x=map.get(s);
                map.put(s,x+1);
            }
            else{
                map.put(s,1);
            }
            c++;
        }
            for(Map.Entry<String,Integer> j:map.entrySet())
                System.out.printf("%s %.4f\n",j.getKey(),j.getValue()*100.0/c);
            if(i<t-1)
            System.out.println();
        }
    }
}
