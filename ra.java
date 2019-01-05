import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static long rn (long n) {
		long rev=0;
		while (n>0) {
			rev=rev*10+n%10;
			n/=10;
		}   
		return rev;
	}
	
	public static void main (String [] abc) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		for (int t=0;t<tc;t++) 
		{
			int r=0;
			long n=Long.parseLong(br.readLine());
			long rev=rn(n);
			while (n!=rev) {
				n+=rev;
				rev=rn(n);
				r++;
			}
			System.out.println(r+" "+n);
		}
	}
}


