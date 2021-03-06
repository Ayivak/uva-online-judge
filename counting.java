import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
        Scanner br=new Scanner(System.in);
    	int t=Integer.parseInt(br.nextLine());
    	while(t-->0)
    	{
    		String s=br.nextLine();
    		StringTokenizer st=new StringTokenizer(s,":");
    		int h=Integer.parseInt(st.nextToken());
    		int m=Integer.parseInt(st.nextToken());
    		while(true)
    		{
    			m=m+1;
    			if (m==60) 
    			{
    				m=0;
    				h=h+1;
    				if (h==24) 
    				{
    					h=0;
    				}
    			}
    			int check=h*100+m;
    			if (isPalindrome(String.valueOf(check))) 
    			{
    				StringBuilder sb=new StringBuilder();
    				if (h<10)
    				{
    					sb.append("0");
    				}
    				sb.append(h);
    				sb.append(":");
    				if (m<10) 
    				{
    					sb.append("0");
    				}
    				sb.append(m);
    				System.out.println(sb.toString());
    				break;
    			}
    		} 
    	}
    }
	
	public static boolean isPalindrome (String s) {
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
}
