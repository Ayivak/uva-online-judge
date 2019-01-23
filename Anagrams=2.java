import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

class Main {

	public static String getKey (String s) {
		char [] c=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   	HashMap<String,ArrayList<String>> dictionary=new HashMap<>();
	   	String s;
	   	ArrayList<String> vocabs=new ArrayList<>();
	   	int tc=Integer.parseInt(br.readLine());
	   	while(tc-->0)
	   	{
	   	    String temp1=br.readLine();
	   	int t=Integer.parseInt(br.readLine());
		while (t-->0) 
		{
		    s=br.readLine();
		    vocabs.add(s);
	   	}
	    for (int i=0;i<vocabs.size();i++) {
	    	String key=getKey(vocabs.get(i));
	    	ArrayList<String> list=dictionary.get(key);
	    	if (list==null) {
	    		list=new ArrayList<>();
	    		dictionary.put(key, list);
	    	}
	    	list.add(vocabs.get(i));
	    }


			} 
			else 
			{
			    System.out.println("No anagrams for: "+s);
			}
    	}
    	if(tc!=0)
    	{
    	    System.out.println();
    	}
    	vocabs.clear();
    	dictionary.clear();
	   	}
    }
	
}

