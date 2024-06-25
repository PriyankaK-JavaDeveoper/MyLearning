package com.stringfunctions;

public class StringDuplicateRemove {
public static void main(String[] args)
	{
	String s  = "pwewkew";
	System.out.println("Given String: "+s);
	int i=0,j=0,k=0;
	String[] str=new String[s.length()];
	str[0]=" "+s.charAt(0);
	for(i=0;i<(s.length()-1);i++)
	{
		for(j=i;j<(s.length()-1);j++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				//str[i]=str[i]+s.charAt(j);
				System.out.println(s.charAt(i)+" and "+s.charAt(j)+" not equal");
				//System.out.println("String Array print "+str[i]);
				//System.out.println("Not Equals: "+s.substring(i,j+1));
			}
			if(s.charAt(i)==s.charAt(j))
			{
				//System.out.println("Equals: "+s.substring(j+1,j+2));
				System.out.println(s.charAt(i)+" and "+s.charAt(j)+" equal");
			}
		}
	
	}
	/*for(char c:a)
	{
	System.out.print(c);	
	}*/
	}
}
